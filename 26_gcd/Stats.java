/*
    Jacc & David Chen & Kosta Dubovskiy
    APCS
    HW26 -- GCD Three Ways
    2021-10-27
    DISCO:
*/

public class Stats {

  public static void main (String[] args) {
    System.out.println (gcd(5, 5));
    System.out.println (gcd(15, 18));

  } //end main method

public static int gcd(int a, int b) {

int counter = a;

while ((counter <= a)) {
  if ((a % counter == 0) && (b % counter == 0)) {
      return counter;}
  counter -= 1;
}

return counter;

} // end method gcd

} //end class Stats
