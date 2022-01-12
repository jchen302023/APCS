// TNPG: AllBread (Ivina Wang, Samantha Hua, Jack Chen)
// APCS pd07
// Lab02 -- utilizing ArrayList, designing and implementing a wrapper class
// 2022-01-11

/**********************************************
 * DISCO:
 * QCC:
 **********************************************/


import java.util.ArrayList;

public class OrderedArrayList
{

  // instance of class ArrayList, holding objects of type Integer
  // (i.e., objects of a class that implements interface Integer)
  private ArrayList<Integer> _data;


  // default constructor
  // initializes instance variables
  public OrderedArrayList()
  {
    _data = new ArrayList<Integer>();
  }


  //pass-tru functionality
  public String toString()
  {
    return _data.toString();
  }


  //pass-tru functionality
  /* -- remove
  * Big O classification of O(n)
  * Best Case: index is the last element
  * In the Best Case, the elements would not have to be shifted to the left
  * Worst Case: index is at the beginning, index is occupied
  * In the Worst Case, all the elements would have to be moved over to the left

  */
  public Integer remove( int index )
  {
    return _data.remove(index);
  }



  //pass-tru functionality
  /* -- size
  * Time complexity of O(1)
  * Point is moot, there is no best or worst case scenario because it has a time complexity
  of O(1). This means that regardless of the size of the array the method will take
  the same amount of time.
  */
  public int size()
  {
    return _data.size();
  }


  //pass-tru functionality
  /* -- get
  * Time complexity of O(1)
  * Point is moot, there is no best or worst case scenario because it has a time complexity
  of O(1). This means that regardless of the size of the array the method will take
  the same amount of time.
  */
  public Integer get( int index )
  {
    return _data.get(index);
  }

  /* -- set
  * Time complexity of O(1)
  * Point is moot, there is no best or worst case scenario because it has a time complexity
  of O(1). This means that regardless of the size of the array the method will take
  the same amount of time.
  */
  public int set( int index, int newVal )
  {
    int temp = _data[index];
    _data[index] = newVal;
    return temp;
  }


  //modified functionality
  //insert at appropriate location to maintain sortedness
  /* -- add (boolean)
  * Time complexity of O(1)
  * Point is moot, there is no best or worst case scenario because it has a time complexity
  of O(1). This means that regardless of the size of the array the method will take
  the same amount of time.
  * Big O classification can be O(n) if there is no more space in the array. It
  would then have to copy the contents of the previous array into a new one that
  is one index greater.
  */

  public boolean add( Integer newVal )
  {
    //call exactly 1 of the helper methods below...  your favorite?

    addLinear(newVal);
    //addBinary(newVal);
    return true;
  }

  /* -- add (void)
  * Big O classification of O(n)
  * Best Case: index is the last element, index unoccupied
  * Best Case does not involve having to shift elements
  * Worst Case: index is the first element, index occupied
  * In the Worst Case, every element after the first would have to be shifted 
  */
  public void add( int index, int newVal )
  {
    //first expand if necessary
    if ( _size >= _data.length )
      expand();
    for( int i = _size; i > index; i-- ) {
      _data[i] = _data[i-1]; //each slot gets value of left neighbor
    }
    _data[index] = newVal;
    _size++;
  }



  // inserts newVal at the appropriate index
  // maintains ascending order of elements
  // uses a linear search to find appropriate index
  public void addLinear(Integer newVal)
  {
    for( int p = 0; p < _data.size(); p++ ) {
      if ( newVal.compareTo( _data.get(p) ) < 0 ) {
        //newVal < oal[p]
        _data.add( p, newVal );
        return; //Q:why not break?
      }
    }
    _data.add( newVal ); //newVal > every item, so add to end
  }


  // inserts newVal at the appropriate index
  // maintains ascending order of elements
  // uses a binary search to find appropriate index
  public void addBinary(Integer newVal)
  {
    //initialize high, low, midpt indices
    int lo = 0;
    int med = 0;
    int hi = _data.size()-1;

    while ( lo <= hi ) { //running until target is found or bounds cross

      med = (lo + hi) / 2;
      int x = _data.get(med).compareTo( newVal );

      if ( x == 0 ) {
        //equal value found, insert here
        _data.add( med, newVal );
        return;
      }
      else if ( x > 0 )
        //newVal < med, so look at lower half of data
        hi = med - 1;
      else
        //newVal > med, so look at upper half of data
        lo = med + 1;
    }
    // If you made it this far, newVal is not present.
    // So insert at lo.
    _data.add( lo, newVal );
    //Q: How do you know lo is correct insertion index?
  }


}//end class OrderedArrayList
