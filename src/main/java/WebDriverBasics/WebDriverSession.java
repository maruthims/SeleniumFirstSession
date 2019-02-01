package WebDriverBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSession {

	public static void main(String[] args) {
		
		//1. Launch Browser
		System.setProperty("webdriver.chrome.driver", "/Java/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//2. Enter URL
		driver.get("http://www.gmail.com");
		
		//3. Get Title
		String title = driver.getTitle();
		System.out.println("Actual title is:  "+ title);
		
		//4 Validate Title
		if(title.equals("Gmail")) {
			System.out.println("It is correct title");
		}
		else {
			System.out.println("It is not correct title");
		}

		//5. Close the browser
		
		driver.quit();
	}
}

