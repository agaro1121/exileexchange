package ee.processors.modifiers;

import ee.models.processing.Modifier;

import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public abstract class AffixProcessor {

  private final HashMap<Pattern, TreeSet<Modifier>> affixes;

  public AffixProcessor(HashMap<Pattern, TreeSet<Modifier>> affixes) {
    this.affixes = affixes;
  }

  /*
   * 1. Iterate explicitModifiers
   * 2. Iterate oneHandPrefixes patterns for any which match an explicitModifier
   * 3. Iterate oneHandPrefixes.TreeSet<Prefix> to find specific match
   * 4. Return any/all matching oneHandPrefix modifiers, with proper level requirement
   */
  public List<Modifier> getAffixes(int itemLevel, final List<String> modifiers) {
    return modifiers.stream().map(modifier ->
        affixes.entrySet().stream()
            .filter(affixesEntrySet -> affixesEntrySet.getKey().matcher(modifier).matches() &&
                affixesEntrySet.getValue() != null &&
                affixesEntrySet.getValue().size() > 0)
            .map(Map.Entry::getValue)
            .map(affixTree -> affixTree.stream()
                .filter(affix -> affix.matches(modifier, itemLevel))
                .collect(Collectors.toList()))
            .collect(Collectors.toList()))
        .collect(Collectors.toList()).stream()
        .flatMap(Collection::stream)
        .flatMap(Collection::stream)
        .collect(Collectors.toList());
  }

  private boolean matchesAffixPattern(final String modifier) {
    return true;
  }

}
