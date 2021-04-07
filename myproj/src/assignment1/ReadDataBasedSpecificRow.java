package assignment1;

import java.io.File;
import java.io.IOException;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadDataBasedSpecificRow {
	
	public void readSpecificRow(int row) throws BiffException, IOException {
		int rowVal;
		rowVal = row;		
		File fl = new File("../myproj/myExcel.xls");
		Workbook wb = Workbook.getWorkbook(fl);
		Sheet st = wb.getSheet(0);
		int col = st.getColumns();
		//col = col-1;
		
//		System.out.println("Column is : "+col);
//		System.out.println("Row is : "+rowVal);
		
		for(int i=0; i<col; i++) {
			Cell cl = st.getCell(i, rowVal);
			System.out.println(cl.getContents());
		}		
	}
	
	public static void main(String[] args) throws BiffException, IOException {
		ReadDataBasedSpecificRow rsr = new ReadDataBasedSpecificRow();
		rsr.readSpecificRow(2);		
	}

}
