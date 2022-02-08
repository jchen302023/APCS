public class Driver {
  public static void main(String[] args) {
    Rational r = new Rational(1, 2);
    Rational t = new Rational(2, 3);
    Rational s = new Rational(3, 4);
    Rational u = new Rational(1, 2);
    System.out.println(r.compareTo(t)); // -1
    System.out.println(s.compareTo(t)); // 1
    System.out.println(u.compareTo(r)); // 0 
  }
}
