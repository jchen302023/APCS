/*
TNPG BrainForked 
APCS pd 08
HW72 -- So So Fast 
2022-03-08 
time spent: 1.5 hrs 
ALGO:

{7 1 5 12 3} 
{1 3 5 12 7} s = 2
s is the sorted position of the pivot 
if s < y => lowerbound = 0, upperbound = s 
if s > y => lowerbound = s, upperbound = arraylength - 1
if s = y return? :) 

Best Case: O(n)
Worst Case: O(n^2)
Average Case: O(n * logn)
DISCO:
  * Optimation is hard.
  * The return value of s is where the pivot is after the array has been split. The value at index s in the array is at its sorted position 
QCC:
  * Why won't it work? ):< 
  * Why use this sorting algorithm when its worst case is worse than the execution time of worst cases of other algos (mergesort)
  * Are we finding the nth smallest or the n+1th smallest if the index starts at 0?
*/ 

// Write Java class FastSelect, which will use your renamed mystery method to find, as fast as possible, the _y_th smallest value in an array.
// Categorize the execution time of your algorithm using Big-Oh notation.

public class FastSelect {
  
  public static int fastSelect(int[] arr, int y, int upperBound, int lowerBound) { //y is the yth smallest value in an array that you want to find
    // int upperBound; 
    // int lowerBound;
    int pivot = (int)(upperBound + lowerBound) / 2;  
    int current = (mysterion(arr, lowerBound, upperBound, pivot)); 
    System.out.println(current);
    
    

    if ( current > y -1 ) {
      fastSelect(arr, y, current, lowerBound); 
      // return mysterion(arr, lowerBound, upperBound, pivot); 
    }
    
    else if( current < y -1 ) {
      fastSelect(arr, y, upperBound, current); 
    }
    else if ( current == y-1 ) {
      return arr[pivot];
    }
    return arr[pivot]; 
  }
  
  public static void swap( int x, int y, int[] o )
  {
    int tmp = o[x];
    o[x] = o[y];
    o[y] = tmp;
  } // helper 
  
  public static int mysterion( int arr[], int a, int b, int c)
   {
     int v = arr[c];
 
     swap( c, b, arr);
     int s = a;
 
     for( int i = a; i < b; i++ ) {
       if ( arr[i] <= v) {
         swap( i, s, arr );
         s++;}
     }
     swap(s,b,arr);
 
     return s;
   }// helper 

  public static void main (String[] args) {
    int[] sussy = {7, 1, 5, 12, 3};
    System.out.println("The 2rd number..." + fastSelect(sussy, 2, 4, 0)); 
    System.out.println("The 3rd number..." + fastSelect(sussy, 3, 4, 0)); 
    // int[] mongus = {7, 1, 5, 12, 3, 15, 17};
    // System.out.println("The 3rd number..." + fastSelect(mongus, 3, 6, 0)); 
    // int[] crew = {7, 5, 1, 12, 3, 17, 15};
    // System.out.println("The 3rd number..." + fastSelect(crew, 3, 6, 0)); 
    
  } // main 
} //