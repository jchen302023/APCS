/*
Return true if the string "cat" and "dog" appear the same number of times in the given string.

catDog("catdog") → true
catDog("catcat") → false
catDog("1cat1cadodog") → true

*/
public class catDog {

public static boolean catDog(String str) {

  int slength = str.length();
  int catcounter = 0;
  int dogcounter = 0;

  for (int i = 0; i < slength - 2; i++) {
    if (str.substring(i , i + 3).equals("cat")) {
      catcounter += 1;
    }
    if (str.substring(i, i + 3).equals("dog")) {
      dogcounter += 1;
    }
  }
  if (catcounter == dogcounter) {
    return true;
  }
  else {
    return false;
  }
} // end method catDog

public static void main(String[] args) {
  System.out.println(catDog("catdog"));
  System.out.println(catDog("catcat"));
  System.out.println(catDog("1cat1cadodog"));

} // end main method

} //end class catDog
