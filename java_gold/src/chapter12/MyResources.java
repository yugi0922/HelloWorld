package chapter12;

import java.util.ListResourceBundle;

public class MyResources extends ListResourceBundle {

	@Override
	protected Object[][] getContents() {
		Object[][] contents = {{"send", "‘—M"},
				{"cancel", "æ‚èÁ‚µ"}};		
		return contents;
	}

}
