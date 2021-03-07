package java_gold.chapter2;

interface MyInter1{
	double methodA(int num);
	
	default void methodB() {
		System.out.println("methodB()");
	}
}

interface MyInter2{
	int methodC(int val1, int val2);
	
	static void mathodD() {
		System.out.println("mathodD()");
	}
}

class MyClass implements MyInter1, MyInter2{

	
	@Override
	public double methodA(int num) {
		return num * 0.3;
	}
	
	@Override
	public int methodC(int val1, int val2) {
		return val1 + val2;
	}

}
public class Sample2_10 {

	public static void main(String[] args) {
		MyClass obj = new MyClass();
		System.out.println("methodA():" + obj.methodA(10));
		System.out.println("methodC()" + obj.methodC(10, 20));
		obj.methodB();
		MyInter2.mathodD();
		//obj.methodD();;

	}

}
