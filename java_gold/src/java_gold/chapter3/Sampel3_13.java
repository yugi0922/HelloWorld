package java_gold.chapter3;


class Gen<T>{
	private T var1;
	//private static T var2; // コンパイルエラー
	public Gen(T var1) {
		this.var1 = var1;
	}
	public T getVar() {
		return var1;
	}
	public void setVar1(T var1) {
		this.var1 = var1;
	}
}
public class Sampel3_13 {

	public static void main(String[] args) {
		Gen<String> g1 = new Gen<>("ABC");
		System.out.print(g1.getVar());
		g1.setVar1("DEF");
		System.out.println(" " + g1.getVar());
		Gen<Integer> g2 = new Gen<>(1);
		System.out.print(g2.getVar());
		g2.setVar1(2);
		System.out.println(" " + g2.getVar());
	}

}
