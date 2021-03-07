package chapter4;

import java.util.stream.IntStream;

public class Q14 {

	public static void main(String[] args) {
		IntStream.range(1, 5).map(n -> n * 2).forEach(System.out::print);
	}

}
