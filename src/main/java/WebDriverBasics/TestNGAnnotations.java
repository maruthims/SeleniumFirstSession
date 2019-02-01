package WebDriverBasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {
	
//1
@BeforeSuite
public void launchBrowser() {
	System.out.println("Launch Browser");
}
//2
@BeforeTest
public void deleteAllCookies() {
	System.out.println("Delete All Cookies");
}
//3
@BeforeClass
public void enterURL() {
	System.out.println("Enter URL");
}
//4//7/10
@BeforeMethod
public void login() {
	System.out.println("Login to Application");
}
//5
@Test(priority=3)
public void homePageHeader_Test() {
	System.out.println("homePageHeaderTest");
}

//11
@Test(priority=1)
public void homePageInfo_Test() {
	System.out.println("homePageInfoTest");
}

//8
@Test(priority=2)
public void homePageTitle_Test() {
	System.out.println("homePageTitleTest");
}

//6/9/12
@AfterMethod

public void logout() {
	System.out.println("Logout");
}

@AfterClass
public void deleteUser() {
	
	System.out.println("Delete User");
}


@AfterTest
public void closeConnection() {
	
	System.out.println("Close Connection");
}


@AfterSuite
public void closeBrowser() {
	
	System.out.println("Close browser");
}

}
