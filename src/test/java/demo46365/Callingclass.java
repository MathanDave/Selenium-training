package demo46365;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Callingclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
             WebDriver driver;
            // driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
             driver = drivelaunch.getDriver("CRM");
            driver.get("http://demowebshop.tricentis.com/"); 
            Thread.sleep(5000);
            List<WebElement> T_lnk = driver.findElements(By.tagName("a"));
            int m_lnk = T_lnk.size();
            System.out.println("Total link da venna" + m_lnk);
       
            for (int i=0;i<=m_lnk;i++ )
            {
             String L_text =T_lnk.get(i).getText(); 
             System.out.println(i + "the link is" + L_text);
            }
	}
}
