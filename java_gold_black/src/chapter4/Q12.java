package chapter4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q12 {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new FileReader("src/chapter4/sample.txt"))){
			br.lines().forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
