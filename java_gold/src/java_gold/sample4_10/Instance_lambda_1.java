package java_gold.sample4_10;

import java.util.function.BiFunction;

public class Instance_lambda_1 {

	public static void main(String[] args) {
		//ƒ‰ƒ€ƒ_Ž®1 ok
		BiFunction<String, Integer, Character> obj = (s, i) ->
		s.charAt(i);
		System.out.println(obj.apply("Java", 2));

	}

}
