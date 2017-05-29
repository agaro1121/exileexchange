package ee.models.http;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Item {

  @JsonProperty("w")
  private Long w;

  @JsonProperty("h")
  private Long h;

  @JsonProperty("ilvl")
  private Long ilvl;

  @JsonProperty("icon")
  private String icon;

  @JsonProperty("league")
  private String league;

  @JsonProperty("itemId")
  private String itemId;

  @JsonProperty("sockets")
  private List<Socket> sockets = null;

  @JsonProperty("name")
  private String name;

  @JsonProperty("note")
  private String note;

  @JsonProperty("typeLine")
  private String typeLine;

  @JsonProperty("identified")
  private Boolean identified;

  @JsonProperty("corrupted")
  private Boolean corrupted;

  @JsonProperty("properties")
  private List<Property> properties = null;

  @JsonProperty("requirements")
  private List<Requirement> requirements = null;

  @JsonProperty("explicitMods")
  private List<String> explicitMods = null;

  @JsonProperty("frameType")
  private Long frameType;

  @JsonProperty("x")
  private Long x;

  @JsonProperty("y")
  private Long y;


  @JsonProperty("stackSize")
  private Long stackSize;


  @JsonProperty("maxStackSize")
  private Long maxStackSize;


  @JsonProperty("inventoryId")
  @JsonIgnore
  private String inventoryId;


  @JsonProperty("socketedItems")
  @JsonIgnore
  private List<Object> socketedItems = null;


  @JsonProperty("implicitMods")
  private List<String> implicitMods = null;


  @JsonProperty("craftedMods")
  private List<String> craftedMods = null;


  @JsonProperty("enchantMods")
  private List<String> enchantMods = null;


  @JsonProperty("flavourText")
  private List<String> flavourText = null;


  @JsonIgnore
  private Map<String, Object> additionalProperties = new HashMap<>();


  private String stashId;

  private Date timestamp;

  private String stashName;

  private String accountName;

  private String characterName;

  public void setStashId(String stashId) {
    this.stashId = stashId;
  }

  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }

  public void setStashName(String stashName) {
    this.stashName = stashName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public void setCharacterName(String characterName) {
    this.characterName = characterName;
  }

  public String getNote() {
    return note;
  }

  public String getTypeLine() {
    return typeLine;
  }

  public void setTypeLine(String typeLine) {
    this.typeLine = typeLine;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLeague() {
    return league;
  }

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this);
  }

  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return this.additionalProperties;
  }

  @JsonAnySetter
  public void setAdditionalProperty(String name, Object value) {
    this.additionalProperties.put(name, value);
  }
}
