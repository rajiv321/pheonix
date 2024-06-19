package stepdef;



import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import driverfactory.Driverfactory;
import util.pages;

public class first_test {
	private WebDriver driver = null;
	private pages loginPage = new pages(driver);

	@BeforeTest
	
	public void before() {
//		Driverfactory driverfactory = new Driverfactory();
//		driver = driverfactory.init_driver("chrome", 10);
		
		 	WebDriver driver = null;
		 	ChromeOptions options = new ChromeOptions();

	        try {
	            driver = new RemoteWebDriver(new URL("http://13.51.202.89:4444"), options);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }

//	        if (driver != null) {
//	            driver.get("https://www.example.com"); // Replace with your desired URL
//	            System.out.println("Page title: " + driver.getTitle());
//	            driver.quit();
//	        } else {
//	            System.out.println("Driver initialization failed.");
//	        }
	    }
	
	
	@Test
	public void validate_aurthor() throws InterruptedException {
		driver.get("https://www.accountancyage.com/wp-admin");
		driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("rajiv.jena@blenheimchalcot.com");
		driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys("C4GphkPUG#K2398yhgp09");
		driver.findElement(By.xpath("//input[@id='wp-submit']")).click();
		Thread.sleep(10000);
		driver.get("https://www.accountancyage.com/wp-admin/admin-ajax.php?action=update_users&testing=1");
		Thread.sleep(20000);
		List<WebElement> links = driver.findElements(By.xpath("//a[contains(text(),'View Post')]"));
		driver.get(links.get(1).toString());

	}

}
