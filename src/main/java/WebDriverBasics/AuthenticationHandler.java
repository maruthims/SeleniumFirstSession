package WebDriverBasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationHandler {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Java/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String user = "admin";
		String password = "admin";
		
		//driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		driver.get("http://"+user+":"+password+"@"+"the-internet.herokuapp.com/basic_auth");
		driver.manage().window().maximize();
		
			
	}

}
