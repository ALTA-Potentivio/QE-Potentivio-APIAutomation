@all @register
Feature: Register Artist

  @positive
  Scenario: Success POST Register artist
    When user send POST Register artist request to potentivio
    Then response status code should be 200
    And response structure should match json schema "register-artist.json" from "Register"

  @negative-register
  Scenario: Unsuccess POST Register artist
    When user send POST failed Register artist request to potentivio
    Then response status code should be 500
    And response structure should match json schema "failed500-register-artist.json" from "Register"

  @failedregister @duplicateemail
    Scenario:  Duplicate email POST Register artist
    When user send POST duplicate email Register request to potentivio
    Then response status code should be 500
    And  response structure should match json schema "failed500-register-artist.json" from "Register"

  @successregister @email
    Scenario: success POST Register artist Email using special character
    When user send POST Register artist using Email special character request to potentivio
    Then response status code should be 200
    And  response structure should match json schema "register-artist.json" from "Register"

  @failedregister @incompleteddata
    Scenario: Unsuccess POST Register artist incomplete data
    When user send POST Register artist the data not complete request to potentivio
    Then response status code should be 500
    And  response structure should match json schema "failed-register-artist.json" from "Register"
