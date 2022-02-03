/**
APLE - Jacc Chen (Large) + Ivina Wang (Sealie)
APCS
HW24 -- Get It While You Can
2021-10-25

DISCO: We learned how to use .equals
- x += 1 is the same as x = x + 1

QCC: How do we make the thing a multiple of 2005?? 
-
*/

public class Driver {
  	public static void main( String[] args ) {
  		int x = 0;
  		int y = 0;
  		Coin aple = new Coin();
      Coin pear = new Coin("quarter", "Heads");
      aple.flip();

      while (y < 65536) {
      if (pear.equals(aple)) {
        x += 1;
      }
        y += 1;
        aple.flip();
    }

    System.out.println("Heads rolled: " + x);
    System.out.println("Matches made: " + y);
    System.out.println(y % 2005);
    }
}
/*
  		if x <= headCtr {
  			aple.flip();
        x += 1;
        y += 1;
  				While (y <= 65536)

  		While x <= headCtr {
  			aple.flip();
  			x += 1
  		}
  		return y
*/
