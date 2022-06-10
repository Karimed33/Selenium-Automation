package selenium.recursos;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

public class DriverFactory {
private enum browsers {CHROME, 	FIREFOX};
	
	public static WebDriver LevantarNavegador(WebDriver driver, String browserName, String URL) {
		
		switch (browsers.valueOf(browserName)) {
		case CHROME:
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Key\\Desktop\\Automation\\chromedriver.exe");
			Reporter.log("Abro Browser");
			driver = new ChromeDriver(); 
			break;
		} 
		case FIREFOX: 
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Key\\Desktop\\Automation\\geckodriver.exe");
			Reporter.log("Abro Browser");
			driver = new FirefoxDriver();
			break;
		}
		default:
			Reporter.log("No seleccionamos ningun navegador, se abrira Chrome");
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Key\\Desktop\\Automation\\chromedriver.exe");
			Reporter.log("abro browser");
			driver = new ChromeDriver();
			break;
		
		}
		
		driver.manage().window().maximize(); 
		driver.get(URL);		
		return driver;
	}
}
