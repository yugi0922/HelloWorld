package java_gold.sample4_7;

import java.util.Arrays;
import java.util.List;

public class Instance {

	public static void main(String[] args) {
		List<Integer> list= Arrays.asList(3, 1, 2);
//		for(int a : list) {
//			System.out.println(a);
//		}
		//forEachを使用、かつラムダ式を引数に渡す
		//list.forEach(a -> System.out.print(a));
		//インスタンスメソッドを参照
		list.forEach(System.out::print);
	}

}
