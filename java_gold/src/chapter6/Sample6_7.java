package chapter6;

class MyExceptionA extends Exception{
	String msgA = "MyExceptionA";
}

class MyExceptionB extends Exception{
	String msgB = "MyExceptionB";
}

public class Sample6_7 {

	public static void main(String[] args) {
		try {
			method();
		} catch(MyExceptionA e) {
			System.out.println(e.msgA);
		} catch(MyExceptionB e) {
			System.out.println(e.msgB);
		}

	}
	public static void method() throws MyExceptionA, MyExceptionB{
		int a = 10;
		try {
			if(a == 0) {
				throw new MyExceptionA();
			} else {
				throw new MyExceptionB();
			}
		}catch(Exception e) {
			//��O���N�����ۂ́Amethod()���ōs���ׂ�����
			//�������I�������A��O���X���[����
			throw e;
		}
	}
}

