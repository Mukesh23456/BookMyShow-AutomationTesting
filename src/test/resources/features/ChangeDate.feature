Feature: To validate date changing functionality in the bookmyshow app
@Smoke
Scenario Outline: change date for the particular movie
Given Open the Bookmyshow website and search '<movie>'
When Change the movie date
Then Verify that the date is changed

Examples:
|movie|
|Drishyam 2|