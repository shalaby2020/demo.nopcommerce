@test
Feature:switch between currencies
  Scenario: guest user could switch between currencies [$, €]
    Given homepage
    When select currency
