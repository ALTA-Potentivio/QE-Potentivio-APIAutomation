@all
Feature: Register Cafe Owner

  @positive
  Scenario: Success POST Register cafe owner
    When user send POST Register cafe owner request to potentivio
    Then response status code should be 200
    And response structure should match json schema "register-cafe-owner.json" from "Register"