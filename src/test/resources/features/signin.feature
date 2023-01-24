Feature: To validate signin functionality in the bookmyshow app
@Smoke
Scenario: Signin the website
Given Open Bookmyshow website
When Enter location and Click signin
Then Enter credentials and signin the website

@Smoke
Scenario: Signin the website with invalid creditials
Given Open Bookmyshow website
When Enter location and Click signin
Then Enter invalid credentials and signin the website
