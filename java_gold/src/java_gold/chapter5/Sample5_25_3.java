package java_gold.chapter5;

import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sample5_25_3 {

	public static void main(String[] args) {
		// ç\ï∂ÇR
		Stream<String> stream3 = Stream.of("belle", "akko", "ami", "bob", "nao");
		Map<String, String> map3 = stream3.collect(Collectors.groupingBy(
				s -> s.substring(0, 1), 
				TreeMap:: new,
			    Collectors.joining()));
		System.out.println(map3);
		System.out.println(map3.getClass());

	}

}
