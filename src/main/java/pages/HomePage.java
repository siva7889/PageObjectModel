package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;

import base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods{
	public HomePage(RemoteWebDriver driver, ExtentTest node) { // Constructor
		this.driver = driver;
		this.node = node;
		PageFactory.initElements(driver, this);		
	}
	@FindBy(how =How.LINK_TEXT,using="Droppable") WebElement eleDroppable;
	public DroppablePage clickDroppable() {
		click(eleDroppable);
		return new DroppablePage(driver,node);
	}
	
	@FindBy(how =How.LINK_TEXT,using="Selectable") WebElement eleSelectable;
	public SelectablePage clickSelectable() {
		click(eleSelectable);
		return new SelectablePage(driver, node);
	}
	
	@FindBy(how =How.LINK_TEXT,using="Controlgroup") WebElement elecontrolgroup;
	public Controlgrouppage clickcontrolgroup() {
		click(elecontrolgroup);
		return new Controlgrouppage(driver, node);
	}
	
}
