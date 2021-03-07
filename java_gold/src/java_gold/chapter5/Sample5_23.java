package java_gold.chapter5;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sample5_23 {

	public static void main(String[] args) {
		//toMap() ƒƒ\ƒbƒh1
		Stream<String> stream1 = Stream.of("nao", "akko", "ami");
		Map<Integer, String> map1 = stream1.collect(Collectors.toMap(
				String::length,
				s -> s,
				(s1, s2) -> s1 + " : " + s2));
		System.out.println(map1);
		System.out.println(map1.getClass());
	}

}
