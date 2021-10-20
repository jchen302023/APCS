/*
Jacc Chen
APCS
HW20: External Audit 
DISCO: Error with the .setPin area because it was a short and not an int
so had to include (short) 7777. Variable for name (Jacc) cannot be found for
.setAccNum()? 
*/

  public class Teller { 
	public static void main (String[] args) {
		BankAccount Jacc = new BankAccount();
		Jacc.setName("Jack");
                Jacc.setPasswd("wee");
                Jacc.setPin((short) 7777);
                Jacc.setAcctNum(123456789);
                Jacc.setBalance (5);
                Jacc.deposit (1);
                Jacc.withdraw (3);
                Jacc.authenticate(123456789, "wee");
                System.out.println(Jacc.toString());
	}
}


