package study;

import java.util.Arrays;
import java.util.List;

public class Sample4_1_Lambda {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("Tanaka", "Sato");
		words.replaceAll( (String str) -> { return str.toUpperCase(); } );
		System.out.println(words);
	}

}
