package assignment1;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import jxl.Workbook;
import jxl.format.Colour;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class WriteDataWithRowColumnCount {	
	public void writeData(int rCount, int cCount, String val) throws IOException, RowsExceededException, WriteException {
		int rowVal = rCount-1; int columnVal = cCount-1;
		File fl = new File("C:\\Users\\ITC\\Desktop\\test.xls");
		WritableWorkbook wb = Workbook.createWorkbook(fl);
		WritableSheet sheet = wb.createSheet("testSheet", 1);
		for(int i=0;i<=rowVal;i++) { //rows
			for(int j=0;j<=columnVal;j++) { //column
				Label lb = new Label(j,i,val);
				if(j==2 && i==2) {
					WritableCellFormat cellFormat = new WritableCellFormat(); //write cell format object
					cellFormat.setBackground(Colour.RED);// Set background color when row and column 3
					lb.setCellFormat(cellFormat);// set format
				}else if(j==1 && i==1) {
					WritableFont fontFormat = new WritableFont(WritableFont.TIMES,16,WritableFont.BOLD); //Set Font property
					WritableCellFormat cellFormat = new WritableCellFormat(fontFormat); //write cell format object
					lb.setCellFormat(cellFormat);// set format
				}				
				sheet.addCell(lb);				
			}
		}
		wb.write(); wb.close();	
	}
	
	public static void main(String[] args) throws IOException, RowsExceededException, WriteException {
		WriteDataWithRowColumnCount rowColumn = new WriteDataWithRowColumnCount();
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter row count");
		int rowCount = sc.nextInt(); 
		System.out.println("Enter column count");
		int columnCount = sc.nextInt();
		System.out.println("Enter write excel data");
		String val = sc.next();		
		rowColumn.writeData(rowCount,columnCount,val);		
	}

}
