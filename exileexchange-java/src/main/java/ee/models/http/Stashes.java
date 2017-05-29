package ee.models.http;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Stashes {

  @JsonProperty("next_change_id")
  private String nextChangeId;

  @JsonProperty("stashes")
  private List<Stash> stashes = null;

  @JsonIgnore
  private Map<String, Object> additionalProperties = new HashMap<>();

  @JsonProperty("next_change_id")
  public String getNextChangeId() {
    return nextChangeId;
  }

  @JsonProperty("stashes")
  public List<Stash> getStashes() {
    return stashes;
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
