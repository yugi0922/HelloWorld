package java_gold.chapter5;

import java.util.Arrays;
import java.util.List;

public class Sample5_3 {

	public static void main(String[] args) {
		List<String> date1 = Arrays.asList("mana", "naoki", "ryo");
		boolean result1 = date1.stream().allMatch(s -> s.length() >= 3);
		boolean result2 = date1.stream().anyMatch(s -> s.length() == 4);
		boolean result3 = date1.stream().noneMatch(s -> s.length() == 4);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		

	}

}
