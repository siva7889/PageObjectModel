package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;

import base.ProjectSpecificMethods;

public class SelectablePage extends ProjectSpecificMethods {
	public SelectablePage(RemoteWebDriver driver,ExtentTest node) {
		this.driver = driver;
		this.node = node;
		
	}
	
	public SelectablePage clickandhold()  {
		WebElement frame = driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frame);

		WebDriverWait wait = new WebDriverWait(driver, 20);
		 WebElement item1 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@class='ui-widget-content ui-selectee' and text()='Item 1']")));
		
		WebElement item3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@class='ui-widget-content ui-selectee' and text()='Item 3']")));
		WebElement item7 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@class='ui-widget-content ui-selectee' and text()='Item 7']")));
		clickandhold(item1,item3,item7);
		return this;
		
		
	}
}

	

	

