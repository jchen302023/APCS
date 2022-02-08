public class YoRPG {

public static void main(String[] args) {

String s1 = "foo";
String s2 = "foo";
String s3 = new String("foo");

System.out.println( s1 ); foo
System.out.println( s2 ); foo
System.out.println( s3 ); foo
System.out.println( s1 == s2 ); // true
System.out.println( s1 == s3 ); // false
System.out.println( s1.equals(s2) ); // true
System.out.println( s1.equals(s3) ); // true

/*
String s1 = "foo";
String s2 = "foo";
String s3 = new String("foo");

System.out.println( s1 ); //--> ? foo
System.out.println( s2 ); //--> ? foo
System.out.println( s3 ); //--> ? weird thingy
System.out.println( s1 == s2 ); //--> ?
System.out.println( s1 == s3 ); //--> ?
System.out.println( s1.equals(s2) ); //--> ?
System.out.println( s1.equals(s3) ); //--> ?
*/
}

}
