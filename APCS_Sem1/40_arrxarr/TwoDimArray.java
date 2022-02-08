/******************************
 * class TwoDimArray
 * (skeleton)
 * practice working with 2D arrays
 ******************************/

// TNPG: Puntu (Anjini Katari, Jacc Chen)
// APCS pd7
// HW40 -- Demand a Raise
// 2021-11-30
/**
DISCO: - m1.length returns the # of rows
       - m1[i].length returns the length of the rows
QCC: - How can I make the println so that the first bracket is in line with the
     first row and same for the last bracket?
     - FOREACH loop for print2, how can we make it so that the last int for the
     arrays in the rows does not have a comma after it?
**/

public class TwoDimArray
{
  //postcond: prints each row of 2D int array a on its own line
  //          uses a FOR loop

  public static void print1( int[][] a ) {

    System.out.println("This Array:");
    System.out.println("{");
    for (int i = 0; i < a.length; i++) {
      System.out.print("{" + a[i][0]);
      for (int h = 1; h < a[i].length; h++) {
        System.out.print(", " + a[i][h]);
      }
      System.out.println("}");
    }
    System.out.println("}");

  } // print1


  //postcond: prints each row of 2D int array a on its own line
  //          uses a FOREACH loop
  public static void print2( int[][] a ) {
    System.out.println("This Array P2: ");
    System.out.println("{");
    for (int[] small : a) {
      System.out.print("{");
      for (int mini : small) {
      System.out.print(mini + ", ");
        }
      System.out.println("}");
    }
    System.out.println("}");
  } // print2


  //postcond: returns sum of all items in 2D int array a
  public static int sum1( int[][] a ) {
    int answer = 0;
    for (int[] small : a) {
      for (int mini : small) {
        answer += mini;
      }
    }
    return answer;
  } // sum 1



  //postcond: returns sum of all items in 2D int array a
  //          * uses helper fxn sumRow
  public static int sum2( int [][] m ) {
    int answer = 0;
    for (int i = 0; i < m.length; i++) {
      answer += sumRow(i, m);
    }
    return answer;
  } // sum 2


  //postcond: returns sum of all items on row r of 2D int array a
  //          uses a FOR loop
  public static int sumRow( int r, int[][] a ) {
    int answer = 0;
    for (int i = 0; i < a[r].length; i++) {
      answer += a[r][i];
    }
    return answer;
  } //sumRow


  //postcond: returns sum of all items on row r of 2D int array a
  //          uses a FOREACH loop
  public static int sumRow2(int r, int[][] m)
  {
    int summer = 0;
    for (int icecream : m[r]) {
      summer += icecream;
    }
    return summer;
  } // sumRow2


  public static void main( String [] args )
  {

      int [][] m1 = new int[4][2];
      int [][] m2 = { {2,4,6}, {3,5,7} };
      int [][] m3 = { {2}, {4,6}, {1,3,5} };
      System.out.println("length of m1: " + m1.length);
      System.out.println("length of m2: " + m2.length);
      System.out.println("length of m3[2]: " +m3[2].length);
      print1(m1);
      print1(m2);
      print1(m3);
      print2(m1);
      print2(m2);
      print2(m3);

      System.out.print("testing sum1...\n");
      System.out.println("sum m1 : " + sum1(m1));
      System.out.println("sum m2 : " + sum1(m2));
      System.out.println("sum m3 : " + sum1(m3));

      System.out.print("testing sum2...\n");
      System.out.println("sum m1 : " + sum2(m1));
      System.out.println("sum m2 : " + sum2(m2));
      System.out.println("sum m3 : " + sum2(m3));
      /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

    // your own custom test cases welcomed and encouraged
  }

}//end class TwoDimArray
