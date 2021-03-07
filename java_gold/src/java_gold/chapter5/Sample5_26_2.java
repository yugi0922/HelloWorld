package java_gold.chapter5;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sample5_26_2 {

	public static void main(String[] args) {
		// ç\ï∂ÇQó·
		Stream<Integer> stream3 = Stream.of(3, 5, 7, 9);
		Map<Boolean, Integer> map3 = stream3.collect(
				Collectors.partitioningBy(
						s -> s > 5,
						Collectors.summingInt(n -> n)));
		System.out.println(map3);

	}

}
