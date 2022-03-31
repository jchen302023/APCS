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
    //Stack<Object> cakes = new ALStack<Object>();
    Stack<Object> cakes = new LLStack<Object>();
    System.out.println(cakes.isEmpty());
    cakes.push("blueberry");
    cakes.push("strawberry");
    cakes.push("raspberry");
    cakes.push("vanilla");
    cakes.push(100);
    cakes.push(true);
    System.out.println(cakes.peekTop());
    System.out.println(cakes.pop());
    System.out.println(cakes.isEmpty());
    System.out.println(cakes.pop()); 
    System.out.println(cakes.pop()); 
    System.out.println(cakes.pop()); 
    System.out.println(cakes.pop()); 
    System.out.println(cakes.isEmpty());
    System.out.println("Does your code break");
    System.out.println(cakes.pop()); 
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    //...

  }//end main

}//end class
