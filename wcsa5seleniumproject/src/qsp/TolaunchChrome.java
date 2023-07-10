package qsp;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;

public class TolaunchChrome {

	public static void main(String[] args) throws InterruptedException {

		//relative path of Driver exe File
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		//upcast into webdriver
		WebDriver driver = new ChromeDriver();
		
		//mamimise the browser
		
		Options manage= driver.manage();
		driver.manage().window().maximize();
		
		
		//probide the delay of 2sec
		Thread.sleep(2000);
		
		
		//to close browser
		driver.close();
		
	}

}
