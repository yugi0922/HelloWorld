package chapter9;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Sample9_15 {

	public static void main(String[] args) {
		FileSystem fs = FileSystems.getDefault();
		Iterable<Path> dirs = fs.getRootDirectories();
		for(Path name: dirs) {
			System.out.println("RootDir:" + name);
		}
		Path path = Paths.get("C:\\git\\Laboratory\\java_gold\\src\\chapter9\\9_15");
		try(DirectoryStream<Path> stream =
				Files.newDirectoryStream(path)){
				for(Path file :  stream) {
					System.out.println(file.getFileName());
				}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
