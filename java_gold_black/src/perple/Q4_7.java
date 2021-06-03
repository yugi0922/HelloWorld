package perple;


interface Foo {
	boolean bar(double a, double b);
}

public class Q4_7 {

	public static void main(String[] args) {
		method( (double x, double y) -> x + y > 200, 3.0);

	}
	
	static void method(Foo obj, double d) {
		if(obj.bar(9.0, d)) {
			System.out.println("true");
		}else {
			System.out.println("false");			
		}
	}

}
