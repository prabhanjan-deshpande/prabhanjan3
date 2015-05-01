package windowHandleExample;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Handle_popupNAlert {
	@Test
	public void test_HandlePopup() throws InterruptedException {
		{
			WebDriver driver= new FirefoxDriver(); 
			driver.get("http://www.rediff.com/");
			driver.manage().window().maximize();
			//WebElement sign = driver.findElement(By.xpath("//span[@id='signin_info']/a"));
			//sign.click();
			WebElement sign = driver.findElement(By.linkText("Sign in"));
			sign.click();
			WebElement email_id= driver.findElement(By.xpath("//input[@id='login1']"));
			email_id.sendKeys("hi");

			Set<String> windowId = driver.getWindowHandles();    // get  window id of current window
			Iterator<String> itererator = windowId.iterator();   

			String mainWinID = itererator.next();
			String  newAdwinID = itererator.next();

			driver.switchTo().window(newAdwinID);
			System.out.println(driver.getTitle());
			Thread.sleep(3000);
			driver.close();

			driver.switchTo().window(mainWinID);
			System.out.println(driver.getTitle());
			Thread.sleep(2000);

		//	WebElement email_id= driver.findElement(By.xpath("//*[@id='c_uname']"));
		//	email_id.sendKeys("hi");
			Thread.sleep(5000);

			driver.close();
			driver.quit();
		}  
	}
}
