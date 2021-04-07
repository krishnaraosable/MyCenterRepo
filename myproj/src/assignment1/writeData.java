package assignment1;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class writeData {	
	public void writeText(int rowCount) throws IOException {
		int rows;
		rows = rowCount;
		
		File fl = new File("../myproj/writeFile.txt");
		FileWriter fw = new FileWriter(fl);
		BufferedWriter bw = new BufferedWriter(fw);
		
		for(int i=1; i<=rows; i++) {			
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Enter text values");
			String inputValue = sc1.nextLine();			
			bw.write(inputValue);
			if(i!=rows) {
				bw.newLine();
			} //fw.write("Hello "+i+"  ");
		}
		bw.close(); //fw.close();
		System.out.println("Add success");
	}
	
	public static void main(String[] args) throws IOException {
		writeData wd = new writeData();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row count number ....");
		int rowValue = sc.nextInt();
		wd.writeText(rowValue);
	}
}
