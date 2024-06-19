package components;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driverfactory.Driverfactory;

public class components {
	private WebDriver driver;
	
	public components() {
		this.driver = Driverfactory.getDriver();
	}
	
	public String getText(String element) {
		return driver.findElement(By.xpath(element)).getText();
	}
	
	public boolean element_Displayed(String element) {
		return driver.findElement(By.xpath(element)).isDisplayed();
	}
	
	public void click(String element) {
		driver.findElement(By.xpath(element)).click();
	}
	
	public void Wait(int TimeMiliseconds) {
		try {
			Thread.sleep(TimeMiliseconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	//returns the webelement 
	public WebElement find_webelement(String Element) {
		return driver.findElement(By.xpath(Element));
	}
	
	public void wait_element_Displayed(String Element) {
		WebElement element = driver.findElement(By.xpath(Element));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(45));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	
	public void wait_element_Clickable(String Element) {
		WebElement element = driver.findElement(By.xpath(Element));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void click_Action(String Element)
	{
		Actions action = new Actions(driver);
		action.click(driver.findElement(By.xpath(Element)));
	}
	
	public void double_click_Action(String Element) {
		Actions action = new Actions(driver);
		action.doubleClick(driver.findElement(By.xpath(Element)));
		
	}
	
	public void movetoElement (String Element)
	{
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath(Element)));
	}
	
	
	public void Scroll(String Element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", driver.findElement(By.xpath(Element)));
	}
	
	public void Scroll_bottom(String Element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

}
