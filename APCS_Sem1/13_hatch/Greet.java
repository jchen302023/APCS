/*
Team A Duo That is Actually a Trio : Brandon Ariel Jacc (N/A, Ducky, Large)
APCS
HW13: Where do BigSibs come from? Task: make a copy of your working Greet.java
and add a constructor to class BigSib so it could run greet without 
richard.setHelloMsg("Word up");
2021-10-06
*/

public class Greet {
   public static void main(String[] args)
     { String greeting;

     BigSib richard = new BigSib();
     
     //richard.setHelloMsg("Word up ");
     greeting = richard.greet("freshman");
     System.out.println(greeting);

     //richard.setHelloMsg("Salutations ");
     greeting = richard.greet("Dr. Spaceman");
     System.out.println(greeting);

     //richard.setHelloMsg("Hey ya ");
     greeting = richard.greet("Kong Fooey");
     System.out.println(greeting);

     //richard.setHelloMsg("Sup ");
     greeting = richard.greet("mom");
     System.out.println(greeting);
     }
}