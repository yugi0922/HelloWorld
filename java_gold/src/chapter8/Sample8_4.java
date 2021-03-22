package chapter8;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Sample8_4 {

	public static void main(String[] args) {
		try(DataOutputStream dos =
				new DataOutputStream(new FileOutputStream("C:\\git\\Laboratory\\java_gold\\src\\chapter8\\8_4.txt"));
			DataInputStream dis =
				new DataInputStream(new FileInputStream("C:\\git\\Laboratory\\java_gold\\src\\chapter8\\8_4.txt"));
				){
			dos.writeInt(100);
			dos.writeUTF("tanaka");
			dos.writeUTF("“c’†");
			System.out.println(dis.readInt());
			System.out.println(dis.readUTF());
			System.out.println(dis.readUTF());
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
