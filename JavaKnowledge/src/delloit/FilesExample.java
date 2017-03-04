package delloit;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class FilesExample {
	static File file = new File("/Users/saurabhamin/documents/ProcessOutput.txt");

	static void readFile() { 
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {

			String currentRec;
			ArrayList<String> list = new ArrayList<>();
			
			
			while ((currentRec = br.readLine()) != null) {
				int indexOf = currentRec.indexOf(',');
				list.add(currentRec.substring(indexOf+1, currentRec.length()));

				System.out.println(currentRec);
			}
			System.out.println(list);
			
			System.out.println("MAX time -->"+Collections.max(list));
			System.out.println("MIN time -->"+Collections.min(list));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void wirteToFile(String str) {

	}

	public static void main(String[] args) {
		try {
			file.createNewFile();
			readFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
