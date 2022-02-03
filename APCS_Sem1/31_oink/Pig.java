/*
    Jacc Chen
    APCS
    HW31 -- Otnay Ybay ethay Airhay Onway Ymay Inneechay Inchay Inchay
    2021-11-03
    DISCO: Call a method in method, makes your life 10000000000 times easier.
    Saved me from copy and pasting for who knows how long :) 
*/

public class Pig
{
  //Q: How does this initialization make your life easier?
  private static final String VOWELS = "aeiou";


  /*=====================================
    boolean hasA(String,String) -- checks for a letter in a String
    pre:  w != null, letter.length() == 1
    post: hasA("cat", "a") -> true
    hasA("cat", "p")       -> false
    =====================================*/
  public static boolean hasA(String w, String letter) {
    int wlength = w.length();
    int lettercounter = 0;

    if (w.equals(letter)) {
      return true;
    }
    for (int i = 0; i < wlength; i++) {
      if (w.substring(i, i + 1).equals(letter)) {
        lettercounter += 1;
      }
    }
    if (lettercounter >= 1) {
      return true;
    }
    else { return false; }
  } //end hasA()


  /*=====================================
    boolean isAVowel(String) -- tells whether a letter is a vowel
    precondition: letter.length() == 1
    =====================================*/
  public static boolean isAVowel(String letter) {
    int lettercounter = 0;

    for (int i = 0; i < 5; i++) {
      if (VOWELS.substring(i, i + 1).equals(letter)) {
        lettercounter += 1;
      }
    }
    if (lettercounter >= 1) {
      return true;
    }
    else { return false; }
  } // end isAVowel

  /*=====================================
      int countVowels(String) -- counts vowels in a String
      pre:  w != null
      post: countVowels("meatball") -> 3
      =====================================*/
  public static int countVowels( String w ) {
      int wlength = w.length();
      int lettercounter = 0;

      for (int i = 0; i < wlength; i++) {
        if (isAVowel(w.substring(i, i + 1))) {
          lettercounter += 1;
        }
    }
    return lettercounter;
  } // end countVowels

  /*=====================================
    boolean hasAVowel(String) -- tells whether a String has a vowel
    pre:  w != null
    post: hasAVowel("cat") -> true
    hasAVowel("zzz")       -> false
    =====================================*/
  public static boolean hasAVowel( String w ) {
    if (countVowels(w) > 0) {
      return true;
    }
    else { return false; }
  } // end hasAVowel

  /*=====================================
      String allVowels(String) -- returns vowels in a String
      pre:  w != null
      post: allVowels("meatball") -> "eaa"
      =====================================*/
    public static String allVowels( String w ) {
      String answer = "";
      int wlength = w.length();
      int lettercounter = 0;

      for (int i = 0; i < wlength; i++) {
        if (isAVowel(w.substring(i, i + 1))) {
          answer += w.substring(i, i + 1);
        }
    }
    return answer;
    } // end allVowels

  public static void main( String[] args )
    {
      System.out.println(hasA("cat", "a"));
      System.out.println(hasA("doggo", "a"));
      System.out.println(isAVowel("a"));
      System.out.println(isAVowel("z"));
      System.out.println(countVowels("cat"));
      System.out.println(countVowels("pigpongpinkpog"));
      System.out.println(hasAVowel("amongus"));
      System.out.println(hasAVowel("mmmmmmm"));
      System.out.println(allVowels("meatball"));
      System.out.println(allVowels("aeiou"));
    }//end main()

} //end class Pig
