package TestSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumMaven {

	public static void main(String[] args) {

//Declarar el objeto WebDriver
		WebDriver driver;

//Configurar la propiedad del controlador de Gecko (Firefox)
		System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\geckodriver.exe");

//Inicializar el objeto WebDriver como un nuevo FirefoxDriver
		driver = new FirefoxDriver();

//Abrir la página web de YouTube
		driver.get("http://www.youtube.com");

//Maximizar la ventana del navegador
		driver.manage().window().maximize();

//Crear un objeto JavascriptExecutor para ejecutar scripts JavaScript
		JavascriptExecutor js = (JavascriptExecutor) driver;

//Encontrar el elemento con el texto 'Reject all' mediante XPath
		WebElement El2 = driver.findElement(By.xpath("//*[text()='Reject all']"));

//Desplazar la vista hacia el elemento 'Reject all'
		js.executeScript("arguments[0].scrollIntoView();", El2);

//Hacer clic en el elemento 'Reject all'
		El2.click();

//Encontrar el elemento con el ID 'search' (barra de búsqueda) y escribir 'A tester mate'
		driver.findElement(By.id("search")).sendKeys("A tester mate");

//Encontrar el elemento con el ID 'search-icon-legacy' (ícono de búsqueda) y hacer clic en él
		driver.findElement(By.id("search-icon-legacy")).click();

//Esperar 2000 milisegundos (2 segundos) para dar tiempo a que se carguen los resultados
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

//Encontrar el elemento con el texto 'Estimación de Pruebas de Software' mediante XPath
		WebElement El1 = driver.findElement(By.xpath("//*[text()='Estimación de Pruebas de Software']"));

//Desplazar la vista hacia el elemento 'Estimación de Pruebas de Software'
		js.executeScript("arguments[0].scrollIntoView();", El1);

//Hacer clic en el elemento 'Estimación de Pruebas de Software'
		El1.click();

//Cerrar el navegador
		driver.quit();
	}

}
