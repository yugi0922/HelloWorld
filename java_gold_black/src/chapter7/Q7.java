package chapter7;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Q7 {

	public static void main(String[] args) {
		try(PrintWriter writer = new PrintWriter("out.txt")){
			writer.println("Hello");
			writer.println("0.5");
			writer.println(true);
			
		} catch (Exception e) {
			// TODO ©“®¶¬‚³‚ê‚½ catch ƒuƒƒbƒN
			e.printStackTrace();
		}

	}

}
