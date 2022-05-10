@register-cafe-owner
Feature: Register Cafe Owner

  @positive
  Scenario: Success POST Register cafe owner
    When user send POST Register cafe owner request to potentivio
    Then response status code should be 200
    And response structure should match json schema "register-cafe-owner.json" from "Register"

  @failedregistercafeowner
  Scenario:  Duplicate email POST Register Email Cafe Owner
    When user send POST duplicate email Register As Cafe Owner request to potentivio
    Then response status code should be 500
    And  response structure should match json schema "failed500-register-cafe-owner.json" from "Register"

  @failedregistercafeowner
  Scenario: Unsuccess POST Register artist Email using special character
    When user send POST Register Cafe Owner with Email special character request to potentivio
    Then response status code should be 400
    And  response structure should match json schema "failed400-register-cafe-owner.json" from "Register"

  @incompleteddatacafeowner
  Scenario: Unsuccess POST Register artist incomplete data
    When user send POST Register Cafe Owner the data not complete request to potentivio
    Then response status code should be 500
    And  response structure should match json schema "failed500-register-cafe-owner.json" from "Register"
