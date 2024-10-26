Feature: Take Appointment Feature 

Background:
Given user has already logged in to application
|username|password|
|John Doe|ThisIsNotAPassword|

Scenario: Verify the Appointment Page 
Given User is on Make Appointment Page 
When Make Appointment should be displayed 
And User Select Visit Date 
And User Enter Comments "Test"
And User Clicks on Book Appointment Button 
Then message Appointment Confirmation should be displayed 
And Second message Please be informed that your appointment has been booked as following: should be displayed 
And Go to Homepage Button should be displayed 
