package chapter1;

public class Q19Main {

	public static void main(String[] args) {
		Q19 q19 = new Q19(); //Outerインスタンスの生成
		Q19.Inner inner = q19.new Inner(); //Innerインスタンスの生成	
		inner.doIt(); // Innerインスタンスのメソッド呼び出し
		
	}
}
