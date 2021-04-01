package chapter12;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Set;

public class Sample12_5 {

	public static void main(String[] args) {
		ResourceBundle bundle 
		 = ResourceBundle.getBundle("MyResources", Locale.US);
		Set<String> keys = bundle.keySet();
		keys.stream()
		.map(k -> bundle.getString(k))
		.forEach(System.out::println);

	}

}
