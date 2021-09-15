package Package;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	public static void main(String[] args) {
	getRowCount();
	}
	public static void getRowCount() {

		try {
		String projectPath =System.getProperty("user.dir");
		XSSFWorkbook workbook = new XSSFWorkbook(projectPath+"/Excel/sri.xlsx");
		XSSFSheet sheet = workbook.getSheet("sheet1");	
		int rowCount = sheet.getPhysicalNumberOfRows();
		System.out.println("no of rows : "+rowCount);
	} catch(Exception exp) {
		 
		System.out.println(exp.getMessage());
		System.out.println(exp.getCause());
		exp.printStackTrace();
		  
	}

}

}
