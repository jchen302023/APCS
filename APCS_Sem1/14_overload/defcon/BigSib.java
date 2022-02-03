/*
Team A Duo That is Actually a Trio : Brandon Ariel Jacc (Nameless, Skeleducky III, Large)
APCS
HW14: Customize your creation
2021-10-07
DISCO: Default structure for a constructor, state hellomessage as variable 
and stores into for msg from the new BigSib classes. Greet then puts everything 
together. Constructors must be public. 
QCC: I'm still thinking it over. 
*/

public class BigSib {

     String hellomessage;

     public BigSib(String msg)
     {
      hellomessage = msg;
     }

     public String greet(String name)
     {
      return(hellomessage + " " + name);
     }
}