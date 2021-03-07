package java_gold.chapter5;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Sample5_18_6 {

	public static void main(String[] args) {
		//6 IntStream -> Stream<Integer>
		IntStream stream6o = IntStream.of(1, 2, 3);
		Stream<Integer> stream6n = stream6o.boxed();
	}

}
