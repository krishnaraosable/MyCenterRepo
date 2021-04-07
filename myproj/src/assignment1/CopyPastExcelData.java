package assignment1;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class CopyPastExcelData {	
	public static void main(String[] args) throws BiffException, IOException, RowsExceededException, WriteException {
		
		File fRead = new File("../myproj/myExcel.xls");
		File fWrite = new File("C:\\Users\\ITC\\Desktop\\myExcelSheet.xls");
		
		Workbook wb = Workbook.getWorkbook(fRead);
		Sheet sh = wb.getSheet(0);
		int row = sh.getRows();
		int col = sh.getColumns();
		
		WritableWorkbook wBook = Workbook.createWorkbook(fWrite);
		WritableSheet wSheet = wBook.createSheet("mSheet1", 2);
		//System.out.println("Row is "+row);
		//System.out.println("Column is "+col);
		
		for(int i=0; i<row; i++) {			
			for(int j=0; j<col; j++) {				
				Cell cl = sh.getCell(j, i);			
				Label lb = new Label(j,i,cl.getContents());	
				wSheet.addCell(lb);	
				System.out.println("Val is "+cl.getContents());				
			}			
		}
		wBook.write();
		wBook.close();		
	}
}
