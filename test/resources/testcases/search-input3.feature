Feature: Search Validation2

  Scenario: Enter " "(only space) and press Enter
    Given Search box open
    When I Enter space and press Enter
    Then I should get no results or similar