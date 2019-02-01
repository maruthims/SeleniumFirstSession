package WebDriverBasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWIndow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Java/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/font/b/a[1]")).click();
		Set<String> handles = driver.getWindowHandles();
		
		Iterator<String> itr = handles.iterator();
		String parentWindowID = itr.next();
		System.out.println("Parent Window id is " +parentWindowID);
		System.out.println("Parent Window title is " +driver.getTitle());
		String childWindowID = itr.next();
		System.out.println("Child" +childWindowID);
		
		driver.switchTo().window(childWindowID);
		System.out.println("child Window title is " +driver.getTitle());
		driver.close();
		driver.switchTo().window(parentWindowID);
		System.out.println("Parent Window title is " +driver.getTitle());
		
		
	}

}
