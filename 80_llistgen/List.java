// Team BrainForked (Gloria Lee, Jack Chen, John Gupta-She)
// APCS pd8
// HW80: Generically Speaking
// 2022-03-24r
// time spent: 1  hr
/***
 * interface List
 * subset of actual Java List interface
 * Specifies actions a List must be able to perform.
 *
 * If placed in current working dir, will be consulted instead of
 *  built-in Java library interface.
 *
 * new in version 2.0:
 * REMOVE-AT-INDEX
 * ADD-AT-INDEX
 **/

public interface List<rat>
{
  //add node to list, containing input String as its data
  public boolean add( rat x );

  //insert at specified index
  public void add( int index, rat newVal );

  //remove node from list, return its data
  public rat remove( int index );

  //return data in element at position i
  public rat get( int i );

  //overwrite data in element at position i
  public rat set( int i, rat x );

  //return length of list
  public int size();

}//end interface