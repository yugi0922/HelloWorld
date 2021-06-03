package matome;

import java.util.ArrayList;
import java.util.List;

public class Q32Main {

	public static void main(String[] args) {
		List<Sales> salesList = new ArrayList<>();
		salesList.add(new Sales(1, 20));
		salesList.add(new Sales(2, 10));
		salesList.add(new Sales(2, 10));
		
		Sales sales = salesList.stream()
				.reduce(new Sales(4, 0), (s1, s2) -> {
					System.out.printf("s1=%s, s2%s\n", s1, s2);
					s1.qty += s2.qty;
					return new Sales(s1.id, s1.qty);
				});
		
		salesList.add(sales);
		
		salesList.stream().parallel()
			.reduce((s1, s2) -> s1.qty > s2.qty ? s1 : s2)
			.ifPresent(System.out::println);

	}

}
