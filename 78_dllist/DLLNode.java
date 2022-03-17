/*****************************************************
 * class LLNode
 * Implements a node, for use in lists and other container classes.
 * Stores its data as a String
 *****************************************************/

public class DLLNode
{
    //instance vars
    private String _cargo;    //cargo may only be of type String
    private DLLNode _prevNode; //pointer to previous DLLNode
    private DLLNode _nextNode;//point to next DLLNode
    
    // constructor -- initializes instance vars
    public DLLNode( DLLNode prev, String value, DLLNode next ) {
	_cargo = value;
  _prevNode = prev;
	_nextNode = next;
    }


    //--------------v  ACCESSORS  v--------------
    public String getCargo() { return _cargo; }

    public DLLNode getNext() { return _nextNode; }
    
    public DLLNode getPrev() { return _prevNode; }
    //--------------^  ACCESSORS  ^--------------


    //--------------v  MUTATORS  v--------------
    public String setCargo( String newCargo ) {
	String foo = getCargo();
	_cargo = newCargo;
	return foo;
    }
    
    public DLLNode setPrev( DLLNode newPrev ) {
	DLLNode foo = getPrev();
  //newPrev = newPrev.setNext(this);
	_prevNode = newPrev;
	return foo;
    }
    
    public DLLNode setNext( DLLNode newNext ) {
	DLLNode foo = getNext();
  //newNext = newNext.setPrev(this);
	_nextNode = newNext;
	return foo;
    }
    

    //--------------^  MUTATORS  ^--------------

    
    // override inherited toString
    public String toString() { 
      
      return _cargo.toString(); 
    }


    //main method for testing
    public static void main( String[] args )
    {

	//Below is an exercise in creating a linked list...

	//Create a node
	DLLNode first = new DLLNode( null, "cat", null );
  System.out.println(first);

	//Create a new node after the first
	first.setNext( new DLLNode( null, "dog", null ) );
  System.out.println(first.getNext());


	//Create a third node after the second
	first.setPrev( new DLLNode( null, "cow", null ) );
  System.out.println(first.getPrev());


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
	
    }//end main

}//end class LLNode