package assignment1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyPastFileData {
	
	public static void main(String[] args) throws IOException {
		
		File fr = new File("../myproj/readFile.txt");
		File fw = new File("../myproj/writeFile.txt");
		FileReader fRead = new FileReader(fr);		
		FileWriter fWrite = new FileWriter(fw);
		int i;
		while((i=fRead.read())!=-1) {
			fWrite.write(i);
		}
		fRead.close();
		fWrite.close();
		System.out.println("Success copy data from readFile.txt and past in writeFile.txt");
	}
}
