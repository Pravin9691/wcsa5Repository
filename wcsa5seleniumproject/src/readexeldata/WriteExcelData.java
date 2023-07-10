package readexeldata;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteExcelData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis = new FileInputStream("./data/TextData.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
   Sheet sheet = wb.getSheet("IPL");
   Row row = sheet.getRow(11);
   Cell cell = row.getCell(0);
   cell.setCellValue("pune");

   FileOutputStream fos = new FileOutputStream("./data/TextData.xlsx");
   wb.write(fos);
	}

}
