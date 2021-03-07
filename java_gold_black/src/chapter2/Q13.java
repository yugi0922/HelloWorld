package chapter2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q13 {

	public static void main(String[] args) {
		Integer[] array = {1, 2, 3};
		List<Integer> list1 = Arrays.asList(array);
		ArrayList<Integer> list2 = new ArrayList<>(list1);
		list1.set(0, 2);
		list2.add(4);
		System.out.println(Arrays.toString(array));
		System.out.println(list1);
		System.out.println(list2);
		
	}

}
