package chapter12;

import java.util.Locale;

public class Sample12_1 {

	public static void main(String[] args) {
		Locale japan = Locale.getDefault(); //“ú–{
		System.out.println(japan.getDisplayCountry() + " : " +
		japan.getDisplayLanguage());
		
		Locale us = new Locale("en", "US");
		//Locale us = Locale.UK;
		System.out.println(us.getDisplayCountry() + " : " +
		us.getDisplayLanguage());
		System.out.println(us.getDisplayCountry(us) + " : " +
		us.getDisplayLanguage(us));
		System.out.println(us.getCountry() + " : " +
		us.getLanguage());
		
		Locale lb = new Locale.Builder().setLanguage("ja")
										.setScript("Jpan")
										.setRegion("JP").build();
		System.out.println(lb.getCountry() + " : " + lb.getLanguage());

	}

}
