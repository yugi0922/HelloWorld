package chapter9;

import java.util.Locale;

public class Q3 {

	public static void main(String[] args) {
		Locale locale  = Locale.getDefault();
		System.out.println(locale.getCountry());
		System.out.println(locale.getLanguage());
		System.out.println(locale.getVariant());

	}

}
