package ee.models.processing;

import ee.models.mongo.ModifierTier;
import ee.models.mongo.ModifierType;
import ee.models.mongo.Range;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.apache.commons.lang3.builder.ToStringStyle.JSON_STYLE;
import static org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;

public class Modifier implements Comparable<Modifier> {

  private final Pattern modifierPattern;
  private final ModifierTier modifierTier;
  private final Range[] rollRange;
  private final int minimumLevel;
  private final String modifierName;
  private final String modifierText;
  private final ModifierType[] modifierType;

  public Modifier(final Pattern modifierPattern,
                  final ModifierTier modifierTier,
                  final Range[] rollRange,
                  final int minimumLevel,
                  final String modifierName,
                  final String modifierText,
                  final ModifierType[] modifierType) {
    this.modifierPattern = modifierPattern;
    this.modifierTier = modifierTier;
    this.rollRange = rollRange;
    this.minimumLevel = minimumLevel;
    this.modifierName = modifierName;
    this.modifierText = modifierText;
    this.modifierType = modifierType;
  }

  public boolean matches(final String textToMatch, final int itemLevel) {
    if (modifierPattern != null) {
      Matcher modifierMatcher = modifierPattern.matcher(textToMatch);
      return modifierMatcher.matches() && minimumLevel <= itemLevel;
    } else return false;
  }

  @Override
  public int compareTo(final Modifier other) {
    return this.modifierTier.compareTo(other.modifierTier);
  }

  @Override
  public String toString() {
    return ReflectionToStringBuilder.toString(this, JSON_STYLE);
  }

}
