package chapter9;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Q7 {

	public static void main(String[] args) {
		try(InputStream in = new FileInputStream("example.properties")){
			Properties props = new Properties();
			props.load(in);
			System.out.println(props.getProperty("A"));
			
		} catch (IOException e) {
			// TODO é©ìÆê∂ê¨Ç≥ÇÍÇΩ catch ÉuÉçÉbÉN
			e.printStackTrace();
		}

	}

}
