package LocatorAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UberLoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://auth.uber.com/v2/?breeze_local_zone=phx6&next_url=https%3A%2F%2Fm.uber.com%2Flogin-redirect%2F%3FpreviousPath%3D%252F%26redirect%3Dfalse&state=S0CpT9nH1aQhMW2Za_G_IsbcjKdwjd0KPrycvUq1J0A%3D");
		
        driver.findElement(By.id("PHONE_NUMBER_or_EMAIL_ADDRESS")).sendKeys("96857432154");
        driver.findElement(By.id("forward-button")).click();
     
	}

}
