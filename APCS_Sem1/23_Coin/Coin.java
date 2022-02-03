/***
 * APLWE : Ivina Wang (Sealie), Jacc Chen (Large) 
 *  APCS
 *  HW23: What does Equality look like? 
 *  QCC: How do we output "yours: quarter -- null" when the first constructor
only gives you the name of the coin and not the upFace? What does this. mean?
 * DISCO: We used Math.random() to get a random number between 0.0 and 1.0 for
for the bias. If you do not spell variables correctly it becomes a whole new variable.

 ***/

public class Coin {

  //attributes aka instance vars
  public double value;
  public String upFace;
  public String name;
  public int flipCtr;
  public int headsCtr;
  public int tailsCtr;
  public double bias;
  
  /***
   *  Coin() -- default constuctor
   *  precond:
   *  postcond:
   ***/
  public Coin() {
	
  }


  /***
      Coin(String) -- overloaded constructor
      precond: input is one of
      "penny",
      "nickel",
      "dime",
      "quarter",
      "half dollar",
      "dollar"
      postcond:
  ***/
  
  public Coin( String s ) {
	name = s;
  }


  /***
      Coin(String,String) --
      precond:
      postcond:
  ***/

  public Coin( String s, String nowFace ) {
	name = s;
	upFace = nowFace;
  }

/*
  // Accessors...
  // ----------------------------
  public String getUpFace() {
  }
  public int getFlipCtr() {
  }
  public double getValue() {
  }
  public int getHeadsCtr() {
  }
  public int getTailsCtr() {
  }
  // ----------------------------
*/

  /***
   * assignValue() -- set a Coin's monetary value based on its name
   * precond:  input String is a valid coin name ("penny", "nickel", etc.)
   * postcond: instvar value gets appropriate value
   * Returns value assigned.
   ***/

  private double assignValue( String s ) {
	if (s == "penny") {
    value = 0.01;
    return value;
  }
    else if (s == "nickel") {
      value = 0.05;
      return value;
    }
    else if (s == "dime") {
      value = 0.10;
      return value;
    }
    else if (s == "quarter") {
      value = 0.25;
      return value;
    }
    else if (s == "half dollar") {
      value = 0.50;
      return value;
    }
    else {
      value = 1.00;
      return value;
    }
}
  


  /***
      reset() -- initialize a Coin
      precond:  s is "heads" or "tails", 0.0 <= d <= 1.0
      postcond: Coin's attribs reset to starting vals
  ***/

  public void reset( String s, double d ) {
	value = 0.00;
        upFace = s;
        name = null;
        flipCtr = 0;
        headsCtr = 0;
        tailsCtr = 0;
  }


  /***
   * String flip() -- simulates a Coin flip
   * precond:  bias is a double on interval [0.0,1.0]
   * (1.0 indicates always heads, 0.0 always tails)
   * postcond: upFace updated to reflect result of flip.
   * flipCtr incremented by 1.
   * Either headsCtr or tailsCtr incremented by 1, as approp.
   * Returns "heads" or "tails"
   ***/

  public String flip() {
	double bias = Math.random();
	if (bias > 0.5) {
	  upFace = "Heads";
          headsCtr = headsCtr + 1; }
        else {
          upFace = "Tails";
	  tailsCtr = tailsCtr + 1;
          }
        flipCtr = headsCtr + tailsCtr; 
        return upFace;
  }


  /***
   * boolean equals(Coin) -- checks to see if 2 coins have same face up
   * precond: other is not null
   * postcond: Returns true if both coins showing heads
   * or both showing tails. False otherwise.
   ***/

  public boolean equals( Coin other ) {
	if (upFace == other.upFace) {
	return true; }
        else 
	{return false;}
  }

  /***
   * String toString() -- overrides toString() provided by Java
   * precond: n/a
   * postcond: Return String comprised of name and current face
   ***/

  public String toString() {
	return name + " -- " + upFace;  
  }
	
}//end class