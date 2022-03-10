/*
TNPG BrainForked 
APCS pd 08
HW72 -- So So Fast 
2022-03-08 
time spent: 1.5 hrs 


*/ 

// Write Java class FastSelect, which will use your renamed mystery method to find, as fast as possible, the _y_th smallest value in an array.
// Categorize the execution time of your algorithm using Big-Oh notation.

public class QuickSelect {
  
  public static int fastSelect(int[] arr, int y, int upperBound, int lowerBound) { //y is the yth smallest value in an array that you want to find
    // int upperBound; 
    // int lowerBound;
    //int pivot = 1;
    int pivot = (int)(upperBound + lowerBound) / 2;  
    int current = (mysterion(arr, lowerBound, upperBound)); 
    System.out.println("current: "+current);
    System.out.println("y "+y);
    

    if ( current > y -1 ) {
      return fastSelect(arr, y, current-1, lowerBound); 
      // return mysterion(arr, lowerBound, upperBound, pivot); 
    }
    
    if( current < y -1 ) {
      return fastSelect(arr, y, upperBound, current+1); 
    }
    if ( current == y-1 ) {
      return current;
    }
    return current; 
  }
  
  public static void swap( int x, int y, int[] o )
  {
    int tmp = o[x];
    o[x] = o[y];
    o[y] = tmp;
  } // helper 
  public static void print( int[] arr ){
        for ( int element : arr )
            System.out.print( element + " \n" );
            
    }
  
  public static int mysterion( int arr[], int a, int b)
   {
    int c = (a+b)/2;
     int v = arr[c];
 
     swap( c, b, arr);
     int s = a;
 
     for( int i = a; i < b; i++ ) {
       if ( arr[i] <= v) {
         swap( i, s, arr );
         s++;}
     }
     swap(s,b,arr);
     print(arr);
     return s;
   }// helper 

  public static void main (String[] args) {
    int[] sussy = {7, 1, 5, 12, 3};
    System.out.println("The 4 number..." + fastSelect(sussy, 4, 4, 0)); 
    System.out.println("The 3 number..." + fastSelect(sussy, 3, 4, 0)); 
    System.out.println("The 2 number..." + fastSelect(sussy, 2, 4, 0));
    System.out.println("The 1 number..." + fastSelect(sussy, 1, 4, 0));
    System.out.println("The 5 number..." + fastSelect(sussy, 5, 4, 0));   
    // int[] a = {1,2,3};
    // System.out.println("Best Case? "+ fastSelect(a, 2, 2, 0));
    // System.out.println("Worst Case? "+ fastSelect(a, 3, 2,0));// int[] mongus = {7, 1, 5, 12, 3, 15, 17};
    // System.out.println("The 3rd number..." + fastSelect(mongus, 3, 6, 0)); 
    // int[] crew = {7, 5, 1, 12, 3, 17, 15};
    // System.out.println("The 3rd number..." + fastSelect(crew, 3, 6, 0)); 
    
  } // main 
} //

/*
ALGO
{7 1 5 12 3} 
{1 3 5 12 7} s = 2
s is the sorted position of the pivot 
if s < y => lowerbound = 0, upperbound = s 
if s > y => lowerbound = s, upperbound = arraylength - 1. 
if s = y return? :) 

Best Case: O(n) in the case that the partition point chosen has a final position of exactly the y desired.
          In that case, only the mysterion algo would be executed to sort.
Worst Case: O(n^2) in the case that all partition points chosen are extremes from the y value. Recursively near the y value until it is reached.
          At worst, depending on partition point, this will take n^2 to gradually constrict bounds through the entire array.
Average Case: O(n * logn) Because we are using the middle point as the partition point. On average, there will be logn repetitions before y 
            value is reached.

DISCO:
  * Optimation is hard.
  * The return value of s is where the pivot is after the array has been split. The value at index s in the array is at its sorted position 
QCC:
  * Why won't it work? ):< 
  * Why use this sorting algorithm when its worst case is worse than the execution time of worst cases of other algos (mergesort)
  * Are we finding the nth smallest or the n+1th smallest if the index starts at 0?
*/