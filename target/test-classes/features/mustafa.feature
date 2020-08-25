@muska
Feature: Google search
  Scenario: user search iphone on google
    Given user on the google page as mustafa
    And user searches for iphone
    Then verify the results has iphone