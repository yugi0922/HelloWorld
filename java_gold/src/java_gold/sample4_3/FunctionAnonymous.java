package java_gold.sample4_3;

import java.util.function.Function;

public class FunctionAnonymous {

	public static void main(String[] args) {
		String str1 = new Function<String, String>(){
			public String apply(String str) {
				return "Hello " + str;
			}
		}.apply("Naoki");
		System.out.println(str1);
	}

}
