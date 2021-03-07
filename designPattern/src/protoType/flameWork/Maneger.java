package protoType.flameWork;

import java.util.HashMap;

public class Maneger {
	private HashMap showCase = new HashMap();
	public void register(String name, Product proto){
		showCase.put(name, proto);
	}
	public Product create(String ProtoName){
		Product p = (Product)showCase.get(ProtoName);
		return p.createClone();
	}
}
