package chapter8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Sample8_6 {

	public static void main(String[] args) {
		try(BufferedWriter bw =
				new BufferedWriter(new FileWriter("C:\\git\\Laboratory\\java_gold\\src\\chapter8\\8_6.txt"));
			BufferedReader br = 
					new BufferedReader(new FileReader("C:\\git\\Laboratory\\java_gold\\src\\chapter8\\8_6.txt"))){
			bw.write("‚¨‚Í‚æ‚¤");
			bw.newLine();
			bw.write("‚±‚ñ‚É‚¿‚Í");
			bw.flush();
			String date = null;
			while((date = br.readLine()) != null) {
				System.out.println(date);
			}
						
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
