package windowHandleExample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class CopyOfGmailWindowExample {
	static WebDriver driver;
	String name = "telkikar.namrata@gmail.com";
	String pass = "Sriram123";
	String subjectName="neha";

	@Test
	public void setUp() throws AWTException, InterruptedException
	{
		driver=new FirefoxDriver();
		driver.get("https://gmail.com");
		driver.manage().window().maximize();

		CopyOfGmailWindowExample.SignIn(name, pass);
		CopyOfGmailWindowExample.SearchForEmail(subjectName);
		//CopyOfGmailWindowExample.SignOutCode(name);
		
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
		System.out.println("In sign in method");
	}

	public static void SearchForEmail(String Search){
		System.out.println("In search method");
		driver.findElement(By.xpath("//tr/td/div/input[1]")).sendKeys(Search);
		driver.findElement(By.xpath("//form/div/button")).click();
		String size = driver.findElement(By.xpath("//div[4]/div[1]/div[2]//span/b[3]")).getText();
		System.out.println("Size : "+size);
	}

	public static void SignOutCode(String userEmail){
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.findElement(By.xpath(".//a[contains(@title, '" + userEmail + "')]")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//a[text()='Sign out' and @target='_top']")));
		driver.findElement(By.xpath(".//a[text()='Sign out' and @target='_top']")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("signIn")));
	}
}
