package WebDriverBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownPartThree {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Java/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http:www.facebook.com");
		
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		//List<WebElement> yearlist = driver.findElements(By.id("year"));
		List<WebElement> yearlist = driver.findElements(By.xpath("//select[@id = 'year']//option"));
		System.out.println(yearlist.size());
		
		List<WebElement> monthslist = driver.findElements(By.xpath("//select[@id = 'month']//option"));
		for(int i=0;i<monthslist.size();i++) {
			System.out.println(monthslist.get(i).getText());
			if(monthslist.get(i).getText().equals("Feb")){
				monthslist.get(i).click();
				break;
			}
		}
		System.out.println(monthslist.size());
	}

}
