package chapter9;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Q8 {
	public static void main(String[] args) {
		try(InputStream in = new FileInputStream("example.properties")){
			Properties props = new Properties();
			props.load(in);
			
			props.list(System.out);
			props.forEach((k, v) -> System.out.println(k + ":" + v));
			
		} catch (IOException e) {
			// TODO ©“®¶¬‚³‚ê‚½ catch ƒuƒƒbƒN
			e.printStackTrace();
		}
		
	}
}
