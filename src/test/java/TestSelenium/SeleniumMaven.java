package TestSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumMaven {

	public static void main(String[] args) {
		WebDriver driver;
		
		System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\geckodriver.exe");
		driver= new FirefoxDriver();
		driver.get("http://www.google.com");
		
		driver.manage().window().maximize();//Maximima la ventana
		
		//---------------------Localizadores
		
		driver.findElement(By.name("q")).sendKeys("A tester mate");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		//--------------------Localizadores
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.quit();
	}
	
	/*
	1.driver.findElement(By.name("q")).sendKeys("A tester mate");

	driver: 
	Esto es una instancia del WebDriver de Selenium que se utiliza para controlar el navegador web.
	
	findElement(By.name("q")): 
	Esto busca un elemento en la página web con el atributo "name" igual a "q". En este caso, parece estar buscando un campo de entrada de texto con el nombre "q".
	
	sendKeys("A tester mate"): 
	Una vez que se encuentra el elemento, este método envía las teclas proporcionadas al elemento. 
	En este caso, está escribiendo el texto "A tester mate" en el campo de entrada.
	
	2.driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

	Similar a la línea anterior, encuentra el mismo elemento en la página web.
	
	sendKeys(Keys.ENTER): 
	Envia la tecla "Enter" al elemento, lo cual simula presionar la tecla Enter 
	después de ingresar el texto en el campo de entrada.
	
	
	En resumen, estas dos líneas de código están interactuando con un campo de búsqueda (posiblemente en un motor de búsqueda)
	 al escribir "A tester mate" y luego presionar la tecla Enter para realizar la búsqueda.
	  */
	
	

}
