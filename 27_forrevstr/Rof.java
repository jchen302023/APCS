/*
    Jacc, May , Samantha
    APCS
    HW27 -- For the Love of Strings
    2021-10-28
    DISCO: final is a keyword that cannot/ should not be used
    as a variable. s.substring takes two integers, it represents the spaces between
    the letters and quotation marks etc. Outputs characters between the spaces. Ex:
    sapce before first character of string is position 0, space after that character
    is position 1. s.substring(0,1) would return that character between the spaces. 
*/

public class Rof{

public static void main (String[] args) {

  System.out.println(fenceF(1));
  System.out.println(fenceF(2));
  System.out.println(fenceF(3));
  System.out.println(reverseF("desserts"));
  System.out.println(reverseF("tacocat"));
  System.out.println(reverseR("may"));
  System.out.println(reverseR("wee"));
} // end main method

public static String fenceF(int posts) {

  String fence = "|";
  for (int i = 1; i < posts; i++) {
    fence += "--|";
  }
  return fence;

} // end method fenceF

public static String reverseF(String s) {
  String answer = "";
  for (int i = s.length(); answer.length() < s.length(); i--)
  {
    answer += s.substring(i - 1, i);
  }

return answer;

} // end method reverseF

public static String reverseR(String s) {
  String answer = "";
  int sLength = s.length();
  if (answer.length() < sLength) {
    answer += s.substring(sLength - 1, sLength);
    return answer + reverseR(s.substring (0, sLength - 1));
  }
  else {
    return answer;
  }

} // end method reverseR

} // end class Rof
