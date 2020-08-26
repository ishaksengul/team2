@usame
Feature: Google search
  Scenario: user search samsung on google
    Given user on the google page
    And user searches for samsung
    Then verify the results has samsung