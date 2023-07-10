package methodsofWebDriver;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetPageSource {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the browser type");
      String browserValue = sc.next();
      if(browserValue.equalsIgnoreCase("chrome"));
      {
    	 ChromeOptions co = new ChromeOptions();
    	 co.addArguments("__disable-notification");
    	 
    	  
    	  
      }
      
		
		
	}

}
 