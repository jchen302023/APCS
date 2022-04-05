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

/*****************************************************
 * class LLNode
 * Implements a node, for use in lists and other container classes.
 * Stores its data as a String
 *****************************************************/

public class LLNode<SWASHBUCKLE>
{
    //instance vars
    private SWASHBUCKLE _cargo;    //cargo may only be of type String
    private LLNode<SWASHBUCKLE> _nextNode; //pointer to next LLNode

    // constructor -- initializes instance vars
    public LLNode( SWASHBUCKLE value, LLNode next ) {
	_cargo = value;
	_nextNode = next;
    }


    //--------------v  ACCESSORS  v--------------
    public SWASHBUCKLE getCargo() { return _cargo; }

    public LLNode<SWASHBUCKLE> getNext() { return _nextNode; }
    //--------------^  ACCESSORS  ^--------------


    //--------------v  MUTATORS  v--------------
    public SWASHBUCKLE setCargo( SWASHBUCKLE newCargo ) {
	SWASHBUCKLE foo = getCargo();
	_cargo = newCargo;
	return foo;
    }

    public LLNode<SWASHBUCKLE> setNext( LLNode<SWASHBUCKLE> newNext ) {
	LLNode<SWASHBUCKLE> foo = getNext();
	_nextNode = newNext;
	return foo;
    }
    //--------------^  MUTATORS  ^--------------


    // override inherited toString
    public String toString() { return _cargo.toString(); }


    //main method for testing
    //public static void main( String[] args )
  //  {

	//Below is an exercise in creating a linked list...

	//Create a node
//	LLNode first = new LLNode( "cat", null );

	//Create a new node after the first
	//first.setNext( new LLNode( "dog", null ) );

	//Create a third node after the second
	//first.getNext().setNext( new LLNode( "cow", null ) );

	/* A naive list traversal, has side effects.... ??
	   while( first != null ) {
	   System.out.println( first );
	   first = first.getNext();
	   }
	*/

	//Q: when head ptr moves to next node in list, what happens to the node it just left?

	//...so better: ?
	//
	//
	//

  //  }//end main

}//end class LLNode
