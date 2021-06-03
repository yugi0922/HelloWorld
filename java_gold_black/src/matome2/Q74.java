package matome2;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Q74 {

	public static void main(String[] args) {
		List<List<List<String>>> list = Arrays.asList(
				Arrays.asList(
					Arrays.asList("A", "B"),
					Arrays.asList("C", "D", "E"),
					Arrays.asList("F")),
				Arrays.asList(
					Arrays.asList("e", "a", "d"),
					Arrays.asList("c", "f"))
		);		

		list.stream()
			.flatMap(Collection::stream)
			.filter(l -> l.size() > 2)
			//.peek(l -> System.out.println(l))
			.flatMap(Collection::stream)
			.map(String::toLowerCase)
			.distinct()
			.forEach(System.out::print);
	}

}
