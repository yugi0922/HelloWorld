package java_gold.chapter5;

import java.util.stream.IntStream;

public class Sample5_5 {

	public static void main(String[] args) {
		IntStream stream = IntStream.of(10, 20, 30);
		int result = stream.reduce(0, (a, b) -> a + b);
		//int result = stream.reduce(0, Integer::sum);
		System.out.println(result);
	}

}
