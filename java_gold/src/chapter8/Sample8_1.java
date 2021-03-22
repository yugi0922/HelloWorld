package chapter8;

import java.io.File;

public class Sample8_1 {

	public static void main(String[] args) {
		File f1 = new File("C:\\git\\Laboratory\\java_gold\\src\\chapter8");
		File f2 = new File("dir", "a.txt");
		File f3 = new File(f1, "x.txt");
		for(File f: f1.listFiles()) {
			if(f.isFile()) {
				System.out.println("ファイル:" + f.getName());
			}else if(f.isDirectory()) {
				System.out.println("ディレクトリ:" + f.getName());
			}
		}
		System.out.println("path for f1:" + f1.getAbsolutePath());
		System.out.println("path for f2:" + f2.getAbsolutePath());
		System.out.println("path for f3:" + f3.getAbsolutePath());
		System.out.println("使用しているパスの区切り文字" + System.getProperty("file.separator"));
	}

}
