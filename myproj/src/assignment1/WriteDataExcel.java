package assignment1;

import java.io.File;
import java.io.IOException;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class WriteDataExcel {	
	public static void main(String[] args) throws BiffException, IOException, RowsExceededException, WriteException {		
		File fl = new File("C:\\Users\\ITC\\Desktop\\myExcelSheet.xls");
		//Workbook wb = Workbook.getWorkbook(fl);
		WritableWorkbook wb = Workbook.createWorkbook(fl);
		WritableSheet ws = wb.createSheet("mysheet", 1);			
		for(int i=0; i<3; i++) {			
			for(int j=0; j<3; j++) {				
				Label lb = new Label(j,i,"krish");
				ws.addCell(lb);				
			}			
		}
		wb.write();
		wb.close();
		System.out.println("Working");
	}
}
