package java_gold.chapter5;

import java.util.stream.Stream;

public class Sample5_18_1 {

	public static void main(String[] args) {
		//1 Stream<String> -> Stream<Integer>
		Stream<String> stream1o = Stream.of("a", "b");
		Stream<Integer> stream1n = stream1o.map(s -> s.length());

	}

}
