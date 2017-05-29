package ee.models.mongo;

public class Range {

  private final double lowRoll;
  private final double highRoll;

  public Range(final double lowRoll,
               final double highRoll) {
    this.lowRoll = lowRoll;
    this.highRoll = highRoll;
  }

  public double getLowRoll() {
    return lowRoll;
  }

  public double getHighRoll() {
    return highRoll;
  }
}
