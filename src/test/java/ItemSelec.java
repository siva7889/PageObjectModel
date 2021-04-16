import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ItemSelec {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver;
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.navigate().to("https://jqueryui.com/selectable/");




		driver.switchTo().frame(0);

		Thread.sleep(3000);


		List<WebElement> selectables = driver.findElements(By.xpath("//ol[@id='selectable']/li"));
		 
		int size=  selectables.size();

		for (WebElement items: selectables )

		{
		String itemvalues = items.getText();

		System.out.print(itemvalues);

		}


		Actions action = new Actions(driver);

		action.keyDown(Keys.CONTROL).
		   click(selectables.get(0))
		.click(selectables.get(2))
		.click(selectables.get(6))
		.build().
		perform();



		}



	



	}


