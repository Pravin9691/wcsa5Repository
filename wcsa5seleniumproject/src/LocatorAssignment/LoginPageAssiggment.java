package LocatorAssignment; 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageAssiggment {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/login");
		
		driver.findElement(By.id("id_userLoginId")).sendKeys("pravin@");
		//Thread.sleep(4000);
		driver.findElement(By.id("id_password")).sendKeys("sanket");
		//Thread.sleep(4000);
		driver.findElement(By.className("btn login-button btn-submit btn-small")).click();
	

	}

}
