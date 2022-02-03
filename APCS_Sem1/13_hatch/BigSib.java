/*
Team A Duo That is Actually a Trio : Brandon Ariel Jacc (N/A, Ducky, Large)
APCS
HW13: Where do BigSibs come from? Task: make a copy of your working Greet.java
and add a constructor to class BigSib so it could run greet without 
richard.setHelloMsg("Word up");
2021-10-06
*/
/* DISCO: String hellomessage - "Word up"; is the same as declaring variable
hellomessage with String hellomessage; and assigning it hellomessage = "Word up";
Commented out lines with richard.setHelloMsg("Word up") on Greet.java
QCC: Can we make hellomessage have different values? Because running it right
now in the copy of Greet.java returns Word up freshman, Word up Dr. Spaceman, 
Word up Kong Fooey, Word up mom. 

*/
public class BigSib {
     String hellomessage = "Word up";
     {
     public String greet(String name)
     {
      return hellomessage + " " + name; 
     }
}