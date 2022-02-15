/*
Return the number of times that the string "code" appears anywhere in the given string, except we'll accept any letter for the 'd', so "cope" and "cooe" count.

countCode("aaacodebbb") → 1
countCode("codexxcode") → 2
countCode("cozexxcope") → 2
*/
public class countCode {

public static int countCode(String str) {
  int slength = str.length();
  int counter = 0;

  for (int i = 0; i < slength - 3; i++) {
    if (str.substring(i, i + 2).equals("co") && str.substring(i + 3, i + 4).equals("e")) {
      counter += 1;
    }
  }
  return counter;
} // end method countCode

public static void main (String[] args) {
  System.out.println(countCode("aaacodebbb"));
  System.out.println(countCode("codexxcode"));
  System.out.println(countCode("cozexxcope"));
} // end main method

} // end class countCode
