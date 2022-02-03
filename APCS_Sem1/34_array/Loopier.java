/*
    Jacc Chen (Large), Anjini Katari (Watson)
    APCS
    HW34 -- A Pirate's Life for Me
    2021-11-15
DISCO:
 * You cannot splice arrays!! Thanks java!!
 * In this case, recursive was significantly harder than interative.

QCC:
 * How do we use nextInt? It doesn't work. ):
 * How can we make the recursive form without the usage of a global variable?
Time spent: 2.5 hours
*/

public class Loopier {

  public static int[] randomArray ( int number) {

    Loopier randarray = new Loopier();
    int[] a = new int[number];
    for (int i = 0; i < a.length; i++) {
      a[i] = (int) (Math.random() * 10);
    }
    return a;
  } // end method randomArray

  public static int linSearch( int[] array, int target) {

    for (int i = 0; i < array.length; i++) {
      if (array[i] == target) {
        return i;
      }
    }
    return -1;
  } // end method linSearch
/*
static int counterone = 1;
  public static int linSearchR( int[] array, int target) {
    int alength = array.length;
    if (counterone <= alength && array[alength - counterone] == target) {
      return alength - counterone;
    }
    else if (counterone <= alength && array[alength - counterone] != target) {
      counterone += 1;
      return linSearchR( array, target);
    }
  else {
    return -1;
  }
  } // end method linSearchR
  */
static int counterone = 0;
    public static int linSearchR( int[] array, int target) {
      int alength = array.length;
      if (counterone < alength && array[0 + counterone] == target) {
        return counterone;
      }
      else if (counterone < alength && array[0 + counterone] != target) {
        counterone += 1;
        return linSearchR( array, target);
      }
    else {
      return -1;
    }
    } // end method linSearchR

public static int freq( int[] array, int target) {

  int counter = 0;

  for (int i = 0; i < array.length; i++) {
    if (array[i] == target){
      counter += 1;
    }
  }

  return counter;
} // end method freq

static int countertwo = 0;
static int counterthree = 0;

public static int freqRec( int[] array, int target) {
  int alength = array.length;
  if (counterthree < alength && array[0 + counterthree] == target) {
    return countertwo += 1;
  }
  else if (counterthree < alength && array[0 + counterthree] != target) {
    counterthree += 1;
    return freqRec( array, target);
  }
  else {
  return 0;
}

} // end method freqRec

public static void printArray(int[] a) {
    System.out.print("{" + a[0]);
    for (int i = 1; i < a.length; i++) {
        System.out.print(", " + a[i]);
    }
    System.out.println("}");
} // end method printArray

  public static void main(String[] args) {
    int[] array = randomArray(10);
    printArray(array);
    System.out.println("linSearch: " + linSearch(array, 7));
    System.out.println("freq: " + freq(array, 7));
    System.out.println("linSearchR: " + linSearchR(array, 7));
    System.out.println("freqRec: " + freqRec(array, 7));

  } // end main

} // end class Loopier
