package WebDriverBasics;

import org.testng.annotations.Test;

public class DependsOnMethodsConceptTest {

	@Test()
	public void homePageHeader_Test() {
		System.out.println("homePageHeaderTest");
		int i = 9/0;
	
	}

		@Test(dependsOnMethods="homePageHeader_Test")
	public void homePageInfo_Test() {
		System.out.println("homePageInfoTest");
	}
		@Test()
		public void homePageSearch_Test() {
			System.out.println("homePageInfoTest");
		}

}
