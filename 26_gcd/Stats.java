/*
    Jacc & David Chen & Kosta Dubovskiy
    APCS
    HW26 -- GCD Three Ways
    2021-10-27
    DISCO: I don't know how to do the while loop for the gcdEW, need help.
    Running the code almsot made my computer break again, I think it almost exploded.
*/

public class Stats {

  public static void main (String[] args) {
    System.out.println (gcd(5, 5));
    System.out.println (gcd(15, 18));
    System.out.println (gcdER(5, 5));
    System.out.println (gcdER(15,18));
    System.out.println (gcdEW(5, 5));
    System.out.println (gcdEW(15, 18));

  } // end main method

public static int gcd(int a, int b) {

int counter = a;

while ((counter <= a)) {
  if ((a % counter == 0) && (b % counter == 0)) {
      return counter; }
  counter -= 1;
}

return counter;

} // end method gcd

public static int gcdER(int a, int b) {

  if (a == b) {
    return a; }
    else if (a > (b - a)) {
        return gcdER(b - a, a);
      }
    else if (a < (b - a)){
        return gcdER(a, b - a);
      }
    else {
      return a;
    }

} // end method gcdER

public static int gcdEW(int a, int b) {

  while (a != b) {
    if (a > (b - a)) {
      b = a;
      a = (b - a);
    }
    if (a < (b - a)) {
      a = a;
      b = (b - a);
    }
  }
return a;

}// end method gcdEW

} // end class Stats
