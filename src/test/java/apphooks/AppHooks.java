package apphooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import driverfactory.Driverfactory;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class AppHooks {
	
	private Driverfactory driverFactory;
	private static WebDriver driver;
	
	@Before
	public void before() {
//		String browserName = prop.getProperty("browser");
//		long implcitWait = Integer.parseInt(prop.getProperty("implicitWait"));
		driverFactory = new Driverfactory();
		driver = driverFactory.init_driver("chrome",10);  //We are giving life to driver
	}
	
	
	@After
	public void after() {
		driver.close();
		System.out.println("Hooks close ");
	}
	
	@AfterStep(order = 1)
	public void afterStep(Scenario scenario)
	{
		if(scenario.isFailed()) {
			String screenShotName = scenario.getName().replaceAll(" ", "_");			
			byte[] sourcePath= ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcePath, "image/png", screenShotName);
		}
	}
	
	@AfterAll
	public static void after_all() {
		if(driver!= null ) {
			driver.quit();
		}
	}

}
