//TNPG: BrainForked
//APCS pd8
//HW76 -- We Got a Little Old Convoy 
//2022-03-11f
//time spent: 1.1 hrs 
//KTS used: 1 page (each)

/***
 * class LList
 * Implements a linked list of LLNodes, each containing String data
 **/

public class LList implements List //interface def must be in this dir
{

  //instance vars
  private LLNode _head;
  private int _size;

  // constructor -- initializes instance vars
  public LList( )
  {
    _head = new LLNode(null, null);
    _size = 0; 
    
  }


  //--------------v  List interface methods  v--------------

  public boolean add( String newVal )
  {
    LLNode newHead = new LLNode(newVal, _head);
    _head = newHead;
    _size += 1;
    return true;    
                                // LLNode temp = _head;
                                // while(temp != null){
                                //   temp = temp.getNext();
                                // }
                                // 
                                // temp.setNext(new LLNode (newVal, null));
                                // _head = temp;
  }
  
  
  public String get( int index )
  {
    if ( index < 0 || index >= size() )
      throw new IndexOutOfBoundsException();
    LLNode temp = _head;
    for (int i = 0; i < _size; i ++) {
      if (i == index) {
        return temp.getCargo(); 
      }
      else {
        
        temp = temp.getNext();
      }
    }
      
    // YOUR CODE HERE
    return "foo"; 
  }
  
  
  public String set( int index, String newVal )
  {
  
    if ( index < 0 || index >= size() )
      throw new IndexOutOfBoundsException();
    LLNode temp = _head;
    for (int i = 0; i < _size; i ++) {
      if (i == index) { 
        String oldHead = temp.getCargo();
        temp.setCargo(newVal);
        return oldHead;
      }
      else {
        temp = temp.getNext();
      }
    }
    // YOUR CODE HERE
    return "foo";
  }
  
  
  //return number of nodes in list
  public int size()
  {

    return _size; 
  }
  
  //--------------^  List interface methods  ^--------------
  
  
  
  // override inherited toString
  public String toString()
  {
    LLNode rat = _head;
    while( rat != null ) {
      System.out.println( rat );
      rat = rat.getNext();
    }
      return ""; 
  }
  

  //main method for testing
  public static void main( String[] args )
  {
    
    LList james = new LList();

    System.out.println( james );
  
    System.out.println( "size: " + james.size() );
  
    james.add("beat");
    System.out.println( james );
    System.out.println( "size: " + james.size() );

    james.add("a");
    System.out.println( james );
    System.out.println( "size: " + james.size() );

    james.add("need");
    System.out.println( james );
    System.out.println( "size: " + james.size() );

    james.add("I");
    System.out.println( james );
    System.out.println( "size: " + james.size() );

    System.out.println( "2nd item is: " + james.get(1) );

    james.set( 1, "got" );
    System.out.println( "...and now 2nd item is: " + james.set(1,"got") );

    System.out.println( james );
    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }

}//end class LList