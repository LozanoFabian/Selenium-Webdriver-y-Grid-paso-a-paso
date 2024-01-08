package TestSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SeleniumMavenTest {
	
	@Test
	public void ejecutarTest() {
		WebDriver driver;
		
		System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\geckodriver.exe");
		driver= new FirefoxDriver();
		driver.get("http://www.youtube.com");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js =(JavascriptExecutor) driver;
		
		driver.findElement(By.id("search")).sendKeys("A tester mate");
		driver.findElement(By.id("search-icon-legacy")).click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement El1=driver.findElement(By.xpath("//*[text()='Estimación de Pruebas de Software']"));
		js.executeScript("arguments[0].scrollIntoView();", El1);
		El1.click();
		
		
		driver.quit();
	}

}
