package java_gold.chapter5;

import java.util.Optional;
import java.util.stream.Stream;

public class Sample5_10_2 {

	public static void main(String[] args) {
		Stream<String> stream = Stream.empty();
		Optional<String> result3 = stream.findFirst();
		//System.out.println(result3.get());
		result3.ifPresent(System.out::println);
	}

}
