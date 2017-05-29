package ee.processors;

import ee.models.processing.ItemBaseType;
import ee.models.processing.Modifier;
import ee.processors.modifiers.ExplicitModifierProcessor;
import ee.processors.modifiers.ModifierProcessor;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class ModifierProcessorTest {

  private static ModifierProcessor explicitModifierProcessor;

  @BeforeClass
  public static void setup() {
    explicitModifierProcessor = new ExplicitModifierProcessor();
  }

  @Test
  public void test() {
    List<Modifier> matchingModifiers = explicitModifierProcessor
        .process(ItemBaseType.OneHandMeleeWeapon, 77, new ArrayList<String>() {{
          add("Adds 20 to 41 Physical Damage");
          add("Adds 1 to 1 Lightning Damage");
        }});
    assertTrue("3 matches", matchingModifiers.size() == 3);
  }


}
