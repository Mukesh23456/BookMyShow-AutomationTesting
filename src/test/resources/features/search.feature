Feature: To validate search functionality in the bookmyshow app
@Smoke
Scenario Outline: Search the different movies
Given Open bookmyshow website
When Search '<movie>' in the website
Then Click enter and see the result '<pagetitle>'

Examples:
|movie|pagetitle|
|avatar|Avatar: The Way of Water|
|connect|Connect|


