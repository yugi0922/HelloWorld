package java_gold.chapter3;

import java.util.HashMap;
import java.util.Map;

public class Q3_8 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap();
		for(int i = 10; i < 15; i++) {
			map.put(i, "item-" + i);
		}
		System.out.println(map);
		System.out.println(map.get(14
				));
	}

}
