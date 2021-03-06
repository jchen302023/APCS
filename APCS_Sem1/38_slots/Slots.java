/*****************************************************
 * TNPG Puntu (Anjini Katari and Jacc Chen)
 * APCS pd07
 * HW38 -- Spin Class
 * 2021-11-18
 * time spent: 2.5h

 DISCO:
  * (redisco) putting (int) in front of something you want to turn into an int
    will do just that- turn the value into an int
  * Make sure you're using the right arrays when working

 QCC:
  * How do we get rid of the 'null' in front of the fruit?
  * Do we need to have a Jackpot method? Does it make much of a difference if we
    put everything in miniWin instead?

 *****************************************************/

public class Slots {

  //instance variable to represent master copy for slot machine
  private static final String[] FRUITS = {
    "lime", "lime", "lime",
    "lemon", "lemon", "lemon",
    "cherry", "cherry", "cherry",
    "orange", "orange", "orange",
    "grapefruit", "grapefruit", "grapefruit",
    "mango", "mango", "mango",
    "tangerine", "tangerine", "tangerine",
    "ugli", "ugli", "ugli",
    "peach", "peach", "peach"
  };

  private static String[] _fruits; //to be init'd by each instance

  /*=====================================
    Slots() -- default constructor
    pre:  constant array FRUITS exists, has been initialized
    post: mutable array _fruits contains same elements as FRUITS
    =====================================*/
  public Slots() {
    int lenFRUITS = FRUITS.length;

    //allocate memory for _fruits based on size of FRUITS:
    _fruits = new String[lenFRUITS];

    //copy elements of FRUITS into _fruits:
    for (int i = 0; i < lenFRUITS; i += 1) {
      _fruits[i] += FRUITS[i];
    }
  }

  /*=====================================
    Do this first
    String toString() -- overrides inherited toString()
    pre:
    post: returns String of elements in slots 0 thru 2, separated by tabs
    =====================================*/
  public String toString() {
	  String fruits = "";
	  fruits += _fruits[0] + "|" + _fruits[1] + "|" + _fruits[2];
	  return fruits;
  }

  /*=====================================
    void swap(int,int) -- array swap util fxn
    pre:  _fruits array exists
    post: elements at indices i, j are swapped
    =====================================*/
private void swap( int i, int j ) {
  String extra = _fruits[i];
  if (_fruits.length > 0) {
    _fruits[i] = _fruits[j];
    _fruits[j] = extra;
    //System.out.println("swap: i = " + i + " | j = " + j + " | extra = " + extra);
  }
}

  /*=====================================
    void spinOnce() -- simulate a pull of the slot machine lever
    pre:  _fruits array exists
    post: randomized order of elements in _fruits array
    =====================================*/
 public void spinOnce() {
   int fruLen = _fruits.length;
   int rand;
    // A simple approach to shuffling:
    // iterate through the array, swapping
    // the val at each index with a randomly chosen other index
    for(int i = 0; i < fruLen; i += 1) {
      rand = (int) (Math.random() * fruLen);
      //System.out.println("rand: " + rand + "  i: " + i);
      swap(i, rand);
    }
  }

  /*=====================================
    boolean jackpot() -- checks for a winning combo
    pre:  _fruits is existing array
    post: returns true if first 3 slots represent winning combo,
    false otherwise
    =====================================*/
  public boolean jackpot(){
    boolean retBoo = false;
    String zero = _fruits[0], one = _fruits[1], two = _fruits[2];
    if (zero.equals(one) && zero.equals(two)) {
      return true;
    }
    return retBoo;
  }

  /*=====================================
    boolean miniWin() -- checks for a winning combo
    pre:  _fruits is existing array
    post: returns true if first 3 slots represent winning combo,
    or if first 3 slots mutually distinct,
    false otherwise
    =====================================*/
  public boolean miniWin(){
    String zero = _fruits[0], one = _fruits[1], two = _fruits[2];
    boolean retBoo = false;
    if (jackpot() == true || !(zero.equals(one)) && !(zero.equals(two)) ) {
      return true;
    }
    return retBoo;
  }

  //main() method for testing
  public static void main( String[] args ) {
    Slots machine01 = new Slots();
    Slots machine02 = new Slots();
    //test to verify slot machines function indepently
    System.out.println();
    System.out.println( "Machine01 initial state:\t" + machine01 );
    System.out.println( "Machine02 initial state:\t" + machine02 );

    System.out.println( "\nSpinning machine01...\n" );

    machine01.spinOnce();

    System.out.println();
    System.out.println( "Machine01 state:\t" + machine01 );
    System.out.println( "Machine02 state:\t" + machine02 );
    System.out.println();

    //test gamble-until-you-win mechanism
    System.out.println( "Preparing to spin until a mini win! . . ." );
    System.out.println( "------------------------------------" );

    //if you haven't won, spin again until you win!
    while( machine01.miniWin() == false ) {
      System.out.println( "Your spin..." + "\t" + machine01 );
      System.out.println( "LOSE\n" );
      machine01.spinOnce();
    }
    System.out.println( "====================================" );
    System.out.println( "Your spin..." + "\t" + machine01 );
    System.out.println( "WIN\n" );

    System.out.println( "Preparing to spin until...jackpot! . . ." );
    System.out.println( "------------------------------------" );

    //if you haven't won, spin again until you win!
    while( machine01.jackpot() == false ) {
      System.out.println( "Your spin..." + "\t" + machine01 );
      System.out.println( "LOSE\n" );
      machine01.spinOnce();
    }
    System.out.println( "====================================" );
    System.out.println( "Your spin..." + "\t" + machine01 );
    System.out.println( "JACKPOT!\n" );
  }//end main
}//end class Slots
