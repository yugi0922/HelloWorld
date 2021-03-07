package java_gold.sample5_1;

import java.util.Arrays;
import java.util.List;

public class Stream {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("bb", "aa", "cc");
		list.stream().sorted().map(s -> s.toUpperCase()).forEach(
				s -> System.out.print(s + " "));
	}

}
