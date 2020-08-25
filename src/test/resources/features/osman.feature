@Osman
Feature: Google search
  Scenario: user search Mathematik on google
    Given user on the google page
    And user searches for Mathematik
    Then verify the results has Mathematik