package java_gold.sample4_3;

import java.util.function.Function;

public class FunctionLambda {

	public static void main(String[] args) {
		Function<String, String> f2 = (String str) ->
		{
			return "Hello " + str;
		};
		String str2 = f2.apply("naoki");
		System.out.println("ƒ‰ƒ€ƒ_®È—ª–³‚µ " + str2);

	}

}
