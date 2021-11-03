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

  if (nlength <= 3) {
    return Integer.toString(a);
  }
    String right = number.substring(nlength - 3, nlength);
    String left = number.substring(0, nlength - 3);
    return (commafyR(Integer.parseInt(left))) + "," + right;

} //end method commafyR

public static String commafyF(int a) {
  String number = Integer.toString(a);
  int nlength = number.length();
  String ranswer = "";

  if (nlength <= 3) {
    return Integer.toString(a);
  }

  for (int i = 0; i + 3 < nlength; i += 3) {
    String right = number.substring(nlength - 3 - i, nlength - i);
    String left = number.substring(0, nlength - 3 - i);
    ranswer = "," + right + ranswer;
    if (left.length() <= 3) {
      ranswer = left + ranswer;
    }
  }
  return ranswer;
} // end method commafyF

public static void main (String[] args) {
  System.out.println(commafyR(1));
  System.out.println(commafyR(10));
  System.out.println(commafyR(101));
  System.out.println(commafyR(1000));
  System.out.println(commafyR(12345));
  System.out.println(commafyF(1));
  System.out.println(commafyF(10));
  System.out.println(commafyF(101));
  System.out.println(commafyF(1000));
  System.out.println(commafyF(12345));
  System.out.println(commafyF(100000));
  System.out.println(commafyF(1000000));

} // end main method

} // end class Commafier
