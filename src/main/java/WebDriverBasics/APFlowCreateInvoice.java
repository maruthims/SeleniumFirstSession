package WebDriverBasics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class APFlowCreateInvoice {
static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Java/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://test.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("racherla.maruthy@corp.sysco.uat");
		driver.findElement(By.id("password")).sendKeys("Sysco123");
		driver.findElement(By.id("Login")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[contains(@title, 'Invoice')]")).click();
		//driver.get("https://syscoapflow--uat.lightning.force.com/lightning/n/Invoice");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='brandBand_1']//div//button[3]")).click();
		WebElement Worktype = driver.findElement(By.xpath("//*[@id='911:2495;a']"));
		//*[@id="911:2495;a"]
		Select selectWorkType = new Select(Worktype);
		selectWorkType.selectByVisibleText("PO Invoice");
		
	//	selectWorktype(Worktype_xpath, "PO Invoice");
		
		
		}

}
