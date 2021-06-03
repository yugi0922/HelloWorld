package perple;

import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Q5_8 {

	public static void main(String[] args) {
		System.out.println(
		Stream.iterate(1, i -> ++i)
				.limit(5)
				.map(i ->"" + i)
				.collect(Collectors.joining())
		);

	}

}
