package methodsofWebDriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("file:///D:/SELENIUM%20NOTS/Html/login%20page.html");
		driver.switchTo().activeElement().sendKeys("instagram",Keys.ENTER);
		
		Thread.sleep(2000);
        driver.navigate().back();

	}

}

