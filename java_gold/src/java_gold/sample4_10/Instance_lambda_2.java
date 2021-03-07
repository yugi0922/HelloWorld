package java_gold.sample4_10;

import java.util.function.BiFunction;

public class Instance_lambda_2 {

	public static void main(String[] args) {
		BiFunction<Integer, String, Character> obj = (i, s) ->
		s.charAt(i);
		System.out.println(obj.apply(2, "java"));

	}

}
