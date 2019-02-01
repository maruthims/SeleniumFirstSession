package WebDriverBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownPartTwo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Java/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http:www.facebook.com");
		
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		Select select = new Select(day);
		List<WebElement> noofdays = select.getOptions();
		System.out.println(noofdays.size());
		int TotalDays = noofdays.size()-1;
		for(int i = 0; i<noofdays.size();i++) {
			 	String dayvalues = noofdays.get(i).getText();
			 	if(dayvalues.equals("6")){
			 		noofdays.get(i).click();
			 		break;
			 	}
			 			
			 			
			 	//System.out.println(dayvalues);
		}
		
		Select selectmonths = new Select(month);
		List<WebElement> noofmonths = selectmonths.getOptions();
		System.out.println(noofmonths.size());
		int TotalMonths = noofmonths.size()-1;
		for(int i = 0; i<noofmonths.size();i++) {
			 	String monthsvalues = noofmonths.get(i).getText();
			 	if(monthsvalues.equals("May")){
			 		noofmonths.get(i).click();
			 		break;
			 	}
			 //	System.out.println(monthsvalues);
		}
		
		Select selectyears = new Select(year);
		List<WebElement> noofyears = selectyears.getOptions();
		System.out.println(noofyears.size());
		int TotalYears = noofyears.size()-1;
		for(int i = 0; i<noofyears.size();i++) {
			 	String yearvalues = noofyears.get(i).getText();
			 	if(yearvalues.equals("1980")){
			 		noofyears.get(i).click();
			 		break;
			 	}
			 	System.out.println(yearvalues);
		}
				
	}

}
