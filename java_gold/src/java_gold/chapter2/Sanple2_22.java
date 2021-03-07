package java_gold.chapter2;

class Outer22{
	private static int a = 1; //static変数
	private int b = 2; // インスタンス変数
	void methodOuter(final int c, int d) {
		final int e = 5;
		int f = 6;
		class A{
			void method() {
				System.out.print(a + " ");
				System.out.print(b + " ");
				System.out.print(c + " ");
				System.out.print(d + " ");
				System.out.print(e + " ");
				System.out.print(f + " ");
				//e = 100;
				//f = 100;
			}
		}
		new A().method();
	}	
}

public class Sanple2_22 {

	public static void main(String[] args) {
		Outer22 o = new Outer22();
		o.methodOuter(3, 4);
	}

}
