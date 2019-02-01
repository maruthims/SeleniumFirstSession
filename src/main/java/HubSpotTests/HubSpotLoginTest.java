package HubSpotTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HubSpotLoginTest {

	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "/Java/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://app.hubspot.com/login");
		
	}
	
	@Test
	public void verifyLoginPageTitle_Test() throws InterruptedException {
		System.out.println("Title is");
		String title = driver.getTitle();
		System.out.println("Title is : " +title);
		Assert.assertEquals(title, "HubSpot Login","Title is not equal");
		System.out.println("Testing git hub");
	}
	
	@Test
	public void loginTest() {
		driver.findElement(By.id("username")).sendKeys("maruthims@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Pass@1234");
		driver.findElement(By.id("loginBtn")).click();
	WebDriverWait wait = new WebDriverWait(driver,20);
	wait.until(ExpectedConditions.titleContains("Getting Started | HubSpot"));
	
	String title = driver.getTitle();
	System.out.println("Home Page Title is : " +title);
	Assert.assertEquals(title, "Getting Started | HubSpot");
		
	}
	
	@Test
	public void verifyAccountNameTest() throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys("maruthims@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Pass@1234");
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(4000);
		WebElement aName = driver.findElement(By.className("account-name "));
		//WebElement accountName = driver.findElement(By.xpath("//a/span[contains(text(),'maruthy')]"));
		System.out.println("Account Name is : " +aName.getText());
		Assert.assertEquals(aName.getText(), "maruthy", "Account Name is wrong");
			
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
