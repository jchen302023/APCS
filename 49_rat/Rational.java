// TNPG: Puntu (Anjini Katari, Jacc Chen)
// APCS p7
// HW42 -- Be more rational
// 2021-12-02

/**
 * class Rational (v1)
 * stores a rational number (p/q s.t. p,q ints && q!=0)
 * facilitates
 * multiplication
 * division

DISCO:
* using this. makes things more precise so that there are fewer mess ups in the future
* (double) a / b is the same as (double) a / (double) b

 **/

public class Rational implements Comparable
{
  //   Instance variables for numerator and denominator
  private int _numerator;
  private int _denominator;


  // Default constructor (no parameters)
  // creates a new Rational with value 0/1
  public Rational()
  {
    _numerator = 0;
    _denominator = 1;
  }


  // Constructor
  // takes 2 parameters, one for the numerator, one for the denominator
  // if an invalid denominator is attempted, should print a message and set the number to 0/1
  public Rational( int n, int d )
  {
    this();
    if ( d != 0 ) {
      _numerator = n;
      _denominator = d;
    }
    else {
      System.out.println( "Invalid number. " +
                          "Denominator set to 1." );
    }
  }


  // toString
  // returns a string representation of the rational number (formatting of your choice)
  public String toString()
  {
    return _numerator + " / " + _denominator;
  }


  // floatValue
  // returns floating point approximation of the number
  // uses the most precise floating point primitive
  public double floatValue()
  {
    return (double)_numerator / _denominator;
  }


  // multiply
  // takes a Rational parameter and multiplies it by this Rational
  // does not return a value
  // modifies this object, leaves parameter alone
  // need not reduce
  public void multiply( Rational r )
  {
    _numerator   = this._numerator   * r._numerator;
    _denominator = this._denominator * r._denominator;
  } // multiply


  // divide
  // works the same as multiply, except the operation is division
  public void divide( Rational r )
  {
    if ( r._numerator != 0 ) {
      _numerator   = this._numerator   * r._denominator;
      _denominator = this._denominator * r._numerator;
    }
    else {
      System.out.println( "Div by 0 error. Values unchanged." );
    }
  } // divide

public int gcdiv(int a, int b) {
  int gcd = 1;
  int i = 1;
    while (i <= a && i <= b) {
        if (a % i == 0 && b % i == 0) {
            gcd = i;
        }
        i++;
    }
     return gcd;
} // helper method gcd

public int lcm(int a, int b) {
  int lcm = a * (b / gcdiv(a , b));
  return lcm;
} // helper lcm

public void add(Rational r) {
  if (_denominator == r._denominator) {
    _numerator = this._numerator + r._numerator;
    _denominator = this._denominator;
  }
  else {
    _numerator = ((lcm(this._denominator, r._denominator) / this._denominator) * this._numerator) + ((lcm(this._denominator, r._denominator) / r._denominator) * r._numerator);
    _denominator = lcm(this._denominator, r._denominator);
  }
} // add

public void subtract(Rational r) {
  int commond = lcm(this._denominator, r._denominator);
  if (_denominator == r._denominator) {
    _numerator = this._numerator - r._numerator;
    _denominator = this._denominator;
  }
  else {
    _numerator = ((commond / this._denominator) * this._numerator) - ((commond / r._denominator) * r._numerator);
    _denominator = commond;
  }
} // subtract

public void reduce() {
  int commonfactor = gcdiv(_numerator, _denominator);
  _numerator = this._numerator / commonfactor;
  _denominator = this._denominator / commonfactor;
} // reduce
/*
public int compareTo(Rational r) {
  int commondenom = lcm(this._denominator, r._denominator);
  if (_numerator == r._numerator && _denominator == r._denominator) {
    return 0;
  }
  if ((((commondenom / this._denominator) * this._numerator) - ((commondenom / r._denominator) * r._numerator)) > 0 ) {
    return 1;
  }
  else {
    return -1;
  }
} // compareTo
*/

public int compareTo(Object x) {
  if (x instanceof Rational && this.floatValue() > ((Rational) x).floatValue()) {
    return 1;
  }
  if (x instanceof Rational && this.floatValue() < ((Rational) x).floatValue()) {
    return -1;
  }
  if (x instanceof Rational && this.floatValue() == ((Rational) x).floatValue()) {
    return 0;
  }
  return 10;
} // compareTO

  //main method for testing
  public static void main( String[] args )
  {
      Rational r = new Rational( 3, 7 );
      Rational s = new Rational();
      Rational t = new Rational( 8, 5 );

      Rational u = new Rational( 1, 2 );
      Rational v = new Rational( 2, 3 );
      Rational w = new Rational( 8, 12 );

      Rational x = new Rational( 8, 12 );
      String y = "yoo";

      System.out.println("r: " + r );
      System.out.println("s: " +  s );
      System.out.println("t: " +  t );

      System.out.println( r + " as a floating pt approximation: "
      + r.floatValue() );
      System.out.println( s + " as a floating pt approximation: "
      + s.floatValue() );
      System.out.println( t + " as a floating pt approximation: "
      + t.floatValue() );

      System.out.print( r + " * " + t + " = ");
      r.multiply(t);
      System.out.println(r);

      System.out.print( r + " / " + t + " = ");
      r.divide(t);
      System.out.println(r);

      System.out.print( u + " + " + u + " = ");
      u.add(u);
      System.out.println(u);

      System.out.print( u + " + " + v + " = ");
      u.add(v);
      System.out.println(u);

      System.out.print( u + " - " + v + " = ");
      u.subtract(v);
      System.out.println(u);

      System.out.print( u + " reduced is... ");
      u.reduce();
      System.out.println(u);

      System.out.print( r + " reduced is... ");
      r.reduce();
      System.out.println(r);

      System.out.print( u + " compared to " + u + " = ");
      System.out.println(u.compareTo(u));

      System.out.print( v + " compared to " + w + " = ");
      System.out.println(v.compareTo(w));

      System.out.print( t + " compared to " + u + " = ");
      System.out.println(t.compareTo(u));

    /*~~~~~v~~~~~~~~~~down~goer~3~~~~~~~~~~~~~v~~~~~
      ~~~~~|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|~~~~~*/
  }

}//end class
