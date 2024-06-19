Feature: To Validate the Contents of the HomePage and the Get in Touch Form of the Contentive Home-Page

  @tag1
  Scenario: To Validate the Contents of the Home Page
    Given User is on the Contentive Website HomePage
    When The User Verify the Logo of the Contentive Website is visible
    Then The User Verify the Navigation Panel has "Our Audiences" ,"Advertise With Us","MediaPack","Insights","Contact Us","Subscribe" tabs
    Then The User Verify that the Header Section has Header Content as "Business publications for enterprise leaders"
    And The Sub Heading should be "Contentive provides leaders in Finance and HR with relevant insights and industry news"
    And The "Contact Us" and "Our Publications" buttons should be visible in the Home Page
    And The Our Publication section in the Home page should have Leader "Lead in your industry with insights from our publications"
    And In the Subheader should be "Our publications help enterprise leaders stay on top of important developments and trends in their industries."
    And The "View Publications" button should be visble in the below the subheader of the Publication section of the homepage
    And The Header of the learn more section of the should be "Build demand and grow your business with us"
    And The subHeader of the learn more section of the should be "We provide outreach, content creation and lead development for B2B technology companies. We do this via our leading news brands, world-class in house content studio and buyer intent data platform."
    And The "Learn more" button must be visible in the learn more section
