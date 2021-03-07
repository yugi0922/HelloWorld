package java_gold.sample4_10;

import java.util.function.BiFunction;

public class Instance_lambda_3 {

	public static void main(String[] args) {
		BiFunction<String, Integer, Character> obj = String::charAt;
		System.out.println(obj.apply("Java", 2));
		
	}

}
