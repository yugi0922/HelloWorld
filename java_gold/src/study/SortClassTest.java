package study;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortClassTest {
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
	
	public static class PersonComparatorByAge implements Comparator<Person>{
		public int compare(Person o1, Person o2) {
			return Integer.compare(o1.getAge(), o2.getAge());
		}
	}

	public static void main(String[] args) {
		List<Person> list = new ArrayList<>();
		list.add(new Person("‘¾˜Y", 18));
		list.add(new Person("‰Ôq", 17));
		list.add(new Person("Œ ‘¾", 20));
		Collections.sort(list, new PersonComparatorByAge());
		for(final Person person : list) {
			System.out.println(person.getName() + " " + person.getAge() + "Î");
		}
		
	}

}
