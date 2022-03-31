/***
 * class Stckr
 * SKELETON
 * driver/tester for Stack implementations (Linked-list-based, ArrayList-based)
 **/

public class Stckr
{
  public static void main( String[] args )
  {

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // USAGE: un-comment exactly 1 assignment below
    Stack<String> cakes = new ALStack<String>();
    //Stack<String> cakes = new LLStack<String>();
    
    cakes.push("blueberry");
    cakes.push("strawberry");
    cakes.push("raspberry");
    System.out.println(cakes.peekTop());
    System.out.println(cakes.pop());
    System.out.println(cakes.pop()); 
    System.out.println(cakes.pop()); 
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    //...

  }//end main

}//end class