/*
  Jacc Chen
  APCS
  HW21: Statistically Speaking
  2021-10-20
  DISCO: Java math!! Wacky. Why do data types sometimes don't have to be mentioned
  but in other places they do, and it has to be stated in parentheses. Java's "and"
  statement is two ands: &&. 
  QCC: Math.sqrt built in? Saves us work. Can we use less parantheses because it 
  is starting to get annoying? I need more efficient way. 
*/


public class Stats {

  public static int mean(int a, int b) {
  	int ab = ((a + b) / 2); // return ((a + b) / 2); works too
	System.out.println(ab);
        return (int) (ab);   
	
  }

  public static double mean(double a, double b) {
        //return ((double) (a + b) / 2); 
	double ab = ((a + b) / 2);
        System.out.println(ab);
	return (double) ab; 
  }

  public static int max(int a, int b) {
        if (a > b) {
        	return (int)(a); }
        else {
        	return (b); }
  }

  public static double max(double a, double b) {
	if (a > b) {
        	return (a); }
        else {
        	return (b); }
  }

  public static int geoMean(int a, int b) {
	//int ab = a * b;
        //return (int) Math.sqrt(ab);
	int ab = (int) Math.sqrt(a * b);
        System.out.println(ab);
        return(ab);
  }

  public static double geoMean(double a, double b) {
  	double ab = a * b;
	return (double) Math.sqrt(ab);

  }

  public static int max(int a, int b, int c) {
	if (a > b && a > c) {
		return (a); }
        else if (b > a && b > c) {
		return (b); }
        else {
		return (c); }
  }

  public static double max(double a, double b, double c) {
	if (a > b && a > c) {
		return (double) (a); }
        else if (b > a && b > c) {
		return (double) (b); }
        else {
		return (double) (c); }
  }

  public static int geoMean(int a, int b, int c) {
	int abc = a * b * c;
        return (int) Math.cbrt(abc);
  }

  public static double geoMean(double a, double b, double c) {
	double abc = a * b * c;
        return (double) Math.cbrt(abc);
  } 
} // finish, wooo!! 