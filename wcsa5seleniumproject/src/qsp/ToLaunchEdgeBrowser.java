package qsp;

import org.openqa.selenium.edge.EdgeDriver;

public class ToLaunchEdgeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new EdgeDriver();// USE TO LAUNCH EDGE BROWSER
		
		System.setProperty("webdriver.edge.driver","./drivers/edgedriver.exe");

	}

}
