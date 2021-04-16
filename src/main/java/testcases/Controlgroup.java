package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.HomePage;

public class Controlgroup extends ProjectSpecificMethods {

	
	
	@BeforeTest
	public void setValues() {
		testCaseName = "Controlgroup actions";
		testDescription = "Perform various actions in control group";
		nodes = "JQuery";
		authors = "Siva";
		category = "Functional";
		
	}
	@Test
	public void fieldsize() {
		new HomePage(driver, node).clickcontrolgroup().fieldsize();
		
	}
}
