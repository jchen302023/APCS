/*
Given two strings, return true if either of the strings appears at the very end of the other string, ignoring upper/lower case differences (in other words, the computation should not be "case sensitive"). Note: str.toLowerCase() returns the lowercase version of a string.

endOther("Hiabc", "abc") → true
endOther("AbC", "HiaBc") → true
endOther("abc", "abXabc") → true
*/

public class endOther {

public static boolean endOther(String a, String b) {
  String lowera = a.toLowerCase();
  String lowerb = b.toLowerCase();
  int slengtha = a.length();
  int slengthb = b.length();
  int apoint = 0;
  int bpoint = 0;

  if (slengtha > slengthb) {

  for (int i = 0; i < slengtha - (slengthb - 1); i++) {
    if ((lowera.substring(i , i + slengthb)).equals(lowerb)) {
      apoint += 1;
    }
  }
} // a greater than b

  if (slengtha < slengthb) {
  for (int i = 0; i < slengthb - (slengtha - 1); i++) {
    if ((lowerb.substring(i , i + slengtha)).equals(lowera)) {
      bpoint += 1;
    }
  }
} // b greater than a

if (apoint == 1 || bpoint ==1 || lowera.equals(lowerb)) {
  return true;
}
else { return false; }


} //end method

public static void main (String[] args) {
  System.out.println(endOther("Hiabc", "abc"));
  System.out.println(endOther("AbC", "HiaBc"));
  System.out.println(endOther("abc", "abXabc"));

} // end main method

} //end class






/* public boolean endOther(String a, String b) {
  String lowera = a.toLowerCase();
  String lowerb = b.toLowerCase();
  int slengtha = a.length();
  int slengthb = b.length();
  int apoint = 0;
  int bpoint = 0;

  if (slengtha > slengthb) {

  for (int i = 0; i < slengtha - (slengthb - 1); i++) {
    if ((lowera.substring(i , i + slengthb)).equals(lowerb)) {
      apoint += 1;
    }
  }
} // a greater than b

  if (slengtha < slengthb) {
  for (int i = 0; i < slengthb - (slengtha - 1); i++) {
    if ((lowerb.substring(i , i + slengtha)).equals(lowera)) {
      bpoint += 1;
    }
  }
} // b greater than a

if (apoint == 1 || bpoint ==1 || lowera.equals(lowerb)) {
  return true;
}
else { return false; }


} //end method */
