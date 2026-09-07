package CIET;
import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;

public class Throws {
	
		public static void readFile() throws IOException{
			FileReader file=new FileReader("./data.txt");
			System.out.println("file created");
			file.close();
			
		}
		public static void main(String[] args)
		throws IOException{
			readFile();
		}
	}