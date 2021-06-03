package chapter12;

import java.util.Locale;
import java.util.ResourceBundle;

public class Sample12_2 {

	public static void main(String[] args) {
		Locale japan = Locale.getDefault();
		Locale us = Locale.US;
		Locale[] locArray = {japan, us};
		for(Locale locale : locArray) {
			ResourceBundle obj1 
				= ResourceBundle.getBundle("chapter12.MyResources", locale);
			System.out.println("send :" + obj1.getString("send"));
			System.out.println("cancel :" + obj1.getString("cancel"));
		}
		ResourceBundle obj2
		= ResourceBundle.getBundle("chapter12.MyResources");
		System.out.println("åüèÿópÅ@ÅF" + obj2.getString("send"));
		

	}

}
