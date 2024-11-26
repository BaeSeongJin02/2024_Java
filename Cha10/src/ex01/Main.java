package ex01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {

	public static void main(String[] args) {
		File file = new File("temp.txt");
		try {
		FileReader reader = new FileReader("temp.txt");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
			FileReader reader1 = new FileReader("temp.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
