/*****************************************************
 * TNPG Puntu (Anjini Katari and Jacc Chen)
 * APCS pd07
 * HW41 -- Be Rational
 * 2021-12-01

 DISCO: rat1 keeps the value after each time it is multiplied or divided and it
 carries over to the next dot method you call on it as well, so it keeps stacking.

 QCC: Is it possible to make rat1's value reset after each method is called? 

 *****************************************************/

public class Rational {

  private int numerator;
  private int denominator;

  public Rational() {
    numerator = 0;
    denominator = 1;
  } //constructor

  public Rational(int a, int b) {
      numerator = a;
      denominator = b;

 } // overloaded cons?

  public String toString() {
    String mouse = numerator + "/" + denominator;
    return mouse;
  } // toString

  public float floatValue() {
    float mice = (float) numerator / (float) denominator;
    return mice;
  } // floatValue

  public void multiply(Rational rat) {
    numerator = numerator * rat.numerator;
    denominator = denominator * rat.denominator;
  } // multiply

  public void divide(Rational rat) {
    numerator = numerator * rat.denominator;
    denominator = denominator * rat.numerator;
  }

  public static void main(String[] args) {
    Rational rat1 = new Rational(2, 3);
    Rational rat2 = new Rational(1, 2);
    Rational rat3 = new Rational();
    System.out.println("=======================");
    System.out.println(" String of Rats: ");
    System.out.println(rat1.toString());
    System.out.println(rat2.toString());
    System.out.println(rat3.toString());
    System.out.println("=======================");
    System.out.println(" Float of Rats: ");
    System.out.println(rat1.floatValue());
    System.out.println(rat2.floatValue());
    System.out.println(rat3.floatValue());
    System.out.println("=======================");
    System.out.println(" Multiplying Rats: ");
    rat1.multiply(rat2);
    System.out.println("rat1 after multiplying... " + rat1.toString());
    System.out.println("rat2 after multiplying... " + rat2.toString());
    rat1.multiply(rat2);
    System.out.println("rat1 after multiplying again... " + rat1.toString());
    System.out.println("=======================");
    System.out.println(" Dividing Rats: ");
    rat1.divide(rat2);
    System.out.println("rat1 after dividing... " + rat1.toString());
    System.out.println("rat2 after dividing... " + rat2.toString());
    rat1.divide(rat2);
    System.out.println("rat1 after dividing again... " + rat1.toString());

 } // main


} //class
