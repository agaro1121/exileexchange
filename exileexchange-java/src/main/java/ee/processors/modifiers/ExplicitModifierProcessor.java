package ee.processors.modifiers;

import ee.models.processing.ItemBaseType;
import ee.models.processing.Modifier;
import ee.processors.modifiers.explicit.prefix.*;
import ee.processors.modifiers.explicit.suffix.*;

import java.util.*;

import static ee.models.processing.ItemBaseType.*;

public class ExplicitModifierProcessor extends ModifierProcessor {

  private static final Map<ItemBaseType, Set<AffixProcessor>> weaponModifierProcessors;
  private static final Map<ItemBaseType, Set<AffixProcessor>> equipmentModifierProcessors;
  private static final Map<ItemBaseType, Set<AffixProcessor>> accessoryModifierProcessors;
  private static final Map<ItemBaseType, Set<AffixProcessor>> explicitModifierProcessors;

  static {
    weaponModifierProcessors = new HashMap<ItemBaseType, Set<AffixProcessor>>() {{
      put(OneHandMeleeWeapon, new HashSet<AffixProcessor>() {{
        add(new OneHandMeleePrefixProcessor());
        add(new OneHandMeleeSuffixProcessor());
      }});
      put(OneHandRangedWeapon, new HashSet<AffixProcessor>() {{
        add(new OneHandRangedPrefixProcessor());
        add(new OneHandRangedSuffixProcessor());
      }});
      put(TwoHandMeleeWeapon, new HashSet<AffixProcessor>() {{
        add(new TwoHandMeleePrefixProcessor());
        add(new TwoHandMeleeSuffixProcessor());
      }});
      put(TwoHandRangedWeapon, new HashSet<AffixProcessor>() {{
        add(new TwoHandRangedPrefixProcessor());
        add(new TwoHandRangedSuffixProcessor());
      }});
    }};
  }

  static {
    equipmentModifierProcessors = new HashMap<ItemBaseType, Set<AffixProcessor>>() {{
      put(Armour, new HashSet<AffixProcessor>() {{
        add(new ArmourPrefixProcessor());
        add(new ArmourSuffixProcessor());
      }});
      put(Evasion, new HashSet<AffixProcessor>() {{
        add(new EvasionPrefixProcessor());
        add(new EvasionSuffixProcessor());
      }});
      put(EnergyShield, new HashSet<AffixProcessor>() {{
        add(new EnergyShieldPrefixProcessor());
        add(new EnergyShieldSuffixProcessor());
      }});
      put(ArmourEvasion, new HashSet<AffixProcessor>() {{
        add(new ArmourEvasionPrefixProcessor());
        add(new ArmourEvasionSuffixProcessor());
      }});
      put(ArmourEnergyShield, new HashSet<AffixProcessor>() {{
        add(new ArmourEnergyShieldPrefixProcessor());
        add(new ArmourEnergyShieldSuffixProcessor());
      }});
      put(EvasionEnergyShield, new HashSet<AffixProcessor>() {{
        add(new EvasionEnergyShieldPrefixProcessor());
        add(new EvasionEnergyShieldSuffixProcessor());
      }});
    }};
  }

  static {
    accessoryModifierProcessors = new HashMap<ItemBaseType, Set<AffixProcessor>>() {{
      put(Ring, new HashSet<AffixProcessor>() {{
        add(new RingPrefixProcessor());
        add(new RingSuffixProcessor());
      }});
      put(Amulet, new HashSet<AffixProcessor>() {{
        add(new AmuletPrefixProcessor());
        add(new AmuletSuffixProcessor());
      }});
      put(Belt, new HashSet<AffixProcessor>() {{
        add(new BeltPrefixProcessor());
        add(new BeltSuffixProcessor());
      }});
    }};
  }

  static {
    explicitModifierProcessors = new HashMap<ItemBaseType, Set<AffixProcessor>>() {{
      putAll(weaponModifierProcessors);
      putAll(equipmentModifierProcessors);
      putAll(accessoryModifierProcessors);
    }};
  }

  public ExplicitModifierProcessor() {
    super(explicitModifierProcessors);
  }

  public List<Modifier> process(final ItemBaseType itemBaseType, int itemLevel, final List<String> modifiers) {
    return super.process(itemBaseType, itemLevel, modifiers);
  }

}
