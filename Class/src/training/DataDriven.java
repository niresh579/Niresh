package training;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;




public class DataDriven {
	public static void main(String[] args) throws IOException {
		
		File loc=new File("C:\\Users\\CBS Testing\\workspace\\Niresh\\Class\\data\\Rasi.xlsx");
		FileInputStream f=new FileInputStream(loc);
		Workbook w=new XSSFWorkbook(f);
		Sheet s=w.getSheet("Sheet1");
		Row r=s.getRow(1);
		Cell c=r.getCell(1);
		System.out.println(r);
		
		

		
		
	}

}
