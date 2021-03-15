package chapter9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Sample9_10 {

	public static void main(String[] args) throws IOException{
		Path p1 = Paths.get("C:\\git\\Laboratory\\java_gold\\src\\chapter9\\9_10.txt");
		Path p2 = Paths.get("C:\\git\\Laboratory\\java_gold\\src\\chapter9\\9_10_cp.txt");
		Path p3 = Paths.get("C:\\git\\Laboratory\\java_gold\\src\\chapter9\\9_10_org.txt");
		Path p4 = Paths.get("C:\\git\\Laboratory\\java_gold\\src\\chapter9\\9_10_mv.txt");
		Files.copy(p1, p2, StandardCopyOption.REPLACE_EXISTING);
		Files.move(p3, p4, StandardCopyOption.REPLACE_EXISTING);
		Files.delete(p1);

	}

}
