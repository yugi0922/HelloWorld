package protoType;

import protoType.flameWork.Product;

public class MassageBox implements Product {

	private char decoChar;
	public MassageBox(char decoChar){
		this.decoChar = decoChar;
	}
	@Override
	public void use(String s) {
		int length = s.getBytes().length;
		for(int i = 0; i < length + 4; i++){
			System.out.print(decoChar);
		}
		System.out.println("");
		System.out.println(decoChar + " " + s + " " + decoChar);
		for(int i = 0; i < length + 4; i++){
			System.out.print(decoChar);
		}
		System.out.println("");
	}

	@Override
	public Product createClone() {
		Product p = null;
		try{
			p = (Product)clone();
		} catch (CloneNotSupportedException e){
			e.printStackTrace();
		}
		return p;
	}

}
