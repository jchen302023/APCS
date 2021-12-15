
// TNPG: Puntu (Anjini Katari, Jacc Chen)
// APCS pd7
// HW47 -- Guess Again
// 2021-12-15w
// time spent: _ hrs

/***
 * class GuessNumber -- fun fun fun!
 *
 * SKELETON
 *
 * eg, sample interaction with end user:
 *
 * Guess a # fr 1-100: 50
 * Too high
 * Guess a # fr 1-49: 25
 * Too low
 * Guess a # fr 26-49: 38
 * Correct! It took 3 guesses
 ***/

/***
    DISCO:
    * Don't overthink things too much, bad for brain
    * Check closet for skeletons
    * Java rounds at the very end when there is (int) at beginning of operations 
    * You can use return; to break while loop 

    QCC:
    * (From QAF) What happens if _hi and _lo are equal?

 ***/
import java.util.Scanner;

public class GuessNumber
{

  //instance vars
  private int _lo, _hi, _guessCtr, _target;
  Scanner sc = new Scanner( System.in );


  /*==================================================
    constructor -- initializes a guess-a-number game
    pre:
    post: _lo is lower bound, _hi is upper bound,
    _guessCtr is 1, _target is random int on range [_lo,_hi]
    ==================================================*/
  public GuessNumber( int a, int b )
  {
    _lo = Math.min(a,b);
    _hi = Math.max(a,b);
    _guessCtr = 1;
    _target = (int) (Math.random() * ((_hi - _lo) + 1)) + _lo;
    //pick random number in range [a,b]

    /* Math.Ran returns 0.0 - 1.0, not including 1.0
       Math.Ran returns 0 -> _lo
       Math.Ran returns value close to 1.0, java rounds up 1 so it can be _hi
    */
  }


  /*==================================================
    void playRec() -- Prompts a user to guess until guess is correct.
    Uses recursion.
    ==================================================*/
  public void playRec() {

    System.out.print("Guess a num bt " + _lo + " & " + _hi + ": ");
    int guess = sc.nextInt();

    //3 cases: we either found it, too hi, too lo
    if ( guess == _target) {
      System.out.println("Correct! It took you " + _guessCtr + " guesses.");
      if (_guessCtr > 5) {
        System.out.println("You should git gud.");
      }
      return;
    } // if correct
    if ( guess < _target) {
      System.out.println("Too low");
      _lo = guess + 1;
      _guessCtr += 1;
      playRec();
    } // if too low
    if ( guess > _target) {
      System.out.println("Too high");
      _hi = guess - 1;
      _guessCtr += 1;
      playRec();
    } // if too high
  } // play rec


  /*==================================================
    void playIter() -- Prompts a user to guess until guess is correct.
    Uses iteration.
    ==================================================*/
  public void playIter()
  {

    int guess;

    while( true ) {
      System.out.print("Guess a num bt " + _lo + " & " + _hi + ": ");
      guess = sc.nextInt();

      //3 cases: we either found it, too hi, too lo

      if ( guess == _target) {
        System.out.println("Correct! It took you " + _guessCtr + " guesses.");
        if (_guessCtr > 5) {
          System.out.println("You should git gud.");
        }
        return;
      } // if correct
      if ( guess < _target) {
        System.out.println("Too low");
        _lo = guess + 1;
        _guessCtr += 1;
      } // if too low
      if ( guess > _target) {
        System.out.println("Too high");
        _hi = guess - 1;
        _guessCtr += 1;
      } // if too high

      _guessCtr++;
    }
  } // play iter


  //wrapper for playRec/playIter to simplify calling
  public void play()
  {
    //use one or the other below:
    //playRec();
    playIter();
  }


  //main method to run it all
  public static void main( String[] args )
  {
    /*-----------------------------
        -----------------------------*/
    //instantiate a new game
    GuessNumber g = new GuessNumber(1,100);

    //start the game
    g.play();

  }

}//end class GuessNumber
