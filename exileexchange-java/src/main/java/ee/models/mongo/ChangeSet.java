package ee.models.mongo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@SuppressWarnings(value = "unused")
@Document(collection = "changeSets")
@AllArgsConstructor
public class ChangeSet {

  @Field("currentChangeId")
  @Getter private final String currentChangeId;

  @Field("nextChangeId")
  @Getter private final String nextChangeId;

  @Field("timestamp")
  @Getter private final Date timestamp;

  @Field("added")
  @Getter private final int added;

  @Field("removed")
  @Getter private final int removed;

  @Field("ignored")
  @Getter private final int ignored;

  @Field("processed")
  @Getter private final int processed;

  @Override
  public String toString() {
    return ReflectionToStringBuilder.toString(this);
  }
}
