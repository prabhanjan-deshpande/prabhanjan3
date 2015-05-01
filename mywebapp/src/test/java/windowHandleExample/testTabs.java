package windowHandleExample;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testTabs {
	static WebDriver driver;
	
	@Test
	public void testTabsExample() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
	    driver.get("https://business.twitter.com/start-advertising");
	    assertStartAdvertising();

	    // considering that there is only one tab opened in that point.
	    String oldTab = driver.getWindowHandle();
	    driver.findElement(By.linkText("Twitter Advertising Blog")).click();
	    ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
	    newTab.remove(oldTab);
	    // change focus to new tab
	    driver.switchTo().window(newTab.get(0));
	    assertAdvertisingBlog();

	    // Do what you want here, you are in the new tab

	    driver.close();
	    // change focus back to old tab
	    driver.switchTo().window(oldTab);
	    assertStartAdvertising();
	   //+ driver.close();
	    driver.quit();
	    // Do what you want here, you are in the old tab
	}

	private void assertStartAdvertising() {
	    Assert.assertEquals("Start Advertising | Twitter for Business", driver.getTitle());
	}

	private void assertAdvertisingBlog() {
		Assert.assertEquals(driver.getTitle(), "Advertising | Twitter Blogs");// "Twitter Advertising");
		
	}
}
