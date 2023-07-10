package methodsofWebDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class que3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://omayo.blogspot.com/");
		
		Thread.sleep(2000);
		WebElement childwindow = driver.findElement(By.partialLinkText("Open a popup window"));
		Point elementLoc = childwindow.getLocation();
		int xaxis = elementLoc.getX();
		int yaxis = elementLoc.getY();
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		  jse.executeScript("window.scrollBy("+xaxis+","+(yaxis-80)+")");
		  
		  childwindow.click();
		  
		  Thread.sleep(2000);
          driver.close();
 }
}
