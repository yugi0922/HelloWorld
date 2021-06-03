package matome2;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Q12 {

	public static void main(String[] args) {
		Map<String, Integer> itemMap = new HashMap<>();
		itemMap.put("A", 200);
		itemMap.put("B", 150);
		itemMap.put("C", 300);

		
		String result = itemMap.entrySet().stream()
				.filter(m -> m.getValue() >= 200)
				.map(m -> m.getKey())
				.collect(Collectors.joining());
		System.out.println(result);
	}

}
