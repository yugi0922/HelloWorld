package java_gold.chapter5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Sample5_9 {

	public static void main(String[] args) {
		List<String> date = Arrays.asList("aaa", "bb", "c", "d");
		Optional<String> result1 = date.stream().max(Comparator.naturalOrder());
		Optional<String> result2 = date.stream().max((d1, d2) -> d1.length() - d2.length());
		
		result1.ifPresent(System.out::println);
		System.out.println(result1.get());
		result2.ifPresent(System.out::println);
		System.out.println(result2.get());
	}

}
