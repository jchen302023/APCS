/*
Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.

xyzThere("abcxyz") → true
xyzThere("abc.xyz") → false
xyzThere("xyz.abc") → true

*/

public class xyzThere {

public static boolean xyzThere(String str) {
  int slength = str.length();
  int xyzpoint = 0;

  if (slength < 3)
  {return false;}

  if ((str.substring(0, 3)).equals("xyz")) {
    return true;
  }

  for (int i = 1 ; i < slength - 2; i++) {
    if (str.substring(i, i + 3).equals("xyz") && !(str.substring(i - 1, i)).equals(".")){
      xyzpoint += 1;
    }
  }
  if (xyzpoint > 0) {
    return true;
  }
  else {return false;}
} // end method

public static void main (String[] args) {
  System.out.println(xyzThere("abcxyz"));
  System.out.println(xyzThere("abc.xyz"));
  System.out.println(xyzThere("xyz.abc"));

} // end main method

} // end class
