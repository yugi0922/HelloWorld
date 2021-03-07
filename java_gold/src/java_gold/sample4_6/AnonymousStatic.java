package java_gold.sample4_6;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class AnonymousStatic {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3, 1, 2);
		Consumer<List<Integer>> con1 = new Consumer<List<Integer>>() {
			public void accept(List<Integer> list) {
				Collections.sort(list);
			}
		};
		con1.accept(list);
		System.out.println(list);
		

	}

}
