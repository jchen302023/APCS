/***
// Team BrainForked (Gloria Lee, Jack Chen, John Gupta-She)
// APCS pd8
// HW 88- BPC Kiddies Do Not Wait in Line Either 
// 2022-04-04
// time spent: 0.5  hr

DISCO: 
- Using an arraylist to store data is useful because randomizing from an arraylist is easier than rearranging nodes in a queue.
- Going from right to left with the front of the queue on the right is more efficient 
QCC:
- Why did Queue<String> PirateQueue = new RQueue<String>() cause a cannot find symbol error for the sample method?
- ^^^ we changed the Queue to a RQueue and it somehow worked :) 
- Can i slurp java spaghetti code 
/***
 * interface Queue
 * Includes only methods listed in AP subset of Java
 * (Local version, to override built-in Java implementation.)
 **/

public interface Queue<SWASHBUCKLE>
{
  //~~~~~~~~~~~~~~~~~~begin AP subset~~~~~~~~~~~~~~~~~~
  //means of removing an element from collection:
  //Dequeues and returns the first element of the queue.
  public SWASHBUCKLE dequeue();

  //means of adding an element to collection:
  //Enqueue an element onto the back of this queue.
  public void enqueue( SWASHBUCKLE x );

  //Returns true if this queue is empty, otherwise returns false.
  public boolean isEmpty();

  //Returns the first element of the queue without dequeuing it.
  public SWASHBUCKLE peekFront();
  //~~~~~~~~~~~~~~~~~~~end AP subset~~~~~~~~~~~~~~~~~~~

}//end interface Queue
