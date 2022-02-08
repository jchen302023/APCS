// TNPG Puntu (Anjini Katari, Jacc Chen, le duckies)
// APCS pd07
// HW51 -- implementing bubblesort
// 2022-01-04t
// time spent: 1 hrs

/******************************
 * class BubbleSort -- implements bubblesort algorithm (vanilla)
 *
 * ALGO:
 * Starting from the 2 rightmost elements in the array, check to see
   if the element on the right is greater than the one on the left.
   If so, move over 1 element and check again. If this is not the
   case, switch positions of the two elements. Continue to do this
   until you reach to the leftmost elements. This will complete 1
   pass. Continue to pass until the number of passes reaches 1 less
   than the length of the array.
 *
 * DISCO:
 * froggy size would be 0, so we need to use input size
 *
 * QCC
 * Why can't we run bubbleSortV and bubbleSort at the same time?
 *
 * q0: If a pass requires no swaps, what do you know?
 * a0: If a pass requires no swaps then the array has been
       sorted in numerical value from least to greatest.
 * q1: After pass p, what do you know?
 * a1: After pass p, the number at index p-1, and any index
       before it are in its sorted positions.
 * q2: How many passes are necessary to completely sort?
 * a2: At most the length of the array minus 1 passes are needed.
 *
 ******************************/

import java.util.ArrayList;

public class BubbleSort
{

  //~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~
  //precond:  lo < hi && size > 0
  //postcond: returns an ArrayList of random integers
  //          from lo to hi, inclusive
  public static ArrayList populate( int size, int lo, int hi ) {
    ArrayList<Integer> retAL = new ArrayList<Integer>();
    while( size > 0 ) {
      //     offset + rand int on interval [lo,hi]
      retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
      size--;
    }
    return retAL;
  }

  //randomly rearrange elements of an ArrayList
  public static void shuffle( ArrayList al )
  {
    int randomIndex;
    //setup for traversal fr right to left
    for( int i = al.size()-1; i > 0; i-- ) {
      //pick an index at random
      randomIndex = (int)( (i+1) * Math.random() );
      //swap the values at position i and randomIndex
      al.set( i, al.set( randomIndex, al.get(i) ) );
    }
  }
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/*
  // VOID version of bubbleSort
  // Rearranges elements of input ArrayList
  // postcondition: data's elements sorted in ascending order
  public static void bubbleSortV( ArrayList<Comparable> data ) {
    int countpasses = 0;
    int finalpasses = data.size() - 1;

    while (countpasses < finalpasses) {
        for (int i = finalpasses; i > 0; i --) {
            if (data.get(i).compareTo(data.get(i - 1)) < 0 ) {
                Comparable position1 = data.get(i);
                Comparable position2 = data.get(i - 1);
                //switches positions
                data.set(i, position2);
                data.set(i - 1, position1);
            }
        }
        countpasses += 1;
    }
  }
*/

  // ArrayList-returning bubbleSort
  // postcondition: order of input ArrayList's elements unchanged
  //                Returns sorted copy of input ArrayList.
  public static ArrayList<Comparable> bubbleSort( ArrayList<Comparable> input ){
    ArrayList<Comparable> froggy = new ArrayList<Comparable>();
    int countpasses = 0;
    int inputsize = input.size() - 1;

    for (int h = 0; h < input.size(); h ++) {
        froggy.add( input.get(h));
      }

    while (countpasses < inputsize) {
        for (int i = inputsize; i > 0; i --) {
            if (froggy.get(i).compareTo(froggy.get(i - 1)) < 0 ) {
                Comparable position1 = froggy.get(i);
                Comparable position2 = froggy.get(i - 1);
                //switches positions
                froggy.set(i, position2);
                froggy.set(i - 1, position1);
            }
        }
        countpasses += 1;
    }

    return froggy;
  }


  public static void main( String [] args )
  {

      ArrayList glen = new ArrayList<Integer>();
      glen.add(7);
      glen.add(1);
      glen.add(5);
      glen.add(12);
      glen.add(3);
      System.out.println( "ArrayList glen before sorting:\n" + glen );
      bubbleSortV(glen);
      System.out.println( "ArrayList glen after sorting:\n" + glen );

      ArrayList coco = populate( 10, 1, 1000 );
      System.out.println( "ArrayList coco before sorting:\n" + coco );
      bubbleSortV(coco);
      System.out.println( "ArrayList coco after sorting:\n" + coco );

      ArrayList glen = new ArrayList<Integer>();
      glen.add(7);
      glen.add(1);
      glen.add(5);
      glen.add(12);
      glen.add(3);
      System.out.println( "ArrayList glen before sorting:\n" + glen );
      ArrayList glenSorted = bubbleSort( glen );
      System.out.println( "sorted version of ArrayList glen:\n"
      + glenSorted );
      System.out.println( "ArrayList glen after sorting:\n" + glen );

      ArrayList coco = populate( 10, 1, 1000 );
      System.out.println( "ArrayList coco before sorting:\n" + coco );
      ArrayList cocoSorted = bubbleSort( coco );
      System.out.println( "sorted version of ArrayList coco:\n"
      + cocoSorted );
      System.out.println( "ArrayList coco after sorting:\n" + coco );
     // System.out.println( coco );
    /*==========for AL-returning methods==========

      ============================================*/

  }//end main

}//end class BubbleSort
