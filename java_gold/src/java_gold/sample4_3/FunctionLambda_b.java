package java_gold.sample4_3;

import java.util.function.Function;

public class FunctionLambda_b {

	public static void main(String[] args) {
		Function<String, String> f3 = str -> "Hello ;" + str;
		String str3 = f3.apply("naoki");
		System.out.println("ƒ‰ƒ€ƒ_È—ª‚ ‚è " + str3);

	}

}
