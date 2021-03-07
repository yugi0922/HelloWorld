package java_gold.chapter5;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sample5_25 {

	public static void main(String[] args) {
		//ç\ï∂2-1
		Stream<String> stream1 = Stream.of("belle", "akko", "ami", "bob", "nao");
		Map<String, Set<String>> map1 = stream1.collect(Collectors.groupingBy(
				s -> s.substring(0, 1),
				Collectors.toSet()));
		
		System.out.println(map1);

	}

}
