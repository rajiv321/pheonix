package stepdef;

import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;
import driverfactory.Driverfactory;
import io.cucumber.java.en.*;
import pages.homepage_function;

public class homepage {
	SoftAssert Assert = new SoftAssert();
	private WebDriver driver =  Driverfactory.getDriver();
	private homepage_function homefn = new  homepage_function();
	
	@Given("User is on the Contentive Website HomePage")
	public void user_is_on_the_contentive_website_home_page() {
	    driver.get("https://www.contentive.com/");
	}
	@When("The User Verify the Logo of the Contentive Website is visible")
	public void the_user_verify_the_logo_of_the_contentive_website_is_visible() {
		homefn.the_user_verify_the_logo_of_the_contentive_website_is_visible();
	}
	
	@Then("The User Verify the Navigation Panel has {string} ,{string},{string},{string},{string},{string} tabs")
	public void the_user_verify_the_navigation_panel_has_tabs(String our_audiance, String advertise_with_us, String Media_pack, String insights, String contact_us, String subscribe){
		
		homefn.the_user_verify_the_navigation_panel_has_tabs(our_audiance, advertise_with_us, Media_pack, insights, contact_us, subscribe);
	}
	
	@Then("The User Verify that the Header Section has Header Content as {string}")
	public void the_user_verify_that_the_header_section_has_header_content_as(String header) {
		homefn.the_user_verify_that_the_header_section_has_header_content_as(header);
	}
	@Then("The Sub Heading should be {string}")
	public void the_sub_heading_should_be(String sub_header) {
		homefn.the_sub_heading_should_be(sub_header);
		
	}
	@Then("The {string} and {string} buttons should be visible in the Home Page")
	public void the_and_buttons_should_be_visible_in_the_home_page(String contactus, String our_publication){
		
		homefn.the_and_buttons_should_be_visible_in_the_home_page(contactus, our_publication);
	  
	}
	@Then("The Our Publication section in the Home page should have Leader {string}")
	public void the_our_publication_section_in_the_home_page_should_have_leader(String header) {
		homefn.the_our_publication_section_in_the_home_page_should_have_leader(header);
		
	}
	@Then("In the Subheader should be {string}")
	public void in_the_subheader_should_be(String sub_header) {
	    homefn.in_the_subheader_should_be(sub_header);
	}
	@Then("The {string} button should be visble in the below the subheader of the Publication section of the homepage")
	public void the_button_should_be_visble_in_the_below_the_subheader_of_the_publication_section_of_the_homepage(String view_publications) {
		homefn.the_button_should_be_visble_in_the_below_the_subheader_of_the_publication_section_of_the_homepage(view_publications);
	}
	
	@Then("The Header of the learn more section of the should be {string}")
	public void the_header_of_the_learn_more_section_of_the_should_be(String header) {

		homefn.the_header_of_the_learn_more_section_of_the_should_be(header);
	}
	@Then("The subHeader of the learn more section of the should be {string}")
	public void the_sub_header_of_the_learn_more_section_of_the_should_be(String subheader) {

		homefn.the_sub_header_of_the_learn_more_section_of_the_should_be(subheader);
	}
	@Then("The {string} button must be visible in the learn more section")
	public void the_button_must_be_visible_in_the_learn_more_section(String learnmore) {

		homefn.the_button_must_be_visible_in_the_learn_more_section(learnmore);
	}
	


}
