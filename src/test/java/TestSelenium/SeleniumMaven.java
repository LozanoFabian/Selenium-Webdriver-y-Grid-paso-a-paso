package TestSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumMaven {

	public static void main(String[] args) {
		WebDriver driver;
		
		System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\geckodriver.exe");
		driver= new FirefoxDriver();
		driver.get("http://www.youtube.com");
		
		driver.manage().window().maximize();//Maximima la ventana
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.quit();
	}
	
	//--------Explicacion Codigo------------------------
	/*
	1. WebDriver driver;: 
	Declara una variable llamada driver del tipo WebDriver, 
	que es la interfaz principal de Selenium WebDriver utilizada para interactuar con los navegadores.

	2.System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\geckodriver.exe");:
	Configura la propiedad del sistema para indicar la ubicación del controlador (driver) de Gecko (para Firefox). Esto es necesario para que Selenium pueda interactuar con el navegador Firefox. La ruta del controlador se establece en "src\test\resources\geckodriver.exe".

	3.driver = new FirefoxDriver();: 
	Crea una nueva instancia de FirefoxDriver, que implementa la interfaz WebDriver. 
	Esto inicializa una nueva sesión de Firefox que será controlada por Selenium.

	4.driver.get("http://www.youtube.com");: 
	Abre el navegador Firefox y navega a la URL proporcionada, 
	que en este caso es "http://www.youtube.com".

	5.driver.manage().window().maximize();: 
	Maximiza la ventana del navegador. 
	Este método es utilizado para asegurarse de que la ventana del navegador esté en modo maximizado.

	6.try { Thread.sleep(5000); } catch (InterruptedException e) { e.printStackTrace(); }: 
	Introduce un bloque de espera de 5 segundos. 
	Este bloque try-catch se utiliza para manejar la excepción InterruptedException que puede ocurrir cuando se utiliza Thread.sleep(). 
	En este caso, simplemente imprime la traza de la pila si se produce la excepción.

	7.driver.quit();: 
	Cierra la sesión del navegador y libera los recursos asociados.
	 Es importante cerrar el navegador al finalizar la prueba para liberar los recursos y 
	 evitar que quede en ejecución en segundo plano.
	
	* */
	
	

}
