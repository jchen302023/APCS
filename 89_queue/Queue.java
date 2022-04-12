// Team BrainForked (Gloria Lee, Jack Chen, John Gupta-She)
// APCS pd8
// HW89: Queue Two Ways
// 2022-04-11m
// time spent: 0.5  hr

/*
  DISCO:
  * To avoid null pointer exception, we dont just instantiate new arrays/lists by stating the Object type and then the name.
  We also have to add that it is a new (Object)(); as well
  QCC:
  *  Which one is more efficient? Linked List because both enqueue and dequeue are O(1)
*/

/***
 * interface Queue
 * Includes only methods listed in AP subset of Java
 * (Local version, to override built-in Java implementation.)
 **/

public interface Queue<KIWI>
{
  //~~~~~~~~~~~~~~~~~~begin AP subset~~~~~~~~~~~~~~~~~~
  //means of removing an element from collection:
  //Dequeues and returns the first element of the queue.
  public KIWI dequeue();

  //means of adding an element to collection:
  //Enqueue an element onto the back of this queue.
  public void enqueue( KIWI x );

  //Returns true if this queue is empty, otherwise returns false.
  public boolean isEmpty();

  //Returns the first element of the queue without dequeuing it.
  public KIWI peekFront();
  //~~~~~~~~~~~~~~~~~~~end AP subset~~~~~~~~~~~~~~~~~~~

}//end interface Queue