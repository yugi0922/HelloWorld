package chapter1;

public class Q19 {
	public class Inner{
		public void doIt() {
			System.out.println("Outer.Inner.doIt()");
		}
	}
	
//	public class Other{ //ほかのクラス
//		public void doIt() {
//			Q19 q19 = new Q19(); //Outerインスタンスの生成
//			Q19.Inner inner = q19.new Inner(); //Innerインスタンスの生成
//			inner.doIt(); // Innerインスタンスのメソッド呼び出し
//		}
//	}
}
