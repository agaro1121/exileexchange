package ee.processors.modifiers.explicit.suffix;

import ee.models.processing.Modifier;
import ee.processors.modifiers.AffixProcessor;

import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;
import java.util.regex.Pattern;

public class TwoHandMeleeSuffixProcessor extends AffixProcessor {

  private static final HashMap<Pattern, TreeSet<Modifier>> suffixes;

  static {
    suffixes = new HashMap<Pattern, TreeSet<Modifier>>() {{
      put(Pattern.compile("^Adds (\\d+) to (\\d+) Physical Damage$"), null);
      put(Pattern.compile("^Adds (\\d+) to (\\d+) Lightning Damage$"), null);
    }};
  }

  public TwoHandMeleeSuffixProcessor() {
    super(suffixes);
  }

  public List<Modifier> getAffixes(int itemLevel, final List<String> modifiers) {
    return super.getAffixes(itemLevel, modifiers);
  }

}
