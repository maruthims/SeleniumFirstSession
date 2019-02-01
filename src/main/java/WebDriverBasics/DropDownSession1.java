package WebDriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSession1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Java/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//2. Enter URL
		driver.get("http://www.facebook.com");
		
		WebElement month = driver.findElement(By.id("month"));
		WebElement day = driver.findElement(By.id("day"));
		WebElement year = driver.findElement(By.id("year"));
		
		/*selectValueFromDropDown(day,"10");
		selectValueFromDropDown(month,"May");
		selectValueFromDropDown(year,"1982");
		*/
		String dob = "10-May-1987";
		String dobArr[] = dob.split("-");
		
		selectValueFromDropDown(day,dobArr[0]);
		selectValueFromDropDown(month,dobArr[1]);
		selectValueFromDropDown(year,dobArr[2]);
		
		
		
		/*Select selectmonth = new Select(month);
		selectmonth.selectByVisibleText("May");
		Select selectday = new Select(day);
		selectday.selectByVisibleText("6");
		Select selectyear = new Select(year);
		selectyear.selectByVisibleText("1980");
		*/
		
	}

	public static void selectValueFromDropDown(WebElement ele, String value)
{

		Select select = new Select(ele);
		select.selectByVisibleText(value);
		
}
}
