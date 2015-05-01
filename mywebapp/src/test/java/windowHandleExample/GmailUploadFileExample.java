package windowHandleExample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class GmailUploadFileExample {
	static WebDriver driver;
	String name = "telkikar.namrata@gmail.com";
	String pass = "Sriram123";

	@Test
	public void setUp() throws AWTException, InterruptedException
	{
		driver=new FirefoxDriver();
		driver.get("https://gmail.com");
		driver.manage().window().maximize();

		GmailUploadFileExample.SignIn(name, pass);
		GmailUploadFileExample.ComposeEmailAttachFile();
//		GmailUploadFileExample.SignOutCode(name);
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
	}

	public static void SignOutCode(String userEmail){
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.findElement(By.xpath(".//a[contains(@title, '" + userEmail + "')]")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//a[text()='Sign out' and @target='_top']")));
		driver.findElement(By.xpath(".//a[text()='Sign out' and @target='_top']")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("signIn")));
		}
}
