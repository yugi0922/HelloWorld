package matome;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Q57 {

	public static void main(String[] args) {
		List<Q57Item> itemList = Arrays.asList(
				new Q57Item("ABC", 2500),
				new Q57Item("XYZ", 3200),
				new Q57Item("JJJ", 1800)
		);
		Predicate<Q57Item> p = i -> i.getPrice() > 2000;
		
		Stream<Q57Item> sItemList = itemList.stream();
		sItemList.filter(p)
		.collect((Collectors.toList()));
		
		sItemList
		.map(Q57Item::getName)
		.forEach(n -> System.out.print(n + " "));
		
//		itemList = itemList.stream()
//				.filter(p)
//				.collect(Collectors.toList());
		
//		itemList.stream()
//			.map(Q57Item::getName)
//			.forEach(n -> System.out.print(n + " "));
	}
}
