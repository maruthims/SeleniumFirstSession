package WebDriverBasics;

import org.openqa.selenium.WebDriver;

public class ElementActions {

	public static WebDriver driver;
	
	public void launchUrl(String url) {
		if(url.equals("") || url.equals(null)){
			try{
				System.out.println("URL is blank or null");
				} catch (Exception e) {
				e.printStackTrace();
		
				}
		}
		try
		{
			driver.get(url);
		}catch(Exception e) {
			System.out.println("url not found");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
