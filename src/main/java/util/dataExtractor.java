package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.TreeMap;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class dataExtractor {
	
	
	
	
	FileInputStream File;
	XSSFWorkbook wb;
	
	
	public String getData(String rowName, String columnName) throws IOException {
		TreeMap<String, HashMap<String, String>> map = new TreeMap<String, HashMap<String,String>>();
		try {
			File = new FileInputStream("./src/main/java/data/data.xlsx");
			wb=new XSSFWorkbook(File);
		} 
		catch (FileNotFoundException e) 
		{
			e.getMessage();
		}

		
		
		XSSFSheet sheet = wb.getSheet("stage");
		int row_number = sheet.getPhysicalNumberOfRows();
		int col_number = sheet.getRow(1).getPhysicalNumberOfCells();
		 
//		System.out.println(sheet.getRow(2).getCell(2).getStringCellValue());
		for(int row =1 ; row < row_number;row++) {
			HashMap<String, String> data =  new HashMap<String, String>();
			for(int col_no =1 ;col_no<col_number; col_no++) {
				data.put(sheet.getRow(0).getCell(col_no).getStringCellValue(), sheet.getRow(row).getCell(col_no).getStringCellValue());
				}
			map.put(sheet.getRow(row).getCell(0).getStringCellValue(), data);
		}
		
		return map.get(rowName).get(columnName);
	}

}
