package java_gold.sample4_5;

import java.util.function.Function;

public class MethodReference {

	public static void main(String[] args) {
		Function<String, Integer> f1 = str -> Integer.parseInt(str);
		int num1 = f1.apply("100");
		System.out.println(num1);

		
		Function<String, Integer> f2 = Integer::parseInt;
		int num2 = f2.apply("200");
		System.out.println(num2);
	}

}
