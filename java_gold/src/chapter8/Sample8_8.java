package chapter8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Sample8_8 {

	public static void main(String[] args) {
		Employee writeEmp = new Employee(100, "tanaka");
		try(ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("C:\\git\\Laboratory\\java_gold\\src\\chapter8\\8_8.txt"));
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\git\\Laboratory\\java_gold\\src\\chapter8\\8_8.txt"))){
			oos.writeObject(writeEmp);
			Employee readEmp = (Employee)ois.readObject();//ì«Ç›çûÇ›
			System.out.println("ID :" + readEmp.getId());
			System.out.println("Name:" + readEmp.getName());
			
		} catch (IOException  | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
