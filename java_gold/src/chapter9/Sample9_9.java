package chapter9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Sample9_9 {

	public static void main(String[] args) throws IOException{
		Path p1 = Paths.get("C:\\git\\Laboratory\\java_gold\\src\\chapter9\\ren\\tmp");
		Files.createDirectories(p1);
		Path p2 = Paths.get("C:\\git\\Laboratory\\java_gold\\src\\chapter9\\ren\\tmp\\x\\y");
		Files.createDirectories(p2);
		Files.delete(p2);
		Files.deleteIfExists(Paths.get("C:\\git\\Laboratory\\java_gold\\src\\chapter9\\9_9"));

	}

}
