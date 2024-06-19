package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import driverfactory.Driverfactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import util.Uimapper;

public class homePage_GetinTouch {

	SoftAssert Assert = new SoftAssert();

	private WebDriver driver =  Driverfactory.getDriver();
//	@Given("User is on the Contentive Website HomePage")
//	public void user_is_on_the_contentive_website_home_page() {
//	    driver.get("https://www.contentive.com/");
//	}
	
	@When("The User Scrolls to the {string} form the form should be visble.")
	public void the_user_scrolls_to_the_form_the_form_should_be_visble(String get_in_touchs	) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement get_in_touch = driver.findElement(By.xpath("//div[@data-id='07c07d4']/div/div/div/h2"));
		js.executeScript("arguments[0].scrollIntoView(true)", get_in_touch);
		Assert.assertEquals(get_in_touchs, get_in_touch);
//		String sub_header =   driver.findElement(By.xpath("//div[@data-id='8c600d7']/div/p")).getText();
		Assert.assertEquals(driver.findElement(By.xpath("//div[@data-id='8c600d7']/div/p")).getText(), "We’re excited to learn more about your sales & marketing plans.");
		Thread.sleep(3000);
	}

	@When("The User when clicking on the submit button without filling the form all the inputs sections of the forms should show Error Messages.")
	public void the_user_when_clicking_on_the_submit_button_without_filling_the_form_all_the_inputs_sections_of_the_forms_should_show_error_messages() throws InterruptedException {
		
		driver.switchTo().frame("hs-form-iframe-0");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement submits = driver.findElement(By.xpath("//*[@class='hs_submit hs-submit']/div/input"));
		js.executeScript("arguments[0].scrollIntoView(true)",submits);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		WebElement  fname = driver.findElement(By.xpath("//input[@name='firstname']"));
		js.executeScript("arguments[0].scrollIntoView(true)", fname);
		Assert.assertTrue(driver.findElement(By.xpath("//input[@name='firstname']/following::ul//li/label")).isDisplayed());
		Thread.sleep(2000);
		WebElement lname = driver.findElement(By.xpath("//label[@placeholder=\"Enter your Last Name\"]/following::ul/li/label"));
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView(true)", lname);
		Assert.assertTrue(lname.isDisplayed());
		Thread.sleep(2000);
		WebElement bemail = driver.findElement(By.xpath("//label[@placeholder='Enter your Business Email']"));
		js.executeScript("arguments[0].scrollIntoView(true)", bemail);
		Assert.assertTrue(driver.findElement(By.xpath("//label[@placeholder='Enter your Business Email']/following::ul/li/label")).isDisplayed());
		Thread.sleep(2000);
		WebElement cname = driver.findElement(By.xpath("(//label[@placeholder='Enter your Company Name']/following::ul/li/label)[1]"));
		js.executeScript("arguments[0].scrollIntoView(true)", cname);
		Assert.assertTrue(cname.isDisplayed());
		Thread.sleep(2000);
		WebElement jtitle = driver.findElement(By.xpath("(//label[@placeholder='Enter your Job Title']/following::ul/li/label)[1]"));
		js.executeScript("arguments[0].scrollIntoView(true)", jtitle);
		Assert.assertTrue(jtitle.isDisplayed());
		Thread.sleep(2000);
		WebElement country = driver.findElement(By.xpath("(//label[@placeholder='Enter your Country/Geo']/following::ul/li/label)[1]"));
		js.executeScript("arguments[0].scrollIntoView(true)", country);
		Assert.assertTrue(country.isDisplayed());
		Thread.sleep(2000);
		WebElement complete_all_req = driver.findElement(By.xpath("//div[@class='hs_error_rollup']//li/label"));
		js.executeScript("arguments[0].scrollIntoView(true)", complete_all_req);
		Assert.assertTrue(complete_all_req.isDisplayed());
		
		
	}

	@When("The User fills the details with Valid details and clicks submit then the user should not see the Error Messages")
	public void the_user_fills_the_details_with_valid_details_and_clicks_submit_then_the_user_should_not_see_the_error_messages() {
	   
	}	
	
}
