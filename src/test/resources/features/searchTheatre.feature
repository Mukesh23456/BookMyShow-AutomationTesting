Feature: To validate search functionality in the bookmyshow app
@Smoke
Scenario Outline: Search the different theatres
Given Open the bookmyshow website
When Search '<theatre>' name in the website
Then Click enter and verify the result '<pagetitle>'

Examples:
|theatre|pagetitle|
|Elpro|Elpro City|
