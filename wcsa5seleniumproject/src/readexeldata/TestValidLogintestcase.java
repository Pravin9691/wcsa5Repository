package readexeldata;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestValidLogintestcase {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://127.0.0.1/login.do;jsessionid=6821213agicl3");
		
		FileInputStream fis = new FileInputStream("./data/ActitimeTestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
	   Sheet sheet = wb.getSheet("Valid"); 
	   Row row = sheet.getRow(1);
	   Cell cell = row.getCell(0);
	 String validusername = cell.getStringCellValue();
	 
	 FileInputStream fis1 = new FileInputStream("./data/ActitimeTestData.xlsx");
		Workbook wb1 = WorkbookFactory.create(fis1);
	   Sheet sheet1 = wb1.getSheet("Valid"); 
	   Row row1 = sheet1.getRow(1);
	   Cell cell1 = row1.getCell(0);
	 String validpassword1 = cell1.getStringCellValue();
	 
	driver.findElement(By.name("username")).sendKeys(validusername);
	Thread.sleep(2000);
	driver.findElement(By.name("pwd")).sendKeys(validpassword1);
	
	driver.findElement(By.className("initial")).click();

	
	
	
	   
	   
	   
	   
	
		
	}

}
