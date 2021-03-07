package java_gold.chapter5;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sample5_26_1 {

	public static void main(String[] args) {
		//\•¶‚P‚Ì—á‚P
		Stream<Integer> stream1 = Stream.of(3, 5, 7, 9);
		Map<Boolean, List<Integer>> map1 = stream1.collect(
				Collectors.partitioningBy(s -> s > 5));
		System.out.println(map1);
	}

}
