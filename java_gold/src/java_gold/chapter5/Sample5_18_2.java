package java_gold.chapter5;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Sample5_18_2 {

	public static void main(String[] args) {
		//2 Stream<String> -> IntStream
		Stream<String> stream2o = Stream.of("naoki", "akko", "ami");
		IntStream stream2n = stream2o.mapToInt(s -> s.length());

	}

}
