package perple;

import java.util.Arrays;
import java.util.List;

public class Q5_9 {

	public static void main(String[] args) {
		List<Integer> a = Arrays.asList(5, 6);
		List<Integer> b = Arrays.asList(7, 8);
		List<List<Integer>> c = Arrays.asList(a, b);
		c.stream().flatMap(e -> e.stream())
		.map(e -> e + 1).forEach(System.out::print);
//		c.stream().map(e -> e + 1)
//		.flatMap(e -> e.stream()).forEach(System.out::println);
	}

}
