package java_gold.chapter5;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sample5_25_2 {
	public static void main(String[] args) {
		//ç\ï∂2
		Stream<String> stream2 = Stream.of("belle", "akko", "ami", "bob", "nao");
		Map<String, String> map2 = stream2.collect(Collectors.groupingBy(
				s -> s.substring(0, 1),
				Collectors.joining()));
		
		System.out.println(map2);
		System.out.println(map2.getClass());

	}

}
