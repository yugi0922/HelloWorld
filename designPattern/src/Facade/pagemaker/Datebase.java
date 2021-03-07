package Facade.pagemaker;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Datebase {
	private Datebase(){

	}

	public static Properties getProperties(String dbName){
		String filename = dbName + ".txt";
		Properties prop = new Properties();
		try{
			prop.load(new FileInputStream(filename));
		} catch (IOException ie) {
			System.out.println("Warning: " + filename + " is not found.");
		}
		return prop;
	}
}
