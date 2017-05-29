package ee.processors.modifiers;

import ee.models.processing.ItemBaseType;
import ee.models.processing.Modifier;

import java.util.*;
import java.util.stream.Collectors;

public abstract class ModifierProcessor {

  private final Map<ItemBaseType, Set<AffixProcessor>> processors;

  public ModifierProcessor(Map<ItemBaseType, Set<AffixProcessor>> processors) {
    this.processors = processors;
  }

  public List<Modifier> process(final ItemBaseType itemBaseType, int itemLevel, final List<String> modifiers) {
    return processors.get(itemBaseType).stream().filter(Objects::nonNull)
        .map(affixProcessor -> affixProcessor.getAffixes(itemLevel, modifiers))
        .flatMap(Collection::stream).collect(Collectors.toList());
  }

}
