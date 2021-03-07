package abstractFactory.factory;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

public abstract class Page {

	protected String title;
	protected String author;
	protected ArrayList content = new ArrayList();
	public Page(String title, String author){
		this.title = title;
		this.author = author;
	}
	public void add(Item item){
		content.add(item);
	}
	public void output(){
		try{
			String fileName = title + ".html";
			Writer writer = new FileWriter(fileName);
			writer.write(this.makeHTML());
			writer.close();
			System.out.println(fileName + "を作成しました。");

		}catch(IOException ie){
			ie.printStackTrace();
		}
	}
	public abstract String makeHTML();

}
