package Practise;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {

	public static void main(String[] args) {
		//writerFile();
		readFile();

	}

	public static void readFile() {
		try (FileReader fr = new FileReader("file1.txt");) {
			int i = 0;
			while ((i = fr.read()) != -1) {
			
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void writerFile() {
		try (FileWriter fw = new FileWriter("file2.txt");) {
			fw.write("Hello world welcome to technology");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
