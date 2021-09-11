public class DeadCodeExample {

  boolean deadcode1(Object o1, Object o2) {
    if(o1 == null && o2 == null) {
      return true;
    } else if(o1 == null && o2 != null) {
      // The check above for o2 != null is useless: 
      // Because of the first condition, 
      // o2 cannot be null if o1 is null.
      return false;
    }
    return true;
  }
  void deadcode2(Object o) throws Exception {
    if(o == null) {
      throw new Exception();
    }
    if(o == null) {
      // This line cannot be reached!
      System.out.print("o is null");
    }
  }
}