// TNPG: Puntu (Anjini Katari, Jacc Chen)
// APCS pd7
// HW43 -- encapsulation (basic SuperArray functionality)
// 2021-12-07

/***************************
 * class SuperArray
 * Wrapper class for array. Facilitates resizing,
 * getting and setting element values.
 ***************************/

public class SuperArray
{

  private int[] _data;  //underlying container
  private int _size;    //number of elements in this SuperArray


  //default constructor – initializes 10-item array
  public SuperArray() {
    _data = new int[10];
    _size = _data.length;
  }


  //output SuperArray in [a,b,c] format
  public String toString() {
    String answer = "[";

    for (int i = 0; i < _size; i++) {
      answer += _data[i] + ", ";
    }
    answer += _data[_size - 1] + "]";
    return answer;
  } // toString


  //double capacity of SuperArray
  private void expand() {
    System.out.println("Length of curtis: " + _data.length);
    int _newsize = _size * 2;
    int[] _newdata = new int[_newsize];
    for (int i = 0; i < this._size; i++ ) {
      _newdata[i] = this._data[i];
    }
    _size = _newsize; 
    _data = _newdata;

  } // expand


  //accessor -- return value at specified index
  public int get( int index )
  {
    return _data[index];

  }


  //mutator -- set value at index to newVal,
  //           return old value at index
  public int set( int index, int newVal )
  {
    _data[index] = newVal;
    return _data[index];
  }


  //main method for testing
  public static void main( String[] args )
  {

      SuperArray curtis = new SuperArray();
      System.out.println( "Printing empty SuperArray curtis..." );
      System.out.println( curtis );

      for( int i = 0; i < curtis._data.length; i++ ) {
      curtis.set( i, i * 2 );
      }

      System.out.println("Printing populated SuperArray curtis...");
      System.out.println(curtis);

      for( int i = 0; i < 3; i++ ) {
      curtis.expand();
      System.out.println("Printing expanded SuperArray curtis...");
      System.out.println(curtis);
      }
      /*~~~~~~~~move~me~down~~~~~~~~~~~~~~V~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|~~~~~~~~*/
  }//end main()


}//end class
