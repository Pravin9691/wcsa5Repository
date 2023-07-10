package qsp;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToLaunchFireFoxBrowser {
    
	
	public static void main(String[] args) {
		
		
		new FirefoxDriver();
		
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		

	}
}
