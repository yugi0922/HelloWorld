package template;

public class Main {

	public static void main(String[] args) {

		AbstractDisplay dChar = new CharDisplay('H');
		AbstractDisplay dString = new StringDisplay("Hello,World");

		dChar.display();
		dString.display();

	}

}
