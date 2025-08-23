package excelassignmentpackage;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDatatoExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		XSSFWorkbook book=new XSSFWorkbook();
		XSSFSheet sheet=book.createSheet("Sheet1");
		Object[][]data= {{"Column headers:","Name","Age","Email"},{"Row 1","John Doe",30,"john@test.com"},{"Row 2","Jane Doe",28,"jane@test.com"},{"Row 3","Bob Smith",35,"jacky@example.com"},
				{"Row 4","Swapnil",37,"swapnil@example.com"}};
		
	int rows=data.length;
	int cols=data[0].length;
	for(int r=0;r<rows;r++)
	{
		XSSFRow r1=sheet.createRow(r);
		for(int c=0;c<cols;c++)
		{ 
			XSSFCell cell=r1.createCell(c);
			Object value=data[r][c];
			if(value instanceof String)
			{cell.setCellValue((String)value);
			}
			if(value instanceof Integer)
			{
				cell.setCellValue((Integer)value);
			}
			if(value instanceof Boolean)
			{
				cell.setCellValue((boolean)value);
			}
		}
	}
	//new java.io.File(".\\resultfiles").mkdirs(); 
	String path= "C:\\Users\\aravi\\OneDrive\\Documents\\data.xlsx";
	FileOutputStream out=new FileOutputStream(path);
	book.write(out);
	book.close();
	System.out.println("The data is written in excel successfully");

}
}
