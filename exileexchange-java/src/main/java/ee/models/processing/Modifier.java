package ee.models.processing;

import ee.models.mongo.ModifierTier;
import ee.models.mongo.ModifierType;
import ee.models.mongo.Range;
import lombok.Value;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.apache.commons.lang3.builder.ToStringStyle.JSON_STYLE;
import static org.apache.commons.lang3.builder.ToStringStyle.MULTI_LINE_STYLE;

@Value
public class Modifier implements Comparable<Modifier> {

    Pattern modifierPattern;
    ModifierTier modifierTier;
    Range[] rollRange;
    int minimumLevel;
    String modifierName;
    String modifierText;
    ModifierType[] modifierType;


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
