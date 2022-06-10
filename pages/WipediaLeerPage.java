package selenium.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.recursos.*;

public class WipediaLeerPage {
	@Test(description = "Validar que el click boton Leer de wikipedia portada")
	public void ValidarBienvenidosWikipedia() throws Exception {  
	WebDriver driver = null;
	driver = DriverFactory.LevantarNavegador(driver, "CHROME", "http://es.wikipedia.org/wiki/Wikipedia:Portada");
	WebElement clickLeer = driver.findElement(By.xpath("//*[@id='main-tfa']//*[@class='main-footer'] //*[@class='main-footer-actions main-plainlist nomobile']/ul/li[1]/a[1]"));  
	Assert.assertTrue(clickLeer.isDisplayed());  
	clickLeer.click();
	WebElement tituloResultado = driver.findElement(By.id("firstHeading"));  
	System.out.println("Texto encontrado "+ tituloResultado.getText());  
	Assert.assertTrue(tituloResultado.isDisplayed(), "Antonín_Dvořák");
	driver.close();	
	}
}

