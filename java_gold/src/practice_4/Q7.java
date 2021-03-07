package practice_4;


class Test_B{
	public static void main(String[] args) {
		method((x, y) -> true, 3.0);
	}
	static void method(Q7 obj, double d) {
		if(obj.bar(9.0, d)) System.out.println("a");
		else System.out.println("b");
	}
}

public interface Q7 {
	boolean bar(double a, double b);
}
