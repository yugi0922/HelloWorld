package chapter8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Sample8_3 {

	public static void main(String[] args) {

		try(FileOutputStream fos = new FileOutputStream(new File("C:\\git\\Laboratory\\java_gold\\src\\chapter8\\8_3.txt"));
		    FileInputStream fis = new FileInputStream(new File("C:\\git\\Laboratory\\java_gold\\src\\chapter8\\8_3.txt"));
				
				){
			fos.write(0);
			fos.write("suzuki".getBytes());
			fos.write(99);
			int date = 0;
			while((date = fis.read()) != -1) {
				//読み込んだデータの表示
				System.out.println(date + " ");
			}
			
		} catch (FileNotFoundException e) {
			System.err.println("ファイルがありません");
			
		} catch (IOException e) {
			System.out.println("IO Error");
		}

	}

}
