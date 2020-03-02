Feature: Search in Google
Scenario Outline: User wants to search a specific web site
Given the application has been opened
When the user wants to search for string "<keyword>"
Then the user selects the first link


Examples: 
|keyword|
|rational performance tester| 
|jmeter|    
|Specflow testing in c sharp|
