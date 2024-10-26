Feature: Login page feature

Scenario: Verify the Home Page Title 
Given user is on Home page
When user gets the title of the page
Then page title should be "CURA Healthcare Service"


Scenario: Verify the Login Page
Given user is on Home page 
When user clicks on Make Appointment Button 
Then user redirects to Login Page 
Then Please login to make appointment should be displayed 
Then User Enters Username "John Doe"
Then User Enters Password "ThisIsNotAPassword"
Then User Click on Login Page 
Then User Redirects to Appointment Page 



