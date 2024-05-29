Feature: Search Validation2

  Scenario: Enter devops and press Enter
    Given Search box is opened
    When I Enter devops and press Enter
    Then I should get some info about devops.