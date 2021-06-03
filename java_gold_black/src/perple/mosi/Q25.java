package perple.mosi;

import java.util.stream.Stream;

public class Q25 {

	public static void main(String[] args) {
		Stream<String> stream = Stream.iterate("", s -> s + "abc");
		//System.out.println(stream.limit(2).map(x -> x + "x"));
		stream.limit(2).map(x -> x + "x")
		.forEach(x -> System.out.print(x));

	}

}
