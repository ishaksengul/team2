@X
Feature: Google search
  Scenario: user search hollanda on google
    Given user on the google page
    And user searches for hollanda
    Then verify the results has hollanda