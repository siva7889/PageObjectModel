package testcases;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.HomePage;


public class DragAndDropTheElement extends ProjectSpecificMethods {
	
	@BeforeTest
	public void setValues() {
		testCaseName = "DragAndDropTheElement";
		testDescription = "To drag and drop the element";
		nodes = "JQuery";
		authors = "Siva";
		category = "Functional";
		
	}
	@Test
	public void dragDropTest() {
		new HomePage(driver, node).clickDroppable().dragAndDrop();
	}
}
