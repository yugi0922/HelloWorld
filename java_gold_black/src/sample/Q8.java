package sample;

import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class Q8 {

	public static void main(String[] args) {
		Stream<String> source = Stream.of("1.4", "5.0", "6.0","7.0", "8.0");
		DoubleStream dblStrm = source.mapToDouble(Double::parseDouble);

		DoubleStream filtered = dblStrm.filter(d -> d >= 7.0).peek(System.out::println);

		Stream<String> converted = filtered.mapToObj(String::valueOf);
		converted.forEach(System.out::println);	

	}

}
