package chapter7;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Sample7_20 {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2016, Month.JANUARY, 10);
		LocalTime time = LocalTime.of(7, 30);
		LocalDateTime dateTime = LocalDateTime.of(date, time);
		Duration duration = Duration.ofHours(3);
		System.out.println(dateTime);
		System.out.println(dateTime.plus(duration));
		System.out.println(time);
		System.out.println(time.plus(duration));
		System.out.println(date.plus(duration));

	}

}
