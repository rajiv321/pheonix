package driverfactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;


public class Driverfactory {
	
	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();

	
	public WebDriver init_driver(String browser, long implicitWait) {
//		 DesiredCapabilities capabilities = null;

		System.out.println("Browser valude is :" + browser);
		if (browser.equals("chrome")) {
//			WebDriverManager.chromedriver().driverVersion("104.0.5112.79").setup();
//			capabilities = DesiredCapabilities.chrome(); 
			tlDriver.set(new ChromeDriver());
		} else if (browser.equals("firefox")) {
//			WebDriverManager.firefoxdriver().setup();
			tlDriver.set(new FirefoxDriver());
		} else if (browser.equals("safari")) {
			tlDriver.set(new SafariDriver());
		} else {
			System.out.println("Please pass the correct browser value. You have enterd the browerser as :" + browser);
		}
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return getDriver();
		
		
	}

	
	public static synchronized WebDriver getDriver() {
		return tlDriver.get();
	}
}
