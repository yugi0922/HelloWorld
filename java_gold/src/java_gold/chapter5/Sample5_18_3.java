package java_gold.chapter5;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Sample5_18_3 {

	public static void main(String[] args) {
		//3 Stream<Integer> -> IntStream
		Stream<Integer> stream3o = Stream.of(1, 2, 3);
		IntStream stream3n = stream3o.mapToInt(n -> n);
	}

}
