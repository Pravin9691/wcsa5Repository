package actionClassMethod;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.base.StandardSystemProperty;

public class demo {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver.", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.bluestone.com");
	
	Actions act=new Actions(driver);
	
	}

}
