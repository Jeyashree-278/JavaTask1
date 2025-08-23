package javapackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class TestExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String excelPath=".//datafiles/test.xlsx";
		FileInputStream f=new FileInputStream(excelPath);
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet sheet=wb.getSheet("Sheet1");
		int row=sheet.getLastRowNum();
		int cols=sheet.getRow(1).getLastCellNum();
		System.out.println("Rows: "+row );
		System.out.println("Cols: " +cols);
		for(int r=0;r<=row;r++)
		{
			XSSFRow xr=sheet.getRow(r);
			for(int c=0;c<cols;c++)
			{
				XSSFCell cell=xr.getCell(c);
				switch(cell.getCellType()){
				case NUMERIC:
					System.out.print(cell.getRawValue());
					break;
				case STRING:
					System.out.print(cell.getStringCellValue());
					break;
				case BOOLEAN:
					System.out.print(cell.getBooleanCellValue());
					break;
					
				}
				System.out.print("| ");
			}
			System.out.println();//move to next row
		}
		}
		

}
