package bridge;

public class Main {

	public static void main(String[] args) {
		Display d1 = new Display(new StringDisplayImpl("1です"));
		Display d2 = new CountDisplay(new StringDisplayImpl("2!"));
		CountDisplay d3 = new CountDisplay(new StringDisplayImpl("3!"));
		d1.display();
		d2.display();
		d3.display();
		d3.multiDisplay(5);
	}
}
