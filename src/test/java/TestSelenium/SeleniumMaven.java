package TestSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumMaven {

	public static void main(String[] args) {
		WebDriver driver;
		
		System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\geckodriver.exe");
		driver= new FirefoxDriver();
		driver.get("http://www.youtube.com");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.quit();
	}

}
