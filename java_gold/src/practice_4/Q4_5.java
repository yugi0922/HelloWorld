package practice_4;

import java.util.function.Predicate;

public class Q4_5 {
	int val;

	public static void main(String[] args) {
		Q4_5 obj = new Q4_5();
		obj.val = 20;
		method(obj, a -> a.val < 100);
	}
	
	static void method(Q4_5 obj, Predicate<Q4_5> p) {
		String ans = p.test(obj) ? "hello" : "bye";
		System.out.println(ans);
	}

}
