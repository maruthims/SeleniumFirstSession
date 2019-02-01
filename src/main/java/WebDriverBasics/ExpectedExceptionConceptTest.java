package WebDriverBasics;

import org.testng.annotations.Test;

public class ExpectedExceptionConceptTest {

	@Test(expectedExceptions = ArithmeticException.class)
	public void homePageHeader_Test() {
		System.out.println("homePageHeaderTest");
		int i = 9/0;
	}

	//11
	@Test()
	public void homePageInfo_Test() {
		System.out.println("homePageInfoTest");
	}

}
