package pk3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelBackup {

	public static void main(String[] args) throws IOException {
		
		FileInputStream pf=new FileInputStream("C:\\TTech\\temp\\Read.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(pf);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		DataFormatter formatter=new DataFormatter();
		
		int rowsize=sheet.getPhysicalNumberOfRows();
		System.out.println(rowsize);
		
		System.out.println(formatter.formatCellValue(sheet.getRow(1).getCell(0)));
		
//		for(int i=0;i<rowsize;i++){
//			
//			int cl = sheet.getRow(i).getPhysicalNumberOfCells();
//			for(int k=0;k<cl;k++){
//				
//				
//				Object value=formatter.formatCellValue(sheet.getRow(i).getCell(k));
//				
//				System.out.println(value);
//			}
//		}
	}

}
