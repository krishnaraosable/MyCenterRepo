package assignment1;
import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadDataBasedRowColumnRange {
	
	public void readRowColumnRange(int sRow, int eRow) throws BiffException, IOException {
		int startRow;
		int endRow;
		startRow = sRow-1;
		endRow = eRow-1;
		
		File fl = new File("../myproj/myExcel.xls");
		Workbook wb = Workbook.getWorkbook(fl);
		Sheet st = wb.getSheet(0);
		int colval = st.getColumns();
		for(int i=startRow; i<=endRow; i++) {
			for(int j=0;j<colval;j++) {
				Cell cl = st.getCell(j, i);
				System.out.println(cl.getContents());			
			}
		}		
	}
	
	public static void main(String[] args) throws BiffException, IOException {
		ReadDataBasedRowColumnRange RC = new ReadDataBasedRowColumnRange();
		RC.readRowColumnRange(1,3);
	}
}
