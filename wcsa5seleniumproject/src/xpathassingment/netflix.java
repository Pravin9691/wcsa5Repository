package xpathassingment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class netflix {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/Login");
		driver.findElement(By.xpath("//input[(@name='userLoginId')]")).sendKeys("pravin ");
		driver.findElement(By.xpath("//input[(@name='password')]")).sendKeys("sanket");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[(@type='submit')]")).click();
	}

}
