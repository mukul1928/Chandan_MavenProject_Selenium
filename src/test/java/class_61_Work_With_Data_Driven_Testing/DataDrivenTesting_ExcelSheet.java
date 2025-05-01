package class_61_Work_With_Data_Driven_Testing;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class DataDrivenTesting_ExcelSheet {
	@Test
	public void DDT() throws EncryptedDocumentException, IOException {
		FileInputStream f1 = new FileInputStream("C:\\Users\\mukul\\eclipse-workspace\\Chandan_MavenProject_Selenium\\ExcelSheetForData\\Excel_data.xlsx");
		Workbook w1 = WorkbookFactory.create(f1);
		org.apache.poi.ss.usermodel.Sheet s1 = w1.getSheet("login");
		Row r1 = s1.getRow(1);
		Cell c1 = r1.getCell(0);
		String username = c1.getStringCellValue();
		System.out.println(username);
	}

}
