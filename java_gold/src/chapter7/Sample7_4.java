package chapter7;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Sample7_4 {

	public static void main(String[] args) {
		// LocalTimeのof()メソッドの利用
		LocalTime lt1  = LocalTime.of(3, 15); //1
		LocalTime lt2  = LocalTime.of(3, 15, 30); //2
		LocalTime lt3  = LocalTime.of(3, 15, 30, 180); //3
		System.out.println("1:" + lt1);
		System.out.println("2:" + lt2);
		System.out.println("3:" + lt3);
		//LocalDateTimeのof()メソッドの使用
		LocalDateTime ldt1 = LocalDateTime.of(2016, 2, 24, 3, 15); //4
		LocalDateTime ldt2 = LocalDateTime.of(2016, 2, 24, 3, 15, 30); //5
		LocalDateTime ldt3 = LocalDateTime.of(2016, 2, 24, 3, 15, 30, 100);//6
		System.out.println("4:" + ldt1);
		System.out.println("5:" + ldt2);
		System.out.println("6:" + ldt3);
		LocalDate date = LocalDate.of(2016, 2, 24);
		LocalTime time = LocalTime.of(3, 15);
		LocalDateTime ldt = LocalDateTime.of(date, time); //7
		System.out.println("7:" + ldt );
		
	}

}
