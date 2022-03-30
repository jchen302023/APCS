/***
TNPG: BrainForked (Gloria Lee, Jack Chen, John Gupta-She)
APCS pd8
HW84 -- Stack: What Is It Good For? 
2022-03-29t
time spent: 0.5 hrs

DISCO:
- pop() returns what is popped, so we can use what is returned to check for matching parens in allMatched().
  Therefore, a peek isn't necessary. No peeky. 
- split("") splits the string into substrings at the places "" and puts the substrings as items in an array 

QCC:
- Text editors that check for matching brackets for you probably use something similar to allMatched()
- that was good. very fun. poggers.
- What am I good for? ): 
- What is the meaning of life?
- Slapped harder than Will Smith 

 * class LatKtS
 * SKELETON
 * driver class for Latkes
 * Uses a stack to reverse a text string, check for sets of matching parens.
 **/

public class LatKtS
{

  /***
   * precondition:  input string has length > 0
   * postcondition: returns reversed string s
   *                flip("desserts") -> "stressed"
   **/
  public static String flip( String s )
  {
    Latkes blueberry = new Latkes(s.length());
    String output = "";
    for (int i = 0; i < s.length() ; i ++) {
      blueberry.push(s.substring(i, i + 1)); 
    }
    while (!blueberry.isEmpty()) {
      output += blueberry.pop(); 
    }
    return output; 
  }


  /***
   * precondition:  s contains only the characters {,},(,),[,]
   * postcondition: allMatched( "({}[()])" )    -> true
   *                allMatched( "([)]" )        -> false
   *                allMatched( "" )            -> true
   **/
  public static boolean allMatched( String s )
  {
    boolean ret = false;
    Latkes strawberry = new Latkes(s.length());
    
    for(String str : s.split("")){
      
      if(str.equals("(")|| str.equals("[")|| str.equals("{")) {
        strawberry.push(str);
      }
    
      else {
        if (strawberry.isEmpty()){
          return false;
        }
        String buh = strawberry.pop();
        if(buh.equals("(")&& !str.equals(")")) {
          return false;
        }
        else if (buh.equals("[")&& !str.equals("]")) {
          return false;
        }
        else if (buh.equals("{")&& !str.equals("}")){
          return false;
        }
      }
    }
    return strawberry.isEmpty();
  }


  //main method to test
  public static void main( String[] args )
  {
  
    System.out.println(flip("stressed"));
    System.out.println(allMatched( "({}[()])" )); //true
    System.out.println(allMatched( "([)]" ) ); //false
    System.out.println(allMatched( "(){([])}" ) ); //true
    System.out.println(allMatched( "](){([])}" ) ); //false
    System.out.println(allMatched( "(){([])}(" ) ); //false
    System.out.println(allMatched( "()[[]]{{{{((([])))}}}}" ) ); //true
      /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
      ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/
  }

}//end class