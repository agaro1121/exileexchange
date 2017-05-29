package ee.processors.modifiers;

import ee.models.processing.ItemBaseType;
import ee.models.processing.Modifier;
import ee.processors.modifiers.implicit.*;

import java.util.*;

import static ee.models.processing.ItemBaseType.*;

public class ImplicitModifierProcessor extends ModifierProcessor {

  private static final Map<ItemBaseType, Set<AffixProcessor>> weaponModifierProcessors;
  private static final Map<ItemBaseType, Set<AffixProcessor>> equipmentModifierProcessors;
  private static final Map<ItemBaseType, Set<AffixProcessor>> accessoryModifierProcessors;
  private static final Map<ItemBaseType, Set<AffixProcessor>> implicitModifierProcessors;

  static {
    weaponModifierProcessors = new HashMap<ItemBaseType, Set<AffixProcessor>>() {{
      put(OneHandMeleeWeapon, new HashSet<AffixProcessor>() {{
        add(new OneHandMeleeImplicitProcessor());
      }});
      put(OneHandRangedWeapon, new HashSet<AffixProcessor>() {{
        add(new OneHandRangedImplicitProcessor());
      }});
      put(TwoHandMeleeWeapon, new HashSet<AffixProcessor>() {{
        add(new TwoHandMeleeImplicitProcessor());
      }});
      put(TwoHandRangedWeapon, new HashSet<AffixProcessor>() {{
        add(new TwoHandRangedImplicitProcessor());
      }});
    }};
  }
  static {
    equipmentModifierProcessors = new HashMap<ItemBaseType, Set<AffixProcessor>>() {{
      put(Armour, new HashSet<AffixProcessor>() {{
        add(new ArmourImplicitProcessor());
      }});
      put(Evasion, new HashSet<AffixProcessor>() {{
        add(new EvasionImplicitProcessor());
      }});
      put(EnergyShield, new HashSet<AffixProcessor>() {{
        add(new EnergyShieldImplicitProcessor());
      }});
      put(ArmourEvasion, new HashSet<AffixProcessor>() {{
        add(new ArmourEvasionImplicitProcessor());
      }});
      put(ArmourEnergyShield, new HashSet<AffixProcessor>() {{
        add(new ArmourEnergyShieldImplicitProcessor());
      }});
      put(EvasionEnergyShield, new HashSet<AffixProcessor>() {{
        add(new EvasionEnergyShieldImplicitProcessor());
      }});
    }};
  }
  static {
    accessoryModifierProcessors = new HashMap<ItemBaseType, Set<AffixProcessor>>() {{
      put(Ring, new HashSet<AffixProcessor>() {{
        add(new RingImplicitProcessor());
      }});
      put(Amulet, new HashSet<AffixProcessor>() {{
        add(new AmuletImplicitProcessor());
      }});
      put(Belt, new HashSet<AffixProcessor>() {{
        add(new BeltImplicitProcessor());
      }});
    }};
  }

  static {
    implicitModifierProcessors = new HashMap<ItemBaseType, Set<AffixProcessor>>() {{
      putAll(weaponModifierProcessors);
      putAll(equipmentModifierProcessors);
      putAll(accessoryModifierProcessors);
    }};
  }

  public ImplicitModifierProcessor() {
    super(implicitModifierProcessors);
  }

  public List<Modifier> process(final ItemBaseType itemBaseType, int itemLevel, final List<String> modifiers) {
    return super.process(itemBaseType, itemLevel, modifiers);
  }

}
