package java_gold.chapter5;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sample5_26_1_2 {

	public static void main(String[] args) {
		// ç\ï∂ÇPÇÃó·ÇQ
		Stream<Integer> stream2 = Stream.of(3, 5, 7, 9);
		Map<Boolean, List<Integer>> map2 = stream2.collect(
				Collectors.partitioningBy(s -> s > 10));
		System.out.println(map2);

	}

}
