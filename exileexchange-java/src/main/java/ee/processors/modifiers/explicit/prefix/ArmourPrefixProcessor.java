package ee.processors.modifiers.explicit.prefix;

import ee.models.mongo.ModifierType;
import ee.models.mongo.Range;
import ee.models.processing.Modifier;
import ee.processors.modifiers.AffixProcessor;

import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;
import java.util.regex.Pattern;

import static ee.models.mongo.ModifierTier.*;
import static ee.models.mongo.ModifierType.Explicit;
import static ee.models.mongo.ModifierType.Prefix;

public class ArmourPrefixProcessor extends AffixProcessor {

  private static final TreeSet<Modifier> addsPhysicalDamagePrefix;

  private static final TreeSet<Modifier> addsLightningDamagePrefix;

  private static final HashMap<Pattern, TreeSet<Modifier>> prefixes;

  static {
    addsPhysicalDamagePrefix = new TreeSet<Modifier>() {{
      add(new Modifier(Pattern.compile("^Adds ([2][0-7]) to ([4][1-9]) Physical Damage$"),
          T1, new Range[]{new Range(20, 27), new Range(41, 49)},
          77, "Flaring", "Adds (20-27) to (41-49) Physical Damage",
          new ModifierType[]{Explicit, Prefix}));
      add(new Modifier(Pattern.compile("^Adds ([1][7-9]|[2][0-4]) to ([3][6-9]|[4][0-1]) Physical Damage$"),
          T2, new Range[]{new Range(17, 24), new Range(36, 41)},
          65, "Tempered", "Adds (17-24) to (36-41) Physical Damage",
          new ModifierType[]{Explicit, Prefix}));
    }};

    addsLightningDamagePrefix = new TreeSet<Modifier>() {{
      add(new Modifier(Pattern.compile("^Adds ([1]) to ([1]) Lightning Damage$"),
          T11, new Range[]{new Range(1, 1), new Range(1, 1)},
          1, "Derp", "Adds (1) to (1) Lightning Damage",
          new ModifierType[]{Explicit, Prefix}));
    }};

    prefixes = new HashMap<Pattern, TreeSet<Modifier>>() {{
      put(Pattern.compile("^Adds (\\d+) to (\\d+) Physical Damage$"), addsPhysicalDamagePrefix);
      put(Pattern.compile("^Adds (\\d+) to (\\d+) Lightning Damage$"), addsLightningDamagePrefix);
    }};
  }

  public ArmourPrefixProcessor() {
    super(prefixes);
  }

  public List<Modifier> getAffixes(int itemLevel, final List<String> modifiers) {
    return super.getAffixes(itemLevel, modifiers);
  }

}
