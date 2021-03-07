package java_gold.chapter5.map;

import java.util.HashMap;
import java.util.Map;

public class MapMerge_8 {

	public static void main(String[] args) {
		// 8 key1‚ª‘¶İ‚·‚éƒP[ƒX
		Map<String, String> map = new HashMap<String, String>();
		map.put("key1", "AAA");
		
		map.merge("key1", "BBB", (v1, v2) -> {
			return "CCC";
		});
		
		System.out.println(map);

	}

}
