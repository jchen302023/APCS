/*Jacc Chen
  APCS
  HW21: Statistically Speaking
*/


public class Stats {

  public static int mean(int a, int b) {
  	int ab = ((a + b) / 2);
        return (ab);   
  }

  public static double mean(double a, double b) {
        return ((double) (a + b) / 2); 
  }

  public static int max(int a, int b) {
        if (a > b) {
        	return (a); }
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
	int ab = a * b;
        return (int) Math.sqrt(ab);
  }

  public static double geoMean(double a, double b) {
  	double ab = a * b;
	return (double) Math.sqrt(ab);

  }

  /* public static int max(int a, int b, int c) {

  }

  public static double max(double a, double b, double c) {

  }

  public static int geoMean(int a, int b, int c) {

  }

  public static double geoMean(double a, double b, double c) {

  } */ 
}