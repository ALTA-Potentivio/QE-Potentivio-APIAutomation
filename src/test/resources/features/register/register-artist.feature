@all @register
Feature: Register Artist

  @positive @successregisterartist
  Scenario: Success POST Register artist
    When user send POST Register artist request to potentivio
    Then response status code should be 200
    And response structure should match json schema "register-artist.json" from "Register"

  @negative @failedregisterartist @duplicateemail
    Scenario:  Duplicate email POST Register artist
    When user send POST duplicate email Register request to potentivio
    Then response status code should be 500
    And  response structure should match json schema "failed500-register-artist.json" from "Register"


  @negative @failedregisterartist @emptyemail
    Scenario: Unsuccess POST Register artist with empty email
    When user send POST Register artist with empty email request to potentivio
    Then response status code should be 500
    And  response structure should match json schema "failed-empty-email.json" from "Register"

  @negative @failedregisterartist @emptypassword
  Scenario: Unsuccess POST Register artist with empty password
    When user send POST Register artist with empty password request to potentivio
    Then response status code should be 500
    And  response structure should match json schema "failed-empty-password.json" from "Register"

  @negative @failedregisterartist @emptyemailandpassword
  Scenario: Unsuccess POST Register artist with empty email and password
    When user send POST Register artist with empty email and password request to potentivio
    Then response status code should be 500
    And  response structure should match json schema "failed-register-emptyemailpassword.json" from "Register"
