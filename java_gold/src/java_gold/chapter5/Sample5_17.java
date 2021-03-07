package java_gold.chapter5;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sample5_17 {

	public static void main(String[] args) {
		List<String> list = Stream.of("one", "three", "two", "three", "four")
				.filter(s -> s.length() > 3)
				.peek(e -> System.out.println("�t�B���^��F�@" + e))
				.distinct()
				.map(String::toUpperCase)
				.peek(e -> System.out.println("�}�b�v�� : " + e ))
				.collect(Collectors.toList());
	}

}
