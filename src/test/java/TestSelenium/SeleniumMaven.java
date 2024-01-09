package TestSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumMaven {

	public static void main(String[] args) {

//Declarar el objeto WebDriver
		WebDriver driver;

//Configurar la propiedad del controlador de Gecko (Firefox)
		System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\geckodriver.exe");

//Inicializar el objeto WebDriver como un nuevo FirefoxDriver
		driver = new FirefoxDriver();

//Abrir la página web de YouTube
		driver.get("https://www.atestermate.com/AutomationExample.php");

//Maximizar la ventana del navegador
		driver.manage().window().maximize();
		
//---------------------Inicio---------------------------------//	
		
/*
1. Select comboPerfil=new Select(driver.findElement(By.name("profile")));:

	Se está creando un objeto de la clase Select, 
	que se utiliza para trabajar con elementos de tipo lista desplegable (dropdown) en Selenium.
	
	driver.findElement(By.name("profile")) encuentra el elemento de la página web con el nombre "profile" 
	y lo pasa al constructor de Select.
	
2. comboPerfil.selectByVisibleText("Test Manager");:

	Selecciona un elemento de la lista desplegable por su texto visible.
	
	En este caso, selecciona el elemento cuyo texto visible es "Test Manager".

3. comboPerfil.selectByValue("1236");:

	Selecciona un elemento de la lista desplegable por su atributo "value".
	
	En este caso, selecciona el elemento cuyo valor es "1236".

4. comboPerfil.selectByIndex(4);:

	Selecciona un elemento de la lista desplegable por su índice.
	
	En este caso, selecciona el quinto elemento de la lista (los índices comienzan desde 0).
 
 */		

		Select comboPerfil=new Select (driver.findElement(By.name("profile")));
		
		comboPerfil.selectByVisibleText("Test Manager");
		
		comboPerfil.selectByValue("1236");
		
		comboPerfil.selectByIndex(4);
		
//---------------------Fin---------------------------------//			

//Esperar 2000 milisegundos (2 segundos) para dar tiempo a que se carguen los resultados
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

//Cerrar el navegador
		driver.quit();
	}

}
