package assignment1;
import assignment1.ReadNthRowText;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadNthRowText {
	
	public void readData(int n) throws IOException {
		int rowNo = n-1;
		String line = Files.readAllLines(Paths.get("../myproj/readFile.txt")).get(rowNo);
        System.out.println(line);	
	}
	
	public static void main(String[] args) throws IOException{
		ReadNthRowText rNth = new ReadNthRowText();		
		rNth.readData(3);		
	}
}
