/// TNGP: Puntu (Anjini Katari, Jacc Chen)
// APCS1 pd7
// HW45 -- Array of Titanium
// 2021-12-08

/***************************
 * class SuperArray version 2.0
 * (SKELETON)
 * Wrapper class for array. Facilitates
 * resizing
 * expansion
 * read/write capability on elements
 * adding an element to end of array
 * adding an element at specified index
 * removing an element at specified index
 ***************************/
 /**
 DISCO:
  * Abstract is a kew word but doesn't seem to help us at all. When
    trying 'public class SuperArray implements ListInt', errors were
    found when trying to initialize class meepo
  * When coding, take things literally...many mistakes and misunderstandings
    can be made otherwise... :(

 QCC:
  * What in the bleeding christ does is abstract do??
  * Something to test- what would happen if we added a main method
    into ListInt.java?
 **/

public class SuperArray implements ListInt
{

  private int[] _data;  //underlying ("encapsulated") container
  private int _size;    //number of elements in this SuperArray


  //default constructor – initializes 10-item array
  public SuperArray()
  {
    _data = new int[10];
    _size = 0;
  }


  //output SuperArray in [a,b,c] format
  public String toString()
  {
    String foo = "[";
    for( int i = 0; i < _data.length; i++ ) {
      foo += _data[i] + ",";
    }
    if ( foo.length() > 1 )
      //shave off trailing comma
      foo = foo.substring( 0, foo.length()-1 );
    foo += "]";
    return foo;
  }


  //double capacity of SuperArray
  private void expand()
  {
    int[] temp = new int[ _data.length * 2 ];
    for( int i = 0; i < _data.length; i++ ) {
      temp[i] = _data[i];
    }
    _data = temp;
  }


  //accessor -- return value at specified index
  public int get( int index )
  {
    return _data[index];
  }


  //mutator -- set value at index to newVal,
  //           return old value at index
  public int set( int index, int newVal ) {
    int temp = _data[index];
    _data[index] = newVal;
    return temp;
  }


  //adds an item after the last item
  public boolean add( int newVal ) {
    int[] mouse = new int[_size + 1];
    for (int i = 0; i < _size; i++) {
      mouse[i] = _data[i];
    }
    mouse[_size] = newVal;
    _data = mouse;
    _size += 1;
    System.out.println(_size);
    return true;
  } // add


  //inserts an item at index
  public boolean add( int index, int newVal ) {
    int[] mole = new int[_size + 1];
    for (int i = 0; i < index; i++) {
      mole[i] = _data[i];
    }
    mole[index] = newVal;
    for (int h = index + 1; h < _size + 1; h++) {
      mole[h] = _data[h - 1];
    }
    _data = mole;
    _size += 1;
    return true;
  }


  //removes the item at index
  //shifts elements left to fill in newly-empted slot
  public void remove( int index ) {
    int[] capybara = new int[_size - 1];
    for (int i = 0; i < index; i++) {
      capybara[i] = _data[i];
    }
    for (int h = index + 1; h <= _size - 1; h++) {
      capybara[h - 1] = _data[h];
    }
    _data = capybara;
    _size -= 1;
  } // remove


  //return number of meaningful items in _data
  public int size()
  {
    return _size;
  }



  //main method for testing
  public static void main( String[] args )
  {
      SuperArray meepo = new SuperArray();
      System.out.println("Printing empty SuperArray meepo...");
      System.out.println(meepo);

      meepo.add(5);
      meepo.add(4);
      meepo.add(3);
      meepo.add(2);
      meepo.add(1);

      System.out.println("Printing populated SuperArray meepo...");
      System.out.println(meepo);

      meepo.remove(3);
      System.out.println("Printing SuperArray meepo post-remove...");
      System.out.println(meepo);
      meepo.remove(3);
      System.out.println("Printing SuperArray meepo post-remove...");
      System.out.println(meepo);

      meepo.add(3,99);
      System.out.println("Printing SuperArray meepo post-insert...");
      System.out.println(meepo);

      meepo.add(2,88);
      System.out.println("Printing SuperArray meepo post-insert...");
      System.out.println(meepo);

      meepo.add(1,77);
      System.out.println("Printing SuperArray meepo post-insert...");
      System.out.println(meepo);

    //  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|~~~~~~~~*/
  }//end main()


}//end class
