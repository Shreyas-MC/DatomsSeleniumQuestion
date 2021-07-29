@Datoms
Feature: Navigate and test the Login page
	
	@DatomsTest1
  Scenario Outline: Launch the Browser and navigate to the Datoms Login page
    Given User launches the chrome browser
    When User navigates to "<URL>"
    Then User should be in the login page
    And User closes the browser
    
  Examples:
  |	URL	|
	| https://accounts.datoms.io/login |
	
	@DatomsTest2
	Scenario Outline: Verify that the necessary Elements are present on the page
   Given User launches the chrome browser
   When User navigates to "<URL>"
   Then User should be in the login page
   And Login Header is present
   And Email input box is present
   And Password input box is present
   And LoginButton is present
   And Forgot password link is present 
   
  Examples:
  |	URL	|
	| https://accounts.datoms.io/login |