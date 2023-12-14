package TestSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SeleniumMavenTest {
	
	@Test
	public void ejecutarTest() {
		WebDriver driver;
		
		System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\geckodriver.exe");
		driver= new FirefoxDriver();
		driver.get("http://www.google.com");
		
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("A tester mate");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.quit();
	}

}
