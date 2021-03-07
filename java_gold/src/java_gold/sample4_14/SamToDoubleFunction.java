package java_gold.sample4_14;

import java.util.function.IntToDoubleFunction;

public class SamToDoubleFunction {
	public static void main(String[] args) {
		//IntToDoubleFunction obj2  = i -> i + Math.random();
		IntToDoubleFunction obj2 = (int i) -> {return Math.random();};
//		IntToDoubleFunction obj2 = (Integer i) -> {
//			return Math.random();
//		};
		System.out.println(obj2.applyAsDouble(5));
	}
}
