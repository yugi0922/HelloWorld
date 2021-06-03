package chapter7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Q29 {

	public static void main(String[] args) {
		try(Stream<String> stream = Files.lines(Paths.get("out.txt"))){
			stream.forEach(System.out::println);
			
		} catch (IOException e) {
			// TODO ©“®¶¬‚³‚ê‚½ catch ƒuƒƒbƒN
			e.printStackTrace();
		}

	}

}
