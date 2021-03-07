package chapter1;

public class Mutable {
	private int x;
	private int[] array = {1, 2, 3};
	public Mutable(int x) {
		this.x = x;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	public int getX() {
		return x;
	}
	
	public int[] getArray() {
		return array;
	}
	
	public void add(int x) {
		this.x = x;
	}
	
	public Mutable getInstance() {
		return this;
	}

}
