/* Return the number of times that the string "hi" appears anywhere in the given string.

countHi("abc hi ho") → 1
countHi("ABChi hi") → 2
countHi("hihi") → 2 */

public class countHi {
public static int countHi(String str) {
  int slength = str.length();
  int counter = 0;
  for (int i = 0; i < slength - 1; i++) {
    if (str.substring(i, i + 2).equals("hi")) {
      counter += 1;
    }
  }
  return counter;
} // end method countHi

public static void main (String[] args) {
  System.out.println(countHi("abc hi ho"));
  System.out.println(countHi("ABChi hi"));
  System.out.println(countHi("hihi"));
} //end main method

} // class countHi
