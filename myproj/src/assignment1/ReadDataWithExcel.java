package assignment1;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadDataWithExcel {
	
	public static void main(String[] args) throws BiffException, IOException {
		File xl = new File("../myproj/myExcel.xls");
		Workbook wb = Workbook.getWorkbook(xl);	
		Sheet ws = wb.getSheet(0);
		int rows = ws.getRows();
		int columns = ws.getColumns();		
		for(int i=0;i<rows;i++) {			
			for(int j=0;j<columns;j++) {
				Cell cl = ws.getCell(j,i);
				System.out.println(cl.getContents());
			}			
		}
	}
}
