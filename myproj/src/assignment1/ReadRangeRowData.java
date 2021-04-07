package assignment1;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import assignment1.ReadRangeRowData;

public class ReadRangeRowData {
	
	public void readRangeData(int start, int end) throws IOException {
		int startRow = start-1;
		int endRow = end-1;
		//File fr = new File("../myproj/readFile.txt");
		//FileReader fRead = new FileReader("../myproj/readFile.txt");
		//BufferedReader br = new BufferedReader(fRead);
		//int fR = fRead.read();		
		for(int i= startRow; i<=endRow; i++) {
			String line = Files.readAllLines(Paths.get("../myproj/readFile.txt")).get(i);
	        System.out.println(line);
		}
	}
	
	public static void main(String[] args) throws IOException {
		ReadRangeRowData rRRD = new ReadRangeRowData();
		rRRD.readRangeData(2,4);
	}

}
