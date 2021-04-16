package selenium.base;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import io.github.bonigarcia.wdm.WebDriverManager;
import utils.Reporter;

public class SeleniumBase extends Reporter {

	public RemoteWebDriver driver;
	public WebDriverWait wait;

	
	public void click(WebElement ele) {
		String text="";
		try {
			wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.elementToBeClickable(ele));
			text = ele.getText();
			ele.click();
			reportStep("The Element "+text+" clicked", "pass"); 
		} catch (StaleElementReferenceException e) {
			reportStep("The Element "+text+" could not be clicked", "fail");
			throw new RuntimeException();
		} 
	}
	
	public void switchToFrame(int index) {
		driver.switchTo().frame(index);
	}
	
	public void dragAndDrop(WebElement eleSource, WebElement eleTarget) {		
		try {
			Actions builder = new Actions(driver);
			builder.dragAndDrop(eleSource, eleTarget).build().perform();
			reportStep("The Element has been dragged and dropped", "pass");
		} catch (Exception e) {
			reportStep("Drag and Drop failed", "fail");
			System.err.println(e);
		}
	}
		
		public void clickandhold(WebElement item1, WebElement item3,WebElement item7 ) {		
			try {
				Actions action = new Actions(driver);
				action.clickAndHold (item1);
				action.clickAndHold(item3);
				action.clickAndHold(item7);
				action.build().perform();
			
				reportStep("The Element has been selectable", "pass");
			} catch (Exception e) {
				reportStep("Select items failed", "fail");
				System.err.println(e);
			}
		}
			
			public void fieldsize (WebElement compactcar, WebElement carType, WebElement  automatic, 
					WebElement insurance, WebElement  Compactcardown, WebElement Truck , WebElement standard, 
					WebElement insurance2, WebElement booking)
			{
			
				
				
		  try{
				
				Actions action1=new Actions(driver);
				action1.click(compactcar).build().perform();
				action1.click(carType).build().perform();
				action1.click(automatic).build().perform();
				action1.click(insurance).build().perform();
				action1.click(Compactcardown).build().perform();
				action1.click(Truck).build().perform();
				action1.click(standard).build().perform();
				action1.click(insurance2).build().perform();
				action1.click(booking).build().perform();
			
				reportStep("The fieldest elements has been selected", "pass");
			} catch (Exception e) {
				reportStep("The fieldset elements are not selected", "fail");
				System.err.println(e);
			}
			
			}		
			
				
			
				 
			
	
	public RemoteWebDriver startApp(String url) {
		return startApp("chrome", url);
	}

	
	public RemoteWebDriver startApp(String browser, String url) {
		try {
			if(browser.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			} else if(browser.equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			} else if(browser.equalsIgnoreCase("ie")) {
				WebDriverManager.iedriver().setup();
				driver = new InternetExplorerDriver();
			}
			driver.navigate().to(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		} catch (Exception e) {
			reportStep("The Browser Could not be Launched. Hence Failed", "fail");
			throw new RuntimeException();
		} 
		return driver;

	}

	public long takeSnap(){
		long number = (long) Math.floor(Math.random() * 900000000L) + 10000000L; 
		try {
			FileUtils.copyFile(driver.getScreenshotAs(OutputType.FILE) , new File("./reports/images/"+number+".jpg"));
		} catch (WebDriverException e) {
			System.out.println("The browser has been closed.");
		} catch (IOException e) {
			System.out.println("The snapshot could not be taken");
		}
		return number;
	}

	public void close() {
		driver.close();

	}

	
	public void quit() {
		driver.quit();

	}

	
	
}
