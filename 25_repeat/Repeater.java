/*
    Jacc & David Chen & Kosta Dubovskiy
    APCS
    HW25 -- While loops cont., recursion, and fences
    2021-10-26
    DISCO: You can do recursion by doing the method name and then the integer
    the method takes minus one until fposts equals 1 where it returns the
    final fence post. fenceW works from first to last fence. fenceR works from
    the last to first fence. 
*/

public class Repeater {
  public static void main (String[] args) {
    System.out.println (fenceW(1));
    System.out.println (fenceW(2));
    System.out.println (fenceW(3));
    System.out.println (fenceR(1));
    System.out.println (fenceR(2));
    System.out.println (fenceR(3));
  } // end main method
  public static String fenceW(int fposts) {
    String firstpost = "|";
    int counter = 1;

    while (fposts > counter) {
      firstpost += "--|";
      counter += 1;
    }
    return firstpost;
  } // end method fenceW
  public static String fenceR(int fposts) {
    if (fposts == 1) {
      return "|";
    }
    else {
      return fenceR(fposts - 1) + "--|";
    }
  } // end method fenceR

} // end class Repeater
