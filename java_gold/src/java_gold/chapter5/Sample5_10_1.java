package java_gold.chapter5;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Sample5_10_1 {

	public static void main(String[] args) {
		List<String> date = Arrays.asList( "a", "b");
		Optional<String> result1 = date.stream().findFirst();
		Optional<String> result2 = date.stream().findAny();
		System.out.println(result1.get());
		System.out.println(result2.get());

	}

}
