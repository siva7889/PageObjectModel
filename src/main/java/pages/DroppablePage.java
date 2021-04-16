package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import com.aventstack.extentreports.ExtentTest;
import base.ProjectSpecificMethods;

public class DroppablePage extends ProjectSpecificMethods{
	public DroppablePage(RemoteWebDriver driver,ExtentTest node) {
		this.driver = driver;
		this.node = node;
	}
	public DroppablePage dragAndDrop() {
		
		switchToFrame(0);		
		WebElement source = driver.findElementById("draggable");
		WebElement target = driver.findElementById("droppable");
		dragAndDrop(source,target);
		return this;
	}
	
}
