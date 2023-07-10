package robotMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class bluestone {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		driver.get("https://www.bluestone.com/");
		
		driver.findElement(By.id("denyBtn")).click();
		
		WebElement targetWJ = driver.findElement(By.xpath("//a[.='Watch Jewellery ']"));
		
		Actions act =new Actions(driver);
		act.moveToElement(targetWJ).perform();
		
		driver.findElement(By.xpath("//a[.='Band']")).click();
		
		WebElement targetFB = driver.findElement(By.xpath("//div[.='Filter by']"));
		Thread.sleep(4000);
		
		//act.clickAndHold(targetFB);
		
		
		
		
	}

}
