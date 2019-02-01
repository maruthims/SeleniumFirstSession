package WebDriverBasics;

import org.testng.annotations.Test;

public class InvocationConceptTest2 {

	@Test(invocationCount=5)
	public void homePageHeader_Test() {
		System.out.println("homePageHeaderTest");
	}

	//11
	@Test()
	public void homePageInfo_Test() {
		System.out.println("homePageInfoTest");
	}

}
