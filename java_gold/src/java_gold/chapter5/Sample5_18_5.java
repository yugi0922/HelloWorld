package java_gold.chapter5;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Sample5_18_5 {

	public static void main(String[] args) {
		//5 IntStream -> Stream<String>
		IntStream stream5o = IntStream.of(1, 2, 3);
		Stream<String> stream5n = stream5o.mapToObj(n -> n + "a");
	}

}
