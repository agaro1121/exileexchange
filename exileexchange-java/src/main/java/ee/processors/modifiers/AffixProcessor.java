package ee.processors.modifiers;

import ee.models.processing.Modifier;
import lombok.AllArgsConstructor;

import java.util.*;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

@AllArgsConstructor
public abstract class AffixProcessor {

    private final HashMap<Pattern, TreeSet<Modifier>> affixes;

  /*
   * 1. Iterate explicitModifiers
   * 2. Iterate oneHandPrefixes patterns for any which match an explicitModifier
   * 3. Iterate oneHandPrefixes.TreeSet<Prefix> to find specific match
   * 4. Return any/all matching oneHandPrefix modifiers, with proper level requirement
   */
    public List<Modifier> getAffixes(int itemLevel, final List<String> modifiers) {
        return modifiers.stream().flatMap(modifier ->
                affixes.entrySet().stream()
                        .filter(affixesEntrySet ->
                                affixesEntrySet.getKey().matcher(modifier).matches() &&
                                        null != affixesEntrySet.getValue()
                        )
                        .flatMap(affixTreeSet ->
                                affixTreeSet.getValue()
                                        .stream().filter(affix -> affix.matches(modifier, itemLevel))
                        )
        ).collect(Collectors.toList());
    }

    private boolean matchesAffixPattern(final String modifier) {
        return true;
    }

}
