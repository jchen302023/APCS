/*
Team Jelly: Lea Brandon Jacc (Gunter, Ducky, Large)
APCS
HW12: On Elder Individuality and the Elimination of Radio Fuzz
10/5/21
*/

public class Greet {
   public static void main(String[] args)
     { String greeting;

     BigSib richard = new BigSib();
     richard.setHelloMsg("Word up ");

     greeting = richard.greet("freshman");
     System.out.println(greeting);

     richard.setHelloMsg("Salutations ");
     greeting = richard.greet("Dr. Spaceman");
     System.out.println(greeting);

     richard.setHelloMsg("Hey ya ");
     greeting = richard.greet("Kong Fooey");
     System.out.println(greeting);

     richard.setHelloMsg("Sup ");
     greeting = richard.greet("mom");
     System.out.println(greeting);
     }
}