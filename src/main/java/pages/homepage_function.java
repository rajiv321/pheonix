package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.model.Log;

import components.components;
import driverfactory.Driverfactory;
import util.Uimapper;

public class homepage_function {
	
	SoftAssert Assert = new SoftAssert();
	private WebDriver driver =  Driverfactory.getDriver();
	private components components = new components();
	
	public void the_user_verify_the_logo_of_the_contentive_website_is_visible() {
		Assert.assertTrue(components.element_Displayed(Uimapper.getElement("home_logo")));
	}
	
	
	public void the_user_verify_the_navigation_panel_has_tabs(String our_audiance, String advertise_with_us, String Media_pack, String insights, String contact_us, String subscribe) {
		components.Wait(1000);
		Assert.assertEquals(components.getText(Uimapper.getElement("navbr_audiance")), our_audiance);
//		String advertis_with_us = driver.findElement(By.xpath("//a[@title='Advertise With Us']")).getText();
		Assert.assertEquals(components.getText(Uimapper.getElement("navbar_advertise")), advertise_with_us);

//		String mediapack = driver.findElement(By.xpath("//a[@title='Contentive Media Pack']")).getText();
		Assert.assertEquals(components.getText(Uimapper.getElement("navbar_mediapk")), Media_pack);
		
//		String insignts = driver.findElement(By.xpath("//a[@title='Insights']")).getText();
		Assert.assertEquals(components.getText(Uimapper.getElement("navbar_insights")), insights);
		
//		String contactus = driver.findElement(By.xpath("//a[@title = 'Contact Us']")).getText();
		Assert.assertEquals(components.getText(Uimapper.getElement("navbar_contactus")), contact_us);
		
//		String Subscribe = driver.findElement(By.xpath("//a[@title='Subscribe']")).getText();
		Assert.assertEquals(components.getText(Uimapper.getElement("navbar_subscribe")), subscribe);
	}
	
	public void the_user_verify_that_the_header_section_has_header_content_as(String header) {
		String headr = components.getText(Uimapper.getElement("header_content_us"));
		String driver_header = headr.replace("\n", " ");
		Assert.assertEquals(driver_header, header);
	
	}
	
	public void the_sub_heading_should_be(String sub_header) {
		String subheader = components.getText(Uimapper.getElement("sub_header_content_us"));
		Assert.assertEquals(subheader, sub_header);
	}
	
	public void the_and_buttons_should_be_visible_in_the_home_page(String contactus, String our_publication) {
		components.Wait(2000);
		WebElement contactus_button =  components.find_webelement(Uimapper.getElement("contactus_button_home"));
//		WebElement contactus_button = driver.findElement(By.xpath("//div[@data-id='67e42f0a']/div/div/a/span/span[2]"));
		components.Scroll(Uimapper.getElement("contactus_button_home"));
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView(true);", contactus_button);
		components.Wait(2000);
	    String contactus_btn = contactus_button.getText();
	    Assert.assertEquals(contactus_btn, contactus);
	    components.Wait(2000);
	 
	   WebElement  our_publications = components.find_webelement(Uimapper.getElement("home_ourpublic_btn"));	   
	   Assert.assertEquals(our_publications, our_publication);
	}
	
	public void the_our_publication_section_in_the_home_page_should_have_leader(String header) {
		String header_web = components.getText(Uimapper.getElement("our_public_headr"));
//		WebElement header_web = driver.findElement(By.xpath("//div[@data-id='a0a1f37']//h2"));
//		JavascriptExecutor js = (JavascriptExecutor)driver;
		components.Scroll(Uimapper.getElement("our_public_headr"));
//		js.executeScript("arguments[0].scrollIntoView(true);", header_web);
		Assert.assertEquals(header_web, header);
	}
	
	public void in_the_subheader_should_be(String sub_header) {
		Assert.assertEquals(components.getText(Uimapper.getElement("sub_header_web")), sub_header);
	}
	
	public void the_button_should_be_visble_in_the_below_the_subheader_of_the_publication_section_of_the_homepage(String view_publications) {
		Assert.assertEquals(components.getText(Uimapper.getElement("view_publications_subh_web")), view_publications);
	}
	
	public void the_header_of_the_learn_more_section_of_the_should_be(String header) {
		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		components.find_webelement(Uimapper.getElement("view_publications_subh_web"));s
//		WebElement header_web = driver.findElement(By.xpath("//div[@data-id='e10dd2d']/div/div/a/span/span"));
//		js.executeScript("arguments[0].scrollIntoView(true)", header_web);
		components.Wait(2000);
		components.Scroll(Uimapper.getElement("view_publications_subh_web"));
		Assert.assertEquals(components.find_webelement(Uimapper.getElement("view_publications_subh_web")), header);
	}

	
	public void the_sub_header_of_the_learn_more_section_of_the_should_be(String subheader) {
//		WebElement subHeader = driver.findElement(By.xpath("//div[@data-id='589c953']"));
		components.Scroll(Uimapper.getElement("subHeader_learnmor"));
		Assert.assertEquals(components.find_webelement(Uimapper.getElement("subHeader_learnmor")), subheader);
	}
	
	public void the_button_must_be_visible_in_the_learn_more_section(String learnmore) {
		
//		WebElement learnmore_web = driver.findElement(By.xpath("//div[@data-id='0b462b3']/div/div/a/span/span"));
		components.Scroll(Uimapper.getElement("learn_more_btn"));
		Assert.assertEquals(components.getText(Uimapper.getElement("learn_more_btn")), learnmore);
	}
		  
}
