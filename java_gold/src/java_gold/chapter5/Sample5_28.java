package java_gold.chapter5;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sample5_28 {

	public static void main(String[] args) {
		// minBy()���\�b�h�̗�
		Stream<String> stream1 = Stream.of("naoki", "akko", "ami");
		Optional<String> result1 = stream1.collect(
				Collectors.minBy(Comparator.naturalOrder()));
		System.out.println(result1.get());
		
		//maxBy()���\�b�h�̗�
		Stream<String> stream2 = Stream.of("101", "105", "106", "203", "205");
		Map<String, Optional<String>> result2 = stream2.collect(
				Collectors.groupingBy(s -> s.substring(0, 1),
						Collectors.maxBy(Comparator.naturalOrder())));
		System.out.println(result2);

	}

}
