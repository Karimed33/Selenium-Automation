package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.recursos.*;

public class DespegarPage {
	@Test(description = "Validar que el funciones Despegar")
	public void ValidarBienvenidosWikipedia() throws Exception 
	{  
	WebDriver driver = null;
	driver = DriverFactory.LevantarNavegador(driver, "CHROME", "https://www.despegar.com.ar");
	WebElement alojamiento = driver.findElement(By.cssSelector(".header-products-container [href='//www.despegar.com.ar/hoteles/']"));
	Assert.assertTrue(alojamiento.isDisplayed(),"error de pagina");
	alojamiento.click();
	WebDriverWait wait= new WebDriverWait(driver, 5);
	wait.until(ExpectedConditions.visibilityOf(alojamiento));
	WebElement destino = driver.findElement(By.xpath("//div[@id='searchbox-sbox-box-hotels']//div[@class='sbox-places-destination--1xd0k']//input[@class='input-tag']"));
	Assert.assertTrue(destino.isDisplayed(),"error de pagina en Ingresar Destino");
	destino.click();
	wait.until(ExpectedConditions.elementToBeClickable(destino));
	destino.sendKeys("Cordoba, cordoba, Argentina");
	destino.sendKeys(Keys.ENTER);
	wait.until(ExpectedConditions.elementToBeClickable(destino));
	WebElement fechaEntrada = driver.findElement(By.xpath("//div[@id='searchbox-sbox-box-hotels']//input[@placeholder='Entrada']"));
	Assert.assertTrue(fechaEntrada.isDisplayed(),"error de pagina en Ingresar Fecha Entrada");
	wait.until(ExpectedConditions.visibilityOf(fechaEntrada));
	fechaEntrada.click();
	wait.until(ExpectedConditions.elementToBeClickable(fechaEntrada));
	WebElement eleccionFechaEntrada = driver.findElement(By.xpath("//*[@class='sbox5-floating-tooltip sbox5-floating-tooltip-opened']//*[@data-month='2022-07']//*[text()='4']"));
	eleccionFechaEntrada.click();
	wait.until(ExpectedConditions.elementToBeClickable(eleccionFechaEntrada));
	WebElement fechaSalida = driver.findElement(By.xpath("//*[@class='input-container']//input[@placeholder='Salida']"));
	Assert.assertTrue(fechaSalida.isDisplayed(),"error de pagina en Ingresar Fecha Salida");
	fechaSalida.click();
	wait.until(ExpectedConditions.elementToBeClickable(fechaSalida));
	WebElement eleccionFechaSalida = driver.findElement(By.xpath("//*[@class='sbox5-floating-tooltip sbox5-floating-tooltip-opened']//div[@data-month='2022-07']//*[text()='5']"));
	Assert.assertTrue(eleccionFechaSalida.isDisplayed(),"error de pagina al hacer click en salida");
	eleccionFechaSalida.click();
	wait.until(ExpectedConditions.elementToBeClickable(eleccionFechaSalida));
	WebElement botonAplicar = driver.findElement(By.xpath("//*[@class='sbox5-floating-tooltip sbox5-floating-tooltip-opened']//*[@class='calendar-footer-cta-container']//*[@class='sbox5-3-btn -primary -md -disable']//*[text()='Aplicar']"));
	Assert.assertTrue(botonAplicar.isDisplayed(),"Error al Aplicar ");
	botonAplicar.click();
	wait.until(ExpectedConditions.elementToBeClickable(botonAplicar));
	WebElement habitaciones = driver.findElement(By.xpath("//*[@class='sbox5-3-double-input']"));
	Assert.assertTrue(habitaciones.isDisplayed(),"error de pagina en Ingresar Habitacion");
	habitaciones.click();
	wait.until(ExpectedConditions.elementToBeClickable(habitaciones));
	WebElement cantidadAdultos = driver.findElement(By.xpath("//div[@class='stepper__distribution_container']//button[@class='steppers-icon-left stepper__icon']"));
	Assert.assertTrue(cantidadAdultos.isDisplayed(),"error de pagina en Ingresar Cantidad Adultos");
	cantidadAdultos.click();
	wait.until(ExpectedConditions.elementToBeClickable(cantidadAdultos));
	WebElement cantidadMenores = driver.findElement(By.xpath("//div[@class='stepper__distribution_container']//button[@class='steppers-icon-left stepper__icon']"));
	Assert.assertTrue(cantidadMenores.isDisplayed(),"error de pagina en Ingresar Cantidad Menores");
	cantidadMenores.click();
	wait.until(ExpectedConditions.elementToBeClickable(cantidadMenores));
	WebElement btnAplicar = driver.findElement(By.xpath("//a[@class='sbox5-3-btn -md -primary']"));
	Assert.assertTrue(btnAplicar.isDisplayed(),"error de pagina en Ingresar Habitaciones");
	btnAplicar.click();
	driver.close();	
	}
}

