package java_gold.chapter3;

class GenB{
	private String var1 = "aaa";
	public<T> T method(T value) {
		return value;
	}
	public String getVar1() {
		return var1;
	}
}
public class Sampel3_14 {

	public static void main(String[] args) {
		GenB g = new GenB();
		Integer i = g.method(1);
		System.out.println(i);
		String s1 = g.method("ABC");
		String s2 = g.<String>method("abc");
		System.out.println(s1 + " " + s2);
	}

}
