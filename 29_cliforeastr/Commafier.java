/*
 * Jacc Chen
 * APCS
 * HW29: For Loops & Recursion with prettifying numbers
 * 2021-11-02
 * DISCO
 */

public class Commafier {

public static String commafyR(int a) {
  String number = Integer.toString(a);
  int nlength = number.length();
  if (nlength < 3) {
    return Integer.toString(a);
  }
    String right = number.substring(nlength - 3, nlength);
    String left = number.substring(0, nlength - 3);
    return (commafyR(Integer.parseInt(left))) + "," + right;

} //end method commafyR

public static void main (String[] args) {

} // end main method 

} // end class Commafier
