package robotMethod;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class netflix {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
	 System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe"); 
	 EdgeDriver driver= new EdgeDriver();
	 
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	 
	 driver.get("https://www.netflix.com/in/s");
	 
	 Thread.sleep(2000);
	 
	 Robot robot=new Robot();
	 
	 robot.keyPress(KeyEvent.VK_ENTER);
	 robot.keyRelease(KeyEvent.VK_ENTER);
	 
	 Thread.sleep(2000);
	 
	 for(int i=0;i<5;i++)
	 {
		 Thread.sleep(2000);
	 robot.keyPress(KeyEvent.VK_WINDOWS);
	 robot.keyPress(KeyEvent.VK_PRINTSCREEN);
	 
	 robot.keyRelease(KeyEvent.VK_WINDOWS);
	 robot.keyRelease(KeyEvent.VK_PRINTSCREEN);
	 }
		

	}

}
