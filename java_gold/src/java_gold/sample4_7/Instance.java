package java_gold.sample4_7;

import java.util.Arrays;
import java.util.List;

public class Instance {

	public static void main(String[] args) {
		List<Integer> list= Arrays.asList(3, 1, 2);
//		for(int a : list) {
//			System.out.println(a);
//		}
		//forEach���g�p�A�������_���������ɓn��
		//list.forEach(a -> System.out.print(a));
		//�C���X�^���X���\�b�h���Q��
		list.forEach(System.out::print);
	}

}
