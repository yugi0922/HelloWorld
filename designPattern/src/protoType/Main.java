package protoType;

import protoType.flameWork.Maneger;
import protoType.flameWork.Product;

public class Main {

	public static void main(String[] args) {
		// 準備
		Maneger maneger = new Maneger();
		UnderlinePen upen = new UnderlinePen('~');
		MassageBox mbox = new MassageBox('*');
		MassageBox sbox = new MassageBox('/');
		maneger.register("String message", upen);
		maneger.register("warning box", mbox);
		maneger.register("slash box", sbox);


		// 生成
		Product p1 = maneger.create("String message");
		p1.use("Hello World");
		Product p2 = maneger.create("warning box");
		p2.use("Hello World");
		Product p3 = maneger.create("slash box");
		p3.use("Hello World");

	}

}
