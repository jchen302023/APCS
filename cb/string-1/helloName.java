/* Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".

helloName("Bob") → "Hello Bob!"
helloName("Alice") → "Hello Alice!"
helloName("X") → "Hello X!" */
public class helloName {

public static String helloName(String name) {
  String n = name;
  return "Hello" + " " + n + "!";
}

public static void main (String[] args) {
  System.out.println(helloName("Bob"));
  System.out.println(helloName("Alice"));
  System.out.println(helloName("X"));
}

}
