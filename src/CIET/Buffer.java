package CIET;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Buffer {
	public static void readFile() throws IOException{
		FileReader file = new FileReader("./data.txt");
		BufferedReader reader = new BufferedReader(file);
		String line;
		while((line = reader.readLine()) != null) {
			System.out.println(line);
		}
		reader.close();
		file.close();
	}
	public static void main(String[] args) 
	throws IOException{
		readFile();
	}

}