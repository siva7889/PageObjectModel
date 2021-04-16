package base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import selenium.base.SeleniumBase;



public class ProjectSpecificMethods extends SeleniumBase {
	
	
	@BeforeMethod
	public void beforeMethod() {
		driver = startApp("chrome", "https://jqueryui.com/");
		node = test.createNode(testCaseName);
	}

	@AfterMethod
	public void afterMethod() {
		close();
	}

	

}
