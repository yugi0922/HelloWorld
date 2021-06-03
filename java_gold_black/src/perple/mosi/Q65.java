package perple.mosi;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class Q65 {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("DATA/out.txt");
		System.out.println(path.getParent());
		Files.find(path.getParent(), 10,
				(p,a) -> p.toString().endsWith(".txt") ||
				a.isDirectory())
		.collect(Collectors.toList())
		.forEach(System.out::println);
	}

}
