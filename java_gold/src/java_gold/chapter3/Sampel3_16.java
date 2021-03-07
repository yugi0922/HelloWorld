package java_gold.chapter3;


//ジェネリクスを用いた独自クラス
class GenC<T extends Number>{
	private T var;
	public GenC(T var){
		this.var = var;
	}
	public void display() {
		System.out.println(var);
	}
}

public class Sampel3_16 {

	public static void main(String[] args) {
		// Integerを扱うGenオブジェクトの生成
		GenC<Integer> g1 = new GenC<>(100);
		g1.display();
		// Doubleを扱うGenプロジェクトの生成
		GenC<Double> g2 = new GenC<>(3.14);
		g2.display();

	}

}
