package week5.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LearnExcelRead {

	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook wb=new XSSFWorkbook("/SEPTEMBERJAVASE/DataSheet/CreateLead.xlsx");
		XSSFSheet ws=wb.getSheet("Data1");
		int rowCount=ws.getLastRowNum();
		int cellCount=ws.getRow(0).getLastCellNum();
		for(int i=1;i<=rowCount;i++) {
			for(int j=0;j<cellCount;j++) {
				String text=ws.getRow(i).getCell(j).getStringCellValue();
				System.out.println(text);
			}
			System.out.println("******");
		}
		wb.close();

	}

}
