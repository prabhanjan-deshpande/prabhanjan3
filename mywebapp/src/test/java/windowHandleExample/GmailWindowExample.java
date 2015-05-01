package windowHandleExample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class GmailWindowExample {
	static WebDriver driver;
	String name = "telkikar.namrata@gmail.com";
	String pass = "Sriram123";

	@Test
	public void setUp() throws AWTException, InterruptedException
	{
		driver=new FirefoxDriver();
		driver.get("https://gmail.com");
		driver.manage().window().maximize();

		GmailWindowExample.SignIn(name, pass);
		GmailWindowExample.ComposeEmailAttachFile();
		GmailWindowExample.SignOutCode(name);
	}
	public static  void SignIn(String Email, String Passwd) throws InterruptedException{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		// enter a valid email address
		driver.findElement(By.id("Email")).sendKeys(Email);
		// enter a valid password
		driver.findElement(By.id("Passwd")).sendKeys(Passwd);
		// click on sign in button
		driver.findElement(By.id("signIn")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//a[contains(@title, '" + Email + "')]")));
	}

	public static void ComposeEmailAttachFile() throws AWTException{
		// click on compose button
		driver.findElement(By.xpath("//div[@class='z0']//div[contains(text(),'COMPOSE')]")).click();
		// click on attach files icon
		driver.findElement(By.xpath("//div[contains(@command,'Files')]//div[contains(@class,'aaA')]")).click();
		//enter email address
		driver.findElement(By.xpath("//tr/td[2]//div[2]/div")).sendKeys("prabhanjan.d@gmail.com");
		//Enter subject field
		driver.findElement(By.xpath("//tr/td[2]//div[3]/input")).sendKeys("This is selenium robot class example");
		// creating instance of Robot class (A java based utility)
		Robot rb =new Robot();
		// pressing keys with the help of keyPress and keyRelease events
		rb.keyPress(KeyEvent.VK_E);
		rb.keyRelease(KeyEvent.VK_E);
		rb.delay(1000);
		rb.keyPress(KeyEvent.VK_SHIFT);
		rb.keyPress(KeyEvent.VK_SEMICOLON);
		rb.keyRelease(KeyEvent.VK_SEMICOLON);
		rb.keyRelease(KeyEvent.VK_SHIFT);
		rb.keyPress(KeyEvent.VK_BACK_SLASH);
		rb.keyRelease(KeyEvent.VK_BACK_SLASH);
		rb.delay(1000);
		rb.keyPress(KeyEvent.VK_F);
		rb.keyRelease(KeyEvent.VK_F);
		rb.keyPress(KeyEvent.VK_I);
		rb.keyRelease(KeyEvent.VK_I);
		rb.keyPress(KeyEvent.VK_L);
		rb.keyRelease(KeyEvent.VK_L);
		rb.keyPress(KeyEvent.VK_E);
		rb.keyRelease(KeyEvent.VK_E);
		rb.delay(1000);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		rb.delay(3000);
	}

	public static void SignOutCode(String userEmail){
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.findElement(By.xpath(".//a[contains(@title, '" + userEmail + "')]")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//a[text()='Sign out' and @target='_top']")));
		driver.findElement(By.xpath(".//a[text()='Sign out' and @target='_top']")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("signIn")));
	}
}
