package java_gold.chapter5.map;

import java.util.HashMap;
import java.util.Map;

public class MapMerge_7 {

	public static void main(String[] args) {
		// 7 key1‚ª‘¶İ‚·‚éƒP[ƒX
		Map<String, String> map = new HashMap<String, String>();
		map.put("key1", "AAA");
		
		System.out.println(map);
		
		if(map.containsKey("key1")) {
			map.put("key1", "CCC");
		} else {
			map.put("key1", "BBB");
		}
		
		System.out.println(map);

	}

}
