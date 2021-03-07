package java_gold.chapter2;


class Outer{ //�O���̃N���X
	private int val1 = 100; //�C���X�^���X�ϐ�
	private static int val2 = 200; //static�ϐ�


	class A{ //��static�N���X(�C���i�[�N���X)
		void method1() { //��static���\�b�h
			System.out.println("instance val :" + val1);
		}
//		static void method2() { //static���\�b�h
//			System.out.println("static val: + val2");
//		}
	}
	
	static class B { //static�N���X
//		void method1() { //��static���\�b�h
//			System.out.println("instance val" + val1);
//		}
		static void method2() {
			System.out.println("static val:" + val2);
		}
	}
}
public class Sample2_19 {

	public static void main(String[] args) {
		Outer.A a = new Outer().new A(); //��static�N���X�̃C���X�^���X��
		Outer.B b = new Outer.B();
		a.method1();
		b.method2();
	}

}
