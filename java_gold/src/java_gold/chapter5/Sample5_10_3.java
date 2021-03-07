package java_gold.chapter5;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Sample5_10_3 {

	public static void main(String[] args) {
		IntStream intStream = IntStream.of(10, 20, 30);
		OptionalInt result4 = intStream.findFirst();
		//System.out.println(result4.g);
		System.out.println(result4.getAsInt());
	}

}
