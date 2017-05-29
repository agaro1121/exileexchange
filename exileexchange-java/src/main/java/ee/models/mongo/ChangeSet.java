package ee.models.mongo;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@SuppressWarnings(value = "unused")
@Document(collection = "changeSets")
public class ChangeSet {

  @Field("currentChangeId")
  private final String currentChangeId;

  @Field("nextChangeId")
  private final String nextChangeId;

  @Field("timestamp")
  private final Date timestamp;

  @Field("added")
  private final int added;

  @Field("removed")
  private final int removed;

  @Field("ignored")
  private final int ignored;

  @Field("processed")
  private final int processed;

  public ChangeSet(final String currentChangeId, final String nextChangeId, final Date timestamp, final int added,
                   final int removed, final int ignored, final int processed) {
    this.currentChangeId = currentChangeId;
    this.nextChangeId = nextChangeId;
    this.timestamp = timestamp;
    this.added = added;
    this.removed = removed;
    this.ignored = ignored;
    this.processed = processed;
  }

  public String getCurrentChangeId() {
    return currentChangeId;
  }

  public String getNextChangeId() {
    return nextChangeId;
  }

  public Date getTimestamp() {
    return timestamp;
  }

  public int getAdded() {
    return added;
  }

  public int getRemoved() {
    return removed;
  }

  public int getIgnored() {
    return ignored;
  }

  public int getProcessed() {
    return processed;
  }

  @Override
  public String toString() {
    return ReflectionToStringBuilder.toString(this);
  }
}
