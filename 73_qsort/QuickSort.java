//TNPG BrainForked - Gloria Lee, Jack Chen, John Gupta-She
//APCS pd0
//HW72 -- QuickSort
//2022-03-09w
//time spent: 1.5h

/*
DISCO:
* If upperBound - lowerBound is equal to 1, then that means that there are still two elements left unsorted. If it is
 less than 1, then that means that there is one element left unsorted, but one element is always sorted. This deals with the 
 issue of having duplicate values 

QCC:
* Is there a way to quicksort without needing a helper function that does all the heavy lifting?
* Why can I never remeber how to innitialize an array ): 
* Why use this sorting algorithm when its worst case is worse than the execution time of worst cases of other algos (mergesort)

*/
/***
 * class QuickSort
 * Implements quicksort algo to sort an array of ints in place
 *
 * 1. Summary of QuickSort algorithm:
 * QSort(arr): 
 * Find the n/2 th smallest element
 * Partition around it (perform on the part of the array less than the pivot and the side of the array greater than the pivot)
 * Repeat for upper portion and lower portion
 * When it reaches one element, or when the upperBound and LowerBound is less than one, the method would return the sorted array 
 * 
 *
 * 2a. Worst pivot choice and associated run time:
 * Pivot is one of the extremes, splits array into 1 element and n-1 elements. O(n^2)
 *
 * 2b. Best pivot choice and associated run time:
 * Pivot is in the middle, splits array into as close as possible to n/2 element arrays. O(nlogn)
 *
 * 3. Approach to handling duplicate values in array:
 * In our partition method, we swap if  arr[i] <= v and not only if arr[i] < v.
 * 
 **/
 
 /**
  * int partition(int[],int,int,int)
  * Given an array and a lower/upper bound to limit partitioning to,
  *    partition method sets the value of the middle element of the specified range as the partition
  *    and then sorts all elements in the specified range according to partition value. 
  *    All elemetns left of partition are less than the partition value. All elements on the right are greater than partition value.
  *    Partition value may end up at a different index than what it started at. 
  * @param arr input array of ints
  * @param a - lower bound   
  * @param b - upper bound
  * @return int position of the pivot 
  *
  */

public class QuickSort
{
  //--------------v  HELPER METHODS  v--------------
  

   
  //swap values at indices x, y in array o
  public static void swap( int x, int y, int[] o )
  {
    int tmp = o[x];
    o[x] = o[y];
    o[y] = tmp;
  }

  //print input array
  public static void printArr( int[] a )
  {
    for ( int o : a )
      System.out.print( o + " " );
    System.out.println();
  }

  //shuffle elements of input array
  public static void shuffle( int[] d )
  {
    int tmp;
    int swapPos;
    for( int i = 0; i < d.length; i++ ) {
      tmp = d[i];
      swapPos = i + (int)( (d.length - i) * Math.random() );
      swap( i, swapPos, d );
    }
  }

  //return int array of size s, with each element fr range [0,maxVal)
  public static int[] buildArray( int s, int maxVal )
  {
    int[] retArr = new int[s];
    for( int i = 0; i < retArr.length; i++ )
      retArr[i] = (int)( maxVal * Math.random() );
    return retArr;
  }
  //--------------^  HELPER METHODS  ^--------------




  /**
   * void qsort(int[])
   * @param d -- array of ints to be sorted in place
   */
  public static void qsort( int[] d )
  {
    guts(d, 0, d.length-1);

  }

  //you may need a helper method...
  

  public static void guts( int[] arr, int lowerBound, int upperBound){
    if(upperBound-lowerBound <1){
      return;
    }
    else{
    //int pivot = QuickSelect.fastSelect(arr, (upperBound - lowerBound) / 2, upperBound, lowerBound);
     int ffinal = Partition.partition(arr, lowerBound, upperBound);
  //  int ffinal = Partition.partition(arr, lowerBound, upperBound, pivot);
    guts(arr, lowerBound, ffinal -1);
    guts(arr, ffinal +1, upperBound);
    }
    return;
  }

  


  //main method for testing
  public static void main( String[] args )
  {
  
    //get-it-up-and-running, static test case:
    int [] arr1 = {7,1,5,12,3};
    System.out.println("\narr1 init'd to: " );
    printArr(arr1);
    qsort( arr1 );
    System.out.println("arr1 after qsort: " );
    printArr(arr1);
      
    // randomly-generated arrays of n distinct vals
    int[] arrN = new int[10];
    for( int i = 0; i < arrN.length; i++ )
    arrN[i] = i;
    System.out.println("\narrN init'd to: " );
    printArr(arrN);
    shuffle(arrN);
    System.out.println("arrN post-shuffle: " );
    printArr(arrN);
    qsort( arrN );
    System.out.println("arrN after sort: " );
    printArr(arrN);
    

    
    //get-it-up-and-running, static test case w/ dupes:
    int [] arr2 = {7,1,5,12,3,7};
    System.out.println("\narr2 init'd to: " );
    printArr(arr2);
    qsort( arr2 );
    System.out.println("arr2 after qsort: " );
    printArr(arr2);
    
    // arrays of randomly generated ints
    int[] arrMatey = new int[20];
    for( int i = 0; i < arrMatey.length; i++ )
    arrMatey[i] = (int)( 48 * Math.random() );
    System.out.println("\narrMatey init'd to: " );
    printArr(arrMatey);
    shuffle(arrMatey);
    System.out.println("arrMatey post-shuffle: " );
    printArr(arrMatey);
    qsort( arrMatey );
    System.out.println("arrMatey after sort: " );
    printArr(arrMatey);
    
    // arrays of randomly generated ints
    int[] bestCase = {1, 3, 5, 7, 12}; 
    System.out.println("\nbestCase init'd to: " );
    printArr(bestCase);
    qsort( bestCase );
    System.out.println("bestCase after sort: " );
    printArr(bestCase);
    
    int[] worstCase = {1, 3, 12, 7, 5}; 
    System.out.println("\nworstCase init'd to: " );
    printArr(worstCase);
    qsort( worstCase );
    System.out.println("worstCase after sort: " );
    printArr(worstCase);
    /*~~~~s~l~i~d~e~~~m~e~~~d~o~w~n~~~~~~~~~~~~~~~~~~~~ (C-k, C-k, C-y)
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

  }//end main

}//end class QuickSort