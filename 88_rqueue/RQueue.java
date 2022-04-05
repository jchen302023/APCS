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

 * class RQueue
 * SKELETON
 * A node-based, randomized queue
 * (a collection with FIIDKO property)
 *
 *       -------------------------------
 *   end |  --->   Q U E U E   --->    | front
 *       -------------------------------
 *
 *  linkages point opposite direction for O(1) en/dequeuing
 *            N <- N <- ... <- N <- N
 *      _end -^                     ^- _front
 *
 **/
import java.util.ArrayList; 

public class RQueue<SWASHBUCKLE> implements Queue<SWASHBUCKLE>
{
  //instance variables
  private LLNode<SWASHBUCKLE> _front, _end;
  private int _size;


  // default constructor creates an empty queue
  public RQueue()
  {
    _size = 0;
    _front = null;
    _end = null;
  }


  public void enqueue( SWASHBUCKLE enQVal )
  {


        //special case: when enqueuing to an empty list,
        //make _front && _end point to same node
        if ( isEmpty() ) {
          _front = _end = new LLNode( enQVal, null );
        }
        else {
          _end.setNext( new LLNode( enQVal, null ) );
          _end = _end.getNext();
        }
        _size++;
        System.out.println("enqueued " + enQVal);




  }//O(1)


  // remove and return thing at front of queue
  // assume _queue ! empty
  public SWASHBUCKLE dequeue()
  {
    SWASHBUCKLE retVal = _front.getCargo();
    _front = _front.getNext();

    if ( _front == null ) //just moved past last node
      _end = null;      //update _end to reflect emptiness

    _size--;

    return retVal;

  }//O(1)


  public SWASHBUCKLE peekFront()
  {
    return _front.getCargo();

  }//O(1)


  /***
   * void sample() -- a means of "shuffling" the queue
   * Algo:
   *   Create a new ArrayList and dequeue the queue, adding whatever is returned to the arraylist.
   *   Generate random integer from range 0 to arraylist size - 1. 
   *   At this index, enqueue what element in the arraylist is at that index and remove that element afterwards.
   *   Repeat until no more elements in arraylist.
   **/
  public void sample()
  {
    ArrayList<SWASHBUCKLE> simple = new ArrayList<SWASHBUCKLE>(); 
  
    for (int i = _size; i > 0; i --) {
      simple.add(dequeue());
    }
    
    int sizething = simple.size();
    for(int j = 0; j < sizething; j ++) {
      int rand = (int)(Math.random() * simple.size());
      enqueue(simple.get(rand));
      simple.remove(rand); 
    }
        
  }//O(N)


  public boolean isEmpty()
  {
    return _front == null;
  } //O(1)


  // print each node, separated by spaces
  public String toString()
  {
return _front.toString();
  }//end toString()



  //main method for testing
  public static void main( String[] args )
  {

    

    RQueue<String> PirateQueue = new RQueue<String>();

    System.out.println("\nnow enqueuing...");
    PirateQueue.enqueue("Dread");
    PirateQueue.enqueue("Pirate");
    PirateQueue.enqueue("Roberts");
    PirateQueue.enqueue("Blackbeard");
    PirateQueue.enqueue("Peter");
    PirateQueue.enqueue("Stuyvesant");

    System.out.println("\nnow testing toString()...");
    System.out.println( PirateQueue ); //for testing toString()...

    System.out.println("Testing Sample");
    PirateQueue.sample(); 
    
    System.out.println("\nnow dequeuing...");
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );

    System.out.println("\nnow dequeuing fr empty queue...\n" +
                       "(expect NPE)\n");
    System.out.println( PirateQueue.dequeue() );
  /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
      ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/

  }//end main

}//end class RQueue
