Feature: Search Validation

  Scenario: Enter "" and press Enter
    Given Search box is open
    When I Enter Nothing and press Enter
    Then I should get an alert to write something