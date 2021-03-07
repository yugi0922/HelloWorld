package practice_4;

public interface Q7_I {
	boolean bar(double a, double b);
}

class Test{
	public static void main(String[] args) {
		method((x, y) -> true, 3.0);
	}
	static void method(Q7_I obj, double d) {
		if(obj.bar(9.0, d)) System.out.println("a");
		else System.out.println("b");
	}
}
