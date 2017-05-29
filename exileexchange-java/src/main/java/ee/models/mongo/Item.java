package ee.models.mongo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@SuppressWarnings(value = "unused")
@Document(collection = "items")
@NoArgsConstructor
public class Item {

  @Getter @Setter private String accountName;
  @Getter @Setter private String characterName;

  @Getter @Setter private String stashId;
  @Getter @Setter private String stashName;

  @Getter @Setter private String itemId;
  @Getter @Setter private String itemName;
  @Getter @Setter private String itemTypeLine;

  @Getter @Setter private String itemNote;

  @Getter @Setter private List<ItemProperty> itemProperties;
  @Getter @Setter private List<ItemRequirement> itemRequirements;

  @Getter @Setter private Object itemImplicitModifiers;
  @Getter @Setter private Object itemExplicitModifiers;
  @Getter @Setter private Object itemCraftedModifiers;
  @Getter @Setter private Object itemEnchantModifiers;

}
