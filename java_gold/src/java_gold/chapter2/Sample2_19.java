package java_gold.chapter2;


class Outer{ //外側のクラス
	private int val1 = 100; //インスタンス変数
	private static int val2 = 200; //static変数


	class A{ //非staticクラス(インナークラス)
		void method1() { //非staticメソッド
			System.out.println("instance val :" + val1);
		}
//		static void method2() { //staticメソッド
//			System.out.println("static val: + val2");
//		}
	}
	
	static class B { //staticクラス
//		void method1() { //非staticメソッド
//			System.out.println("instance val" + val1);
//		}
		static void method2() {
			System.out.println("static val:" + val2);
		}
	}
}
public class Sample2_19 {

	public static void main(String[] args) {
		Outer.A a = new Outer().new A(); //非staticクラスのインスタンス化
		Outer.B b = new Outer.B();
		a.method1();
		b.method2();
	}

}
