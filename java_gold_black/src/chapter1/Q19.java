package chapter1;

public class Q19 {
	public class Inner{
		public void doIt() {
			System.out.println("Outer.Inner.doIt()");
		}
	}
	
//	public class Other{ //�ق��̃N���X
//		public void doIt() {
//			Q19 q19 = new Q19(); //Outer�C���X�^���X�̐���
//			Q19.Inner inner = q19.new Inner(); //Inner�C���X�^���X�̐���
//			inner.doIt(); // Inner�C���X�^���X�̃��\�b�h�Ăяo��
//		}
//	}
}
