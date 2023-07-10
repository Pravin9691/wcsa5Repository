package syncronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeSyncronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do;jsessionid=91t78unfqmh40");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		System.out.println("Title is matched test case passed!!");
	}
	public static void explicitWaitMethod(WebDriver driver,int sec,String title)
	{
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(sec));
		wait.until(ExpectedConditions.titleContains(title));
	}

}
