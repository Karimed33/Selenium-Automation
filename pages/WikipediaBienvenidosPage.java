package selenium.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.recursos.*;


public class WikipediaBienvenidosPage {
	@Test(description = "Validar que el titulo de wikipedia sea Bienvenidos")
	public void ValidarBienvenidosWikipedia() throws Exception 
	{  
	WebDriver driver = null;
	driver = DriverFactory.LevantarNavegador(driver, "CHROME", "http://es.wikipedia.org/wiki/Wikipedia:Portada");
	WebElement bienvenidos = driver.findElement(By.xpath("//*[@id='Bienvenidos_a_Wikipedia,']"));  // Bienvenidos_a_Wikipedia,
	Assert.assertTrue(bienvenidos.isDisplayed());
	String textowiki="Bienvenidos a Wikipedia,";
	String resultado= bienvenidos.getText();
	Assert.assertEquals(resultado, textowiki);
	driver.close();	
	}
}
