package java_gold.chapter3;

import java.util.ArrayList;
import java.util.List;

class X {
	public String toString() {
		return "X";
	}
}

class Y extends X {
	public String toString() {
		return "Y";
	}
}


public class Sample3_17_re {
	//�����Ŏ󂯎�郊�X�g�̗v�f��X�N���X�܂��͂��̃T�u�N���X
	public static void method1(List<? extends X> list) {
		//list.add(new X());
		//list.add(new Y());
		System.out.print(list.get(0) + " ");
	}

	//�����Ŏ󂯎�郊�X�g�̗v�f��Y�N���X�܂��͂��̃X�[�p�[�N���X
	public static void method2(List<? super Y> list) {
		//list.add(new X());
		list.add(new Y());
		System.out.print(list.get(0) + " ");
	}
	

	public static void main(String[] args) {
		List<X> l1 = new ArrayList<X>(); l1.add(new X());
		List<X> l2 = new ArrayList<X>(); l2.add(new Y());

		//method1���\�b�h�̌Ăяo��
		method1(l1); //X�I�u�W�F�N�g���i�[����ArrayList��n��
		method1(l2); //Y�I�u�W�F�N�g���i�[����ArrayList��n��
		
		//method2���\�b�h�̌Ăяo��
		method2(l1); //X�I�u�W�F�N�g���i�[����ArrayList��n��
		method2(l2); //Y�I�u�W�F�N�g���i�[����ArrayList��n��
		
	}

}
