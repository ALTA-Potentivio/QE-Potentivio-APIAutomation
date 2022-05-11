@all
Feature: Register Cafe Owner

  @positive @successregistercafe
  Scenario: Success POST Register cafe owner
    When user send POST Register cafe owner request to potentivio
    Then response status code should be 200
    And response structure should match json schema "register-cafe-owner.json" from "Register"

  @negative @failedregistercafeowner
  Scenario:  Duplicate email POST Register Email Cafe Owner
    When user send POST duplicate email Register as Cafe Owner request to potentivio
    Then response status code should be 500
    And  response structure should match json schema "failed500-register-cafe-owner.json" from "Register"

  @negative @failedregistercafeowner @emptyemail
  Scenario: Unsuccess POST Register cafe owner with empty email
    When user send POST Register Cafe Owner with empty email request to potentivio
    Then response status code should be 500
    And  response structure should match json schema "failed-email-regis-cafe.json" from "Register"

  @negative @failedregistercafeowner @emptypassword
  Scenario: Unsuccess POST Register cafe owner with empty password
    When user send POST Register Cafe Owner with empty password request to potentivio
    Then response status code should be 500
    And  response structure should match json schema "failed-empty-password.json" from "Register"

  @negative @failedregistercafeowner @emptyemailandpassword
  Scenario: Unsuccess POST Register cafe owner with empty email and password
    When user send POST Register Cafe Owner with empty email and password request to potentivio
    Then response status code should be 500
    And  response structure should match json schema "failed-register-emptyemailpassword.json" from "Register"

