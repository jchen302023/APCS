/*
Team A Duo That is Actually a Trio : Brandon Ariel Jacc (Nameless, Skeleducky III, Large)
APCS
HW14: Customize your creation
2021-10-07
DISCO: This one returns salutations for the first message?? 
QCC: Can we make the string hellomessage private to each new instance of BigSib? 
*/

public class BigSib {

	private String hellomessage;
        
	public BigSib()
        {
         hellomessage = "Word Up";
         hellomessage = "Hey ya";
         hellomessage = "Sup";
         hellomessage = "Salutations";
	}
	public BigSib(String msg)
	{
	 hellomessage = msg;
	}

	public String greet(String name)
	{
	 return(hellomessage + " " + name);
	}
}