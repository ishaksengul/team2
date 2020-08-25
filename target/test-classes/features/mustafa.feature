@muska
Feature: Google search
  Scenario: user search muska on google
    Given user on the google page
    And user searches for muska
    Then verify the results has muska