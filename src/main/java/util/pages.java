package util;

import org.openqa.selenium.WebDriver;

import driverfactory.Driverfactory;

public class pages {
	private Driverfactory driverFactory;
	private static WebDriver driver;
	
	public pages(WebDriver driver) {
		this.driver = driverFactory.getDriver();
	}
	
	
	public void setup () {
		driver.get("https://mvnrepository.com/artifact/org.testng/testng/7.7.0");
	}

}
