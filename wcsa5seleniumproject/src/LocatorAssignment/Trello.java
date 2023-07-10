package LocatorAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://trello.com/en/login");
		
		driver.findElement(By.id("user")).sendKeys("pravin@");
		driver.findElement(By.id("login")).click();
		
	    driver.findElement(By.id("password")).sendKeys("satpute12@");
	

	}

}
