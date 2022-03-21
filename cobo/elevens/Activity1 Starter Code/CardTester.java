/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card car1 = new Card("King", "Hearts", 13);
		System.out.println(car1);
		Card car2 = new Card("Queen", "Hearts", 12);
		System.out.println(car2);
		Card car3 = new Card("Ace", "Spades", 1);
		System.out.println(car3);
		System.out.println(car1.matches(car2));
	}
}
