package combit.ListLabel24;

public enum LlFindAndReplaceAction {
  Replace(0L),
  Skip(1L),
  CancelGlobally(2L),
  ;
  private long numVal;

  LlFindAndReplaceAction(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}
