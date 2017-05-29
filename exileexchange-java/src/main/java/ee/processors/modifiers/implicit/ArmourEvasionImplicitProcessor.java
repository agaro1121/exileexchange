package ee.processors.modifiers.implicit;

import ee.models.processing.Modifier;
import ee.processors.modifiers.AffixProcessor;

import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;
import java.util.regex.Pattern;

public class ArmourEvasionImplicitProcessor extends AffixProcessor {

  private static final HashMap<Pattern, TreeSet<Modifier>> implicits;

  static {
    implicits = new HashMap<Pattern, TreeSet<Modifier>>() {{
      put(Pattern.compile("^Adds (\\d+) to (\\d+) Physical Damage$"), null);
    }};
  }

  public ArmourEvasionImplicitProcessor() {
    super(implicits);
  }

  public List<Modifier> getAffixes(int itemLevel, final List<String> modifiers) {
    return super.getAffixes(itemLevel, modifiers);
  }

}
