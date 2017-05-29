package ee.models.http;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Stash {

  @JsonProperty("accountName")
  private String accountName;

  @JsonProperty("lastCharacterName")
  private String lastCharacterName;

  @JsonProperty("id")
  private String id;

  @JsonProperty("stash")
  private String stash;

  @JsonProperty("stashType")
  private String stashType;

  @JsonProperty("items")
  private List<Item> items = null;

  @JsonProperty("public")
  private Boolean _public;

  @JsonIgnore
  private Map<String, Object> additionalProperties = new HashMap<String, Object>();

  @JsonProperty("accountName")
  public String getAccountName() {
    return accountName;
  }

  @JsonProperty("lastCharacterName")
  public String getLastCharacterName() {
    return lastCharacterName;
  }

  @JsonProperty("id")
  public String getId() {
    return id;
  }

  @JsonProperty("stash")
  public String getStash() {
    return stash;
  }

  @JsonProperty("items")
  public List<Item> getItems() {
    return items;
  }

  @JsonProperty("public")
  public Boolean getPublic() {
    return _public;
  }

  @JsonProperty("public")
  public void setPublic(Boolean _public) {
    this._public = _public;
  }

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this);
  }

}
