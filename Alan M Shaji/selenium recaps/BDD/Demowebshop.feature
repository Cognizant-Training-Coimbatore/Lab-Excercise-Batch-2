#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Login to demowebshop
   @tag1
  Scenario Outline: User wantsto login the application
    Given the application has been opened
    When the user enters the "<username>" "<password>"
    Then the user is able to login logout
    Examples: 
      | username  | password |
      | sarath@mail.com |password|
      | sarath@mail.com |password|
      | sarath@mail.com |password|      