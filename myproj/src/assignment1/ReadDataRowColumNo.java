package assignment1;

import java.io.File;
import java.io.IOException;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadDataRowColumNo {
	
	public void readWriteData(int row, int col) throws BiffException, IOException {
		int rowNo = row;
		int colNo = col;
		File xl = new File("../myproj/myExcel.xls");
		Workbook wb = Workbook.getWorkbook(xl);
		Sheet sl = wb.getSheet(0);
		Cell cl = sl.getCell(colNo,rowNo); 
		System.out.println(cl.getContents());
	}
	
	public static void main(String[] args) throws BiffException, IOException {
		ReadDataRowColumNo rData = new ReadDataRowColumNo();
		rData.readWriteData(1,2);
	}

}
