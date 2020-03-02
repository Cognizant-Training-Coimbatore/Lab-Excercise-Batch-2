
Feature: Login to demowebshop
  Scenario Outline:  User want to login the application
    Given the application has been opened
    When the user enters the "<username>" "<password>"
    Then the user is able to login logout
    Examples: 
    |username|password|
     |anjanarajeev12@gmail.com|Anjana@8|
     |anjan|4667|
     |anjahabbav@gmail.com|567576|
