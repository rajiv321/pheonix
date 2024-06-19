 Feature: To Validate the Contents of the HomePage and the Get in Touch Form of the Contentive Home-Page
 
 @tag2
  Scenario: To Validate the Form in the Contentive Home Page
  	Given User is on the Contentive Website HomePage
  	When  The User Scrolls to the "Get in touch" form the form should be visble.
  	When  The User when clicking on the submit button without filling the form all the inputs sections of the forms should show Error Messages.
  	When  The User fills the details with Valid details and clicks submit then the user should not see the Error Messages