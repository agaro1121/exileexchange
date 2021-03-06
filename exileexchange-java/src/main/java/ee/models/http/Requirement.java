package ee.models.http;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Requirement {


  @JsonProperty("name")
  private String name;


  @JsonProperty("values")
  private List<List<String>> values = null;

  @JsonProperty("displayMode")
  private Long displayMode;


  @JsonIgnore
  private Map<String, Object> additionalProperties = new HashMap<String, Object>();

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this);
  }

}
