/*
public class GrokStatic {
  public static int classField;
  public int instanceField;

  public static void classMethod( int x) {
    classField = 13;
    //instanceField = 17;
    classMethod (19) ;
    //instanceMethod (23) ;

  }
  public void instanceMethod (int y) {
    classField = 29;
    instanceField = 31;
    classMethod (37 );
   instanceMethod (23);
  }
}
*/

/*
public class GrokStatic {
  public static int cmethod(int n) {

    for (int i=0; i<50; i++) {
      n= (n + 3)/2;
    }
    return n;
  }
  public static void main(String[] args) {
    System.out.println( cmethod(253));
  }
} // question 24
*/
/*
public class Grokstatic {
  public static void twist(String[] w) {
    String temp = w[0].substring(0,1);
    w[0] = w[1].substring(0,1) + w[0].substring(1);
    w[1] = temp + w[1].substring(1);
  }
  public static void main(String[] args) {
    String [] words = {"HOW", "NEAT"};
    twist(words);
    System.out.println(words[0] + " " + words[1]);
  }
}
*/

public class GrokStatic {
  int func (int n ) {
    int result;
    result = func (n - 1);
    return result;
  }
}
