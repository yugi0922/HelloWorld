package chapter1;

public class Q19Main {

	public static void main(String[] args) {
		Q19 q19 = new Q19(); //Outer�C���X�^���X�̐���
		Q19.Inner inner = q19.new Inner(); //Inner�C���X�^���X�̐���	
		inner.doIt(); // Inner�C���X�^���X�̃��\�b�h�Ăяo��
		
	}
}
