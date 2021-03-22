package chapter7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Q6 {

	public static void main(String[] args) {
		try(BufferedReader in = new BufferedReader(new FileReader("C:\\git\\Laboratory\\java_gold_black\\src\\chapter6\\sample.txt"))) {
			
			for(int i = 0; i < 3; i++) {
				in.skip(i);
				System.out.print((char)in.read());
			}
			in.mark(3);
			System.out.print(in.readLine());
			in.reset();
			System.out.print((char)in.read());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
