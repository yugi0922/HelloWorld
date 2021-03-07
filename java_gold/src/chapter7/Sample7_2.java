package chapter7;

import java.time.LocalDate;

public class Sample7_2 {

	public static void main(String[] args) {
		LocalDate dateNow = LocalDate.now();
		LocalDate dateOf = LocalDate.of(2016, 02, 24);
		LocalDate dateOf2 = LocalDate.of(2016, 2, 24);
		LocalDate dateP = LocalDate.parse("2016-02-14");
		//LocalDate dateP2 = LocalDate.parse("2016-2-14"); //é¿çséûÉGÉâÅ[
		System.out.println("dateNow:" + dateNow);
		System.out.println("dateOf:" + dateOf);
		System.out.println("dateP:" + dateP);
		
		

	}

}
