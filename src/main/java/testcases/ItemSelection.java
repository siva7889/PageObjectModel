package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.HomePage;

@Test
public class ItemSelection extends ProjectSpecificMethods {

	@BeforeTest
	public void setValues() {
		testCaseName = "ItemNoSelection";
		testDescription = "To select the list of items";
		nodes = "JQuery";
		authors = "Siva";
		category = "Functional";
		
	}
	public void itemSelectTest() {
		new HomePage(driver, node).clickSelectable().clickandhold();
	}
}
