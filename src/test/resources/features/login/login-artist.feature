@login
Feature: Login Artist

  @successlogin
  Scenario: Successful POST login artist
    When user send POST login artist request to potentivio
    Then response status code should be 200
    And response structure should match json schema "login-artist.json" from "Login"

  @failedlogin
  Scenario: Unsuccess POST login artist
    When user send POST fagitiled login artist request to potentivio
    Then response status code should be 400
    And response structure should match json schema "failed400-login-artist.json" from "Login"