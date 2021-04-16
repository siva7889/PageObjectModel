package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.aventstack.extentreports.ExtentTest;

import base.ProjectSpecificMethods;

public class Controlgrouppage extends ProjectSpecificMethods {

	

		public Controlgrouppage(RemoteWebDriver driver,ExtentTest node) {
			this.driver = driver;
			this.node = node;
		}
		public Controlgrouppage fieldsize() {
			
			
			
			driver.switchTo().frame(0);
			
			
			 WebElement compactcar= driver.findElement(By.id("car-type-button"));
			 WebElement carType= driver.findElement(By.xpath("//div[@class='ui-selectmenu-menu ui-front ui-selectmenu-open']//div[text()='SUV']"));
				wait.until(ExpectedConditions.visibilityOf(carType));
			 WebElement automatic=driver.findElement(By.xpath("//label[@for='transmission-automatic']"));
			 WebElement insurance=driver.findElement(By.xpath("//label[@for='insurance']"));
			 WebElement horizontalspinner=driver.findElement(By.xpath("//input[@class='ui-spinner-input' and @id='horizontal-spinner']"));
			 horizontalspinner.sendKeys("2");
			  WebElement Compactcardown =driver.findElement(By.xpath("/html[1]/body[1]/div[1]/fieldset[2]/div[1]/span[1]/span[2]") );
			  WebElement Truck = driver.findElement(By.xpath("//div[@id='ui-id-14']"));
		     WebElement standard =driver.findElement(By.xpath("/html[1]/body[1]/div[1]/fieldset[2]/div[1]/label[1]/span[1]")); 
		      WebElement insurance2 =driver.findElement(By.xpath("/html[1]/body[1]/div[1]/fieldset[2]/div[1]/label[3]/span[1]"));
              WebElement noOfcar2=driver.findElement(By.xpath("//input[@id='vertical-spinner']"));
				 noOfcar2.sendKeys("1");
				 WebElement booking=driver.findElement(By.id("book"));
				 
			fieldsize(compactcar,carType,automatic,  insurance,
							 Compactcardown, Truck, standard,insurance2,booking);
				
			 
	
			
			 
			 return this;
		}

}