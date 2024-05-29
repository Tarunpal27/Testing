Feature: Dropdown Navigation Functionality

  Scenario: Reach the page for a corresponding Navbar Service
    Given I am on Home page of Xenonstack
    When I hover on any Navbar Service
    And Click on Go to page
    Then I should reach the corresponding Service page