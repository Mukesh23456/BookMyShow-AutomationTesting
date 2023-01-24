Feature: To validate booking functionality in the bookmyshow app
@Smoke
Scenario Outline: Book ticket for the particular movie
Given Open the bookmyshow website and search '<movie>'
When Select theatre and book the ticket
Then Verify the result page

Examples:
|movie|
|Drishyam 2|

