/*
    Jacc Chen (Large), Anjini Katari
    APCS
    HW34 -- A Pirate's Life for Me
    2021-11-12
    DISCO:
*/

public class Loopier {

  public static int[] randomArray (int number) {

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
  public static int linSearchR( int[] array, int target) {
    int alength = array.length;
    if (1 < alength) {
      if (array[alength] == target) {
        return alength - 1;
      }

    }
    return -1;
  } // end method linSearchR
*/

public static int freq( int[] array, int target) {

  int counter = 0;

  for (int i = 0; i < array.length; i++) {
    if (array[i] == target){
      counter += 1;
    }
  }

  return counter;
} // end method freq



public static void printArray(int[] a) {
    System.out.print("{" + a[0]);
    for (int i = 1; i < a.length; i++) {
        System.out.print(", " + a[i]);
    }
    System.out.println("}");
}

  public static void main(String[] args) {
    int[] array = randomArray(10);
    printArray(array);
    System.out.println(linSearch(array, 5));
    System.out.println(linSearch(array, 7));
    System.out.println(freq(array, 5));
    System.out.println(freq(array, 7));
  } // end main

} // end class Loopier
