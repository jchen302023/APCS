/*
Team Jelly: Lea Brandon Jacc (Gunter, Ducky, Large)
APCS
HW12: On Elder Individuality and the Elimination of Radio Fuzz
2021-10-06
*/
/* DISCO: Prints out freshmanfreshman. I don't know how to get it to work. Best I could
do. Don't know how to refer back to the name from setHelloMsg so that I can use it in the greet.
Tried putting it outside the method boxes but it just said non-static variables cannot be referenced
in a static context. Also I got a lot of stack overflows. 
QCC: Help.
*/ 

public class BigSib {
    
     public static String setHelloMsg(String name) 
     {String hellomessage;

      return (name); 
     }

     public static String greet(String name)
     { String greet;
      
      String hellomessage = setHelloMsg(name);
      
      return (hellomessage + name);
     }
 
}
       