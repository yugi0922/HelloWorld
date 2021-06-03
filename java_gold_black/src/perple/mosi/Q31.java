package perple.mosi;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Q31 {

	public static void main(String[] args) {
		Stream<Integer> stream1 = Stream.of(10);
		IntStream stream2 = stream1.mapToInt(a -> a);
		Stream<Integer> stream3 = Stream.of(10);
		DoubleStream stream4 = stream3.mapToDouble(a -> a);
		//Stream<Integer> stream5 = stream4.mapToObj(a -> a);
		Stream<Double> stream5 = stream4.mapToObj(a -> a);
		Stream<Integer> stream6 = stream5.map(a -> a.intValue());
		

	}

}
