package java_gold.chapter3;


//�W�F�l���N�X��p�����Ǝ��N���X
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
		// Integer������Gen�I�u�W�F�N�g�̐���
		GenC<Integer> g1 = new GenC<>(100);
		g1.display();
		// Double������Gen�v���W�F�N�g�̐���
		GenC<Double> g2 = new GenC<>(3.14);
		g2.display();

	}

}
