package chapter2;

public class Product implements Comparable<Product> {
	private int id;
	private String name;
	public Product(int id, String name) {
		this.id = id;
		this.name = name;
	}
	@Override
	public int compareTo(Product p1) {
		return this.id - p1.id  ;
	}
	
	@Override
	public String toString() {
		return id + ":" + name;
	}
	
	
	
}
