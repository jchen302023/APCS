/*
Team A Duo That is Actually a Trio : Brandon Ariel Jacc (Nameless, Skeleducky III, Large)
APCS
HW14: Customize your creation
2021-10-07
*/

public class Greet {
   public static void main(String[] args) 
   {
    String greeting;

    BigSib richard = new BigSib("Word up");
    BigSib grizz = new BigSib("Hey ya");
    BigSib dotCom = new BigSib("Sup");
    BigSib tracy = new BigSib("Salutations");

    greeting = richard.greet("freshman");
    System.out.println(greeting);
    greeting = grizz.greet("Dr.Freeman");
    System.out.println(greeting);
    greeting = dotCom.greet("Kong Fooey");
    System.out.println(greeting);
    greeting = tracy.greet("mom");
    System.out.println(greeting);
   }
}

