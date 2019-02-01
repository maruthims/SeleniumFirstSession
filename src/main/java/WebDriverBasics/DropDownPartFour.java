package WebDriverBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownPartFour {
static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Java/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http:www.facebook.com");
		String monthslist_xpath = "//select[@id = 'month']//option";
		String daylist_xpath = "//select[@id = 'day']//option";
		String yearlist_xpath = "//select[@id = 'year']//option";
		
		selectDropDownvalues(yearlist_xpath, "1999");
		selectDropDownvalues(daylist_xpath, "2");
		selectDropDownvalues(monthslist_xpath, "Dec");	
	}

	public static void selectDropDownvalues(String xpathvalue, String value) {
	
		List<WebElement> monthlist = driver.findElements(By.xpath(xpathvalue));
			
		
		for(int i=0;i<monthlist.size();i++) {
			System.out.println(monthlist.get(i).getText());
			if(monthlist.get(i).getText().equals(value)){
				monthlist.get(i).click();
				break;
			}
		}
		
	}
}
