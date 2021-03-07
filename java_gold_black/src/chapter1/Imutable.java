package chapter1;

public final class Imutable {
	private final int x;
	private final int[] array = {1, 2, 3};
	
	public Imutable(int x) {
		this.x = x;
	}
	
	public int getX() {
		return x;
	}
	
	public Imutable add(int x) {
		return new Imutable(this.x + x);
	}
}
