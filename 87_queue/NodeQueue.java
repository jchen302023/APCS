// Team BrainForked (Gloria Lee, Jack Chen, John Gupta-She)
// APCS pd8
// HW 87- The English Do Not Wait In Line For Soup
// 2022-04-03
// time spent: 0.7  hr
/*
QCC:
  - It's chewsday innit?
  - What are QUASARs? (im thinking quesedillas)
DISCO:
  - This hw incorporated classes within classes. In this case, because LLNode was not static, it was an inner class.
  - We put class LLNode inside of NodeQueue so that it can access the methods from LLNode.
*/
public class NodeQueue<QUASAR> implements Queue<QUASAR>{

  private LLNode<QUASAR> _head;
  private int _size;


  public NodeQueue(){
    _size = 0;
    _head = null; //new LLNode<QUASAR>(null, null);
  }

  //means of removing an element from collection:
  //Dequeues and returns the first element of the queue.
  public QUASAR dequeue(){
    if (isEmpty()) {
      System.out.println("no");
      return null;
    }
    else {
      QUASAR old = _head.getCargo();
      _head = _head.getNext();
      _size --;
      return old;
    }
  }

  //means of adding an element to collection:
  //Enqueue an element onto the back of this queue.
  public void enqueue( QUASAR x ) {
    if (isEmpty()){
      _head = new LLNode<QUASAR>(x, null);
    }

    LLNode<QUASAR> newNode = new LLNode<QUASAR>( x, null );
	    LLNode<QUASAR> tmp = _head;
	    for( int i=0; i < _size-1; i++ )
        tmp = tmp.getNext();
	    newNode.setNext( tmp.getNext() );
	    tmp.setNext( newNode );
	    _size++;
  }

  //Returns true if this queue is empty, otherwise returns false.
  public boolean isEmpty() {
    return _size == 0;
  }

  //Returns the first element of the queue without dequeuing it.
  public QUASAR peekFront() {
    return _head.getCargo();
  }


public class LLNode<QUASAR> {
  //instance vars
  private QUASAR _cargo;
  private LLNode<QUASAR> _nextNode;

  // constructor
  public LLNode( QUASAR value, LLNode<QUASAR> next )
  {
    _cargo = value;
    _nextNode = next;
  }


  //--------------v  ACCESSORS  v--------------
  public QUASAR getCargo()
  {
    return _cargo;
  }

  public LLNode<QUASAR> getNext()
  {
    return _nextNode;
  }
  //--------------^  ACCESSORS  ^--------------


  //--------------v  MUTATORS  v--------------
  public QUASAR setCargo( QUASAR newCargo )
  {
    QUASAR foo = getCargo();
    _cargo = newCargo;
    return foo;
  }

  public LLNode<QUASAR> setNext( LLNode<QUASAR> newNext )
  {
    LLNode<QUASAR> foo = getNext();
    _nextNode = newNext;
    return foo;
  }
  //--------------^  MUTATORS  ^--------------


  // override inherited toString
  public String toString()
  {
    return _cargo.toString();
  }

}//end class LLNode

public static void main(String[] args) {

  NodeQueue<String> rodents = new NodeQueue<String>();
  rodents.enqueue("mouse");
  rodents.enqueue("rat");
  rodents.enqueue("mole");
  rodents.enqueue("ferret");

  System.out.println(rodents.peekFront());
  rodents.dequeue();
  System.out.println(rodents.peekFront());
  rodents.dequeue();
  System.out.println(rodents.peekFront());
  rodents.dequeue();
  System.out.println(rodents.peekFront());
}


}
