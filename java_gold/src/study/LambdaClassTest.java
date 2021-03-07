package study;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaClassTest {
	public static class Person{
		private String name;
		private int age;
		public Person(String name, int age) {
			this.name = name;
			this.age = age;
		}
		public String getName() {
			return this.name;
		}
		public int getAge() {
			return this.age;
		}
	}


	public static void main(String[] args) {
		List<Person> list = new ArrayList<>();
		list.add(new Person("ëæòY", 18));
		list.add(new Person("â‘éq", 17));
		list.add(new Person("å†ëæ", 20));
		Collections.sort(list,
				(o1, o2) -> Integer.compare(o1.getAge(), o2.getAge()));
		for(final Person person : list) {
			System.out.println(person.getName() + " " + person.getAge() + "çŒ");
		}
		
	}

}
