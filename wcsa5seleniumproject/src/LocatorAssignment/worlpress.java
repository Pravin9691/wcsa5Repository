package LocatorAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class worlpress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://wordpress.com/log-in/");
		
		driver.findElement(By.id("usernameOrEmail")).sendKeys("pravin@");
		driver.findElement(By.className("button form-button is-primary")).click();
	}

}
