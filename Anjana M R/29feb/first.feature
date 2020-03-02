
Feature: Search in google
  Scenario Outline:  User want to search a specific website
    Given The application has been opened
    When the user wants to search for the string"<keyword>"
    Then the user selects the first link
    
    Examples:
    |keyword| 
     |rational performance tester|
     |jmeter|
     |Specflow testing in c sharp|