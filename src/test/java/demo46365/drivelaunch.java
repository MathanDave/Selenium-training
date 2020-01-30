package demo46365;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class drivelaunch {

	public static WebDriver getDriver(String brw) {
		// TODO Auto-generated method stub
		if (brw.equals("CRM"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\TRAINING_H2A.06.17\\Downloads\\chromedriver_win32 aa\\chromedriver.exe");
	        return new ChromeDriver();
	    }
		else if(brw.equals("IEEE"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\Users\\TRAINING_H2A.06.17\\Downloads\\IEDriverServer_x64_3.9.0\\IEDriverServer.exe");
		    return new InternetExplorerDriver();
		}
		else if(brw.equals("FF"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\TRAINING_H2A.06.17\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
            return new FirefoxDriver();
		}
		else
		{
			return null;
		}
	}
}

