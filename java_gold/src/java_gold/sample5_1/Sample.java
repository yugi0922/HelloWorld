package java_gold.sample5_1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("bb", "aa", "cc");
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i).toUpperCase();
			list.set(i, str);
		}
		Collections.sort(list);
		for(String s : list) {
			System.out.print(s + " ");
		}
	}

}
