package chapter7;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Sample7_9 {

	public static void main(String[] args) {
		ZoneId zone1 = ZoneId.systemDefault();
		LocalDateTime lDateTime1 = LocalDateTime.of(2016, 2, 20, 10, 30, 45, 200);
		ZonedDateTime zDateTime1 = ZonedDateTime.of(lDateTime1, zone1);
		System.out.println(zDateTime1);
		ZoneId zone2 = ZoneId.of("America/Los_Angeles");
		ZonedDateTime zDateTime2 = ZonedDateTime.of(2016, 2, 20, // ì˙ït
				                                   10, 30, 45, 200, // éûçè
				                                   zone2); // É]Å[Éì
		System.out.println(zDateTime2);
		DateTimeFormatter fmt1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		System.out.println(fmt1.format(zDateTime1));

	}

}
