Feature: To validate price range changing functionality in the bookmyshow app
@Smoke
Scenario Outline: change price range for the particular movie
Given Open the Bookmyshow website and search the '<movie>'
When Change the price range
Then Verify that the price range is changed

Examples:
|movie|
|Drishyam 2|