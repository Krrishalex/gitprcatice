package day4;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class StringFromFile {

	public static void main(String[] args) throws IOException {
		
		String path=System.getProperty("user.dir")+"\\files\\test.txt";
		Charset encoding=Charset.defaultCharset();
		String text=" Hello Ramu";
		
		Files.write(Paths.get(path),text.getBytes(), StandardOpenOption.APPEND);
		
		List<String> lines=Files.readAllLines(Paths.get(path),encoding);
		lines.add("Hello Gunnedi");
		
		
		System.out.println(lines.toString());
		
		
	}

}
