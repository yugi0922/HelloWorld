package java_gold.sample4_14;
import java.util.function.ToIntFunction;
public class SamToIntFunction {
	public static void main(String[] args) {
		//ToIntFunction<String> obj1 = s -> s.length();
		ToIntFunction<String> obj1 = (String s) -> {return s.length();};
		System.out.println(obj1.applyAsInt("Java"));
		
	}

}
