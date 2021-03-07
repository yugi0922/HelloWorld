package java_gold.chapter5;

import java.util.stream.Stream;

public class Sample5_18_4 {

	public static void main(String[] args) {
		//4 Stream<Integer> -> Stream<String>
		Stream<Integer> stream4o = Stream.of(1, 2, 3);
		Stream<String> stream4n = stream4o.map( n -> n + "a");
		
	}

}
