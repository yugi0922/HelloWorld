package chapter7;

import java.time.LocalDate;
import java.time.Month;

public class Sample7_3 {

	public static void main(String[] args) {
		//LocalDate dateOf = LocalDate.of(2016, 02, 24);
		LocalDate dateOf = LocalDate.of(2016, Month.FEBRUARY, 24);
		System.out.println(dateOf);
		Month m = Month.FEBRUARY;
		//boolean result1 = m == 5;
		boolean result2 = m == Month.APRIL;
		System.out.println(result2);
		System.out.println("getYear():"  + dateOf.getYear());
		System.out.println("getMonth():"  + dateOf.getMonth());
		System.out.println("getMonthValue():"  + dateOf.getMonthValue());
		System.out.println("getDayOfMonth:"  + dateOf.getDayOfMonth());
		

	}

}
