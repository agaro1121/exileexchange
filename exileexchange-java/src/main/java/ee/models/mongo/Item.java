package ee.models.mongo;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@SuppressWarnings(value = "unused")
@Document(collection = "items")
public class Item {

  private String accountName;
  private String characterName;

  private String stashId;
  private String stashName;

  private String itemId;
  private String itemName;
  private String itemTypeLine;

  private String itemNote;

  private List<ItemProperty> itemProperties;
  private List<ItemRequirement> itemRequirements;

  private Object itemImplicitModifiers;
  private Object itemExplicitModifiers;
  private Object itemCraftedModifiers;
  private Object itemEnchantModifiers;
  
  public Item() {
  }

  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public String getCharacterName() {
    return characterName;
  }

  public void setCharacterName(String characterName) {
    this.characterName = characterName;
  }

  public String getStashId() {
    return stashId;
  }

  public void setStashId(String stashId) {
    this.stashId = stashId;
  }

  public String getStashName() {
    return stashName;
  }

  public void setStashName(String stashName) {
    this.stashName = stashName;
  }

  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public String getItemName() {
    return itemName;
  }

  public void setItemName(String itemName) {
    this.itemName = itemName;
  }

  public String getItemTypeLine() {
    return itemTypeLine;
  }

  public void setItemTypeLine(String itemTypeLine) {
    this.itemTypeLine = itemTypeLine;
  }

  public String getItemNote() {
    return itemNote;
  }

  public void setItemNote(String itemNote) {
    this.itemNote = itemNote;
  }

  public List<ItemProperty> getItemProperties() {
    return itemProperties;
  }

  public void setItemProperties(List<ItemProperty> itemProperties) {
    this.itemProperties = itemProperties;
  }

  public List<ItemRequirement> getItemRequirements() {
    return itemRequirements;
  }

  public void setItemRequirements(List<ItemRequirement> itemRequirements) {
    this.itemRequirements = itemRequirements;
  }

  public Object getItemImplicitModifiers() {
    return itemImplicitModifiers;
  }

  public void setItemImplicitModifiers(Object itemImplicitModifiers) {
    this.itemImplicitModifiers = itemImplicitModifiers;
  }

  public Object getItemExplicitModifiers() {
    return itemExplicitModifiers;
  }

  public void setItemExplicitModifiers(Object itemExplicitModifiers) {
    this.itemExplicitModifiers = itemExplicitModifiers;
  }

  public Object getItemCraftedModifiers() {
    return itemCraftedModifiers;
  }

  public void setItemCraftedModifiers(Object itemCraftedModifiers) {
    this.itemCraftedModifiers = itemCraftedModifiers;
  }

  public Object getItemEnchantModifiers() {
    return itemEnchantModifiers;
  }

  public void setItemEnchantModifiers(Object itemEnchantModifiers) {
    this.itemEnchantModifiers = itemEnchantModifiers;
  }
}
