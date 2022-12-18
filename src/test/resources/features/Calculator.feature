@Calculator @Concept
Feature: As a potential client i need to open a calculator and do math operations

  @Smoke @Plus @Success
  Scenario: Plus operation
    Given Calculator is open
    When Seven Plus Eight
    Then Result is Fifteen