// Team BrainForked (Gloria Lee, Jack Chen, John Gupta-She)
// APCS pd8
// HW 81 - Thank you, next 
// 2022-03-24r
// time spent: 1  hr

/***
 * class ItrWork
 *  SKELETON
 * Facilitates familiarization with iterators
 **/

/***
    DISCO: 
    * Remove for iterator removes the next element in the element 
    * Must add (Integer) to make sure that the variable is set to an Integer type 
    * List is an abstract type (because it is an interface) and can not be instantiated 
    so you can make a List of ArrayList flavor instead that can implement the interface List
    QCC:
    * Can you go backwards in an iterator? 
    
    SUMMARY THE FIRST:
    - Iterator provides three methods (hasNext, next, and remove) that can only access the next element of some collection/source
    but cannot immediately access contents of any other element in the collection (ex: 2 next). Iterator can detect if there is 
    still a next element and can remove the next element if necessary.
    
    SUMMARY THE SECOND:
    - ItrWork uses Iterator to build new methods using the already existing ones in Iterator. Through iteratively using 
    the next() method, ItrWork is able to traverse a list, checking if an element is present in the collection or not or remove that element 
    according to a predefined boolean.

**/




import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class ItrWork
{

  //using FOREACH loop
  //returns a boolean to indicate whether key is present in L
  public static boolean foundA( Integer key,
                                List<Integer> L )
  {
    for(Integer i : L){
      if(i.equals(key)){
        return true;
      }
    }
    return false;
  }

  //explicitly using an iterator
  //returns a boolean to indicate whether key is present in L
  public static boolean foundB( Integer key,
                                List<Integer> L )
  {
    Iterator it = L.iterator(); 
    while (it.hasNext()) {
      Integer thing = (Integer) it.next(); 
      if (thing.equals(key)) {
        return true; 
      }
    }
    return false; 
  }

  //using FOREACH loop
  //returns a list containing the odd numbers in L
  public static List<Integer> oddsA( List<Integer> L )
  {
    List<Integer> out = new ArrayList<Integer>();
    for(Integer i : L){
      if(i % 2 == 1){
        out.add(i);
      }
    }
    return out;
  }

  //explicitly using an iterator
  //returns a list containing the odd numbers in L
  public static List<Integer> oddsB( List<Integer> L )
  {
    Iterator it = L.iterator();
    List<Integer> out = new ArrayList<Integer>();
    while(it.hasNext()){
      Integer thing = (Integer) it.next(); 
      if(thing % 2 == 1) {
        out.add(thing); 
      }
    }
    return out; 
  }


  //explicitly using an iterator
  //modifies L s.t. it contains no evens
  public static void removeEvens( List<Integer> L )
  {
    Iterator it = L.iterator();
    List<Integer> remove = new ArrayList<Integer>();
    while(it.hasNext()){
      Integer thing =(Integer) it.next();
      if(thing % 2 == 0){
        it.remove(); 
        }
    }
    // L = new ArrayList<Integer>();
    
  }


  public static void main( String [] args )
  {
  
    //var type: List   obj type: ?
    List<Integer> L = new ArrayList<Integer>();
    for( int i = 0; i < 10; i++ )
      L.add(i);
    // TASK: write code to print the contents of L...
    // a) using a FOREACH loop
    // b) explicitly using an iterator
    System.out.println("\nTesting foundA...");
    System.out.println("9 in L? -> " + foundA(9,L) );
    System.out.println("13 in L? -> " + foundA(13,L) );
    System.out.println("\nTesting foundB...");
    System.out.println("9 in L? -> " + foundB(9,L) );
    System.out.println("13 in L? -> " + foundB(13,L) );
    System.out.println("\nTesting oddsA...");
    List<Integer> A = oddsA(L);
    for( int n : A ) System.out.println(n);
    System.out.println("\nTesting oddsB...");
    List<Integer> B = oddsB(L);
    for( int n : B ) System.out.println(n);
    System.out.println("\nTesting removeEvens...");
    removeEvens(L);
    for( int n : L ) System.out.println(n);
    

  }//end main

}//end class ItrWork