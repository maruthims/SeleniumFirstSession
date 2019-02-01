package WebDriverBasics;

import org.testng.annotations.Test;

public class PriorityConceptTest {
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
	@Test(priority=-1)
	public void homePageTitle_Test() {
		System.out.println("homePageTitleTest");
	}
	@Test(priority=-1,enabled=false)
	public void homePageSearch_Test() {
		System.out.println("homePageSearchTest");
	}
}
