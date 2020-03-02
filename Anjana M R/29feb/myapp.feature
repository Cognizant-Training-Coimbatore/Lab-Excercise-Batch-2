
Feature: Testing facebook
  Scenario: user wants to login
    Given the user is already registered
    When the application is opened
    Then the user can login
    