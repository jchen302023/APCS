/******************************************************
 * ALGORITHM for EVALUATING A SCHEME EXPRESSION:
 * . . .  . . .
 *
 * STACK OF CHOICE: _______ by ______ b/c . . .
 ******************************************************/



/***
 * class Scheme
 * Simulates a rudimentary Scheme interpreter
 *
 * ALGORITHM for EVALUATING A SCHEME EXPRESSION:
 *   1. Steal underpants.
 *   2. ...
 *   5. Profit!
 *
 * STACK OF CHOICE: ____ by ____
 * b/c ...
 **/

public class Scheme
{
  /***
   * precond:  Assumes expr is a valid Scheme (prefix) expression,
   *           with whitespace separating all operators, parens, and 
   *           integer operands.
   * postcond: Returns the simplified value of the expression, as a String
   * eg,
   *           evaluate( "( + 4 3 )" ) -> 7
   *	         evaluate( "( + 4 ( * 2 5 ) 3 )" ) -> 17
   **/
  static int ret = 0; 
  public static String evaluate( String expr )
  {
    LLStack stacko = new LLStack<String>();
    String[] dummy = expr.split("\\s+"); 
    for(int i = dummy.length- 1; i > 0; i --){
      stacko.push(dummy[i]); 
      }
      // stacko.pop();
      // String oper = stacko.pop();
      // int op;
      // if(oper.equals("+")){
      //   op = 1;
      // }
      // if(oper.equals("-")){
      //   op = 2;
      // }
      // if(oper.equals("*")){
      //   op = 3;
      // }
    return unload(1, stacko); 
    
  }//end evaluate()


  /***
   * precond:  Assumes top of input stack is a number.
   * postcond: Performs op on nums until closing paren is seen thru peek().
   *           Returns the result of operating on sequence of operands.
   *           Ops: + is 1, - is 2, * is 3
   **/
  public static String unload( int op, Stack<String> numbers )
  {
    
    if(numbers.peekTop().equals("(")) {
      numbers.pop();
      String oper = numbers.peekTop();
      if(oper.equals("+")){
        op = 1;
      }
      if(oper.equals("-")){
        op = 2;
      }
      if(oper.equals("*")){
        op = 3;
      }
      numbers.pop();
      return unload(op, numbers); 
    }
    
    // String out = numbers.pop();
    // int ret = Integer.parseInt(out);
    
    if (numbers.peekTop().equals(")")){
      return Integer.toString(ret);
    }
    

    if (isNumber(numbers.peekTop())) {
      if (op == 1) {
          ret = ret + Integer.parseInt(numbers.pop());
          // numbers.push(Integer.toString(ret));
          return unload(op, numbers); 
        }
      if (op == 2) {
          ret =  Integer.parseInt(numbers.pop()) - ret;
          // numbers.push(Integer.toString(ret));
          return unload(op, numbers); 
        }
      if (op == 3) {
          ret = ret * Integer.parseInt(numbers.pop());
          // numbers.push(Integer.toString(ret));
          return unload(op, numbers); 
        }
      
    }
    
    return Integer.toString(ret);
  
  }//end unload()


  
  //optional check-to-see-if-its-a-number helper fxn:
  public static boolean isNumber( String s ) {
  try {
  Integer.parseInt(s);
  return true;
  }
  catch( NumberFormatException e ) {
  return false;
  }
  }
  


  //main method for testing
  public static void main( String[] args )
  {

  
      String zoo1 = "( + 4 3 )";
      System.out.println(zoo1);
      System.out.println("zoo1 eval'd: " + evaluate(zoo1) );
      //...7

      String zoo2 = "( + 4 ( * 2 5 ) 3 )";
      System.out.println(zoo2);
      System.out.println("zoo2 eval'd: " + evaluate(zoo2) );
      //...17

      String zoo3 = "( + 4 ( * 2 5 ) 6 3 ( - 56 50 ) )";
      System.out.println(zoo3);
      System.out.println("zoo3 eval'd: " + evaluate(zoo3) );
      //...29

      String zoo4 = "( - 1 2 3 )";
      System.out.println(zoo4);
      System.out.println("zoo4 eval'd: " + evaluate(zoo4) );
      //...-4
        /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
      ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/
  }//main()

}//end class Scheme