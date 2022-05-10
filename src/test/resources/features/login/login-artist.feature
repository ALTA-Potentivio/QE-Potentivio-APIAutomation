@all @login
Feature: Login Artist


  @successlogin

  Scenario: Successful POST login artist
    When user send POST login artist request to potentivio
    Then response status code should be 200
    And response structure should match json schema "login-artist.json" from "Login"

  @failedlogin @wrongpassword
  Scenario: Unsuccess POST login artist using wrong password
    When user send POST wrong password login artist request to potentivio
    Then response status code should be 400
    And response structure should match json schema "failed400-login-artist.json" from "Login"

  @failedlogin @wrongemail
  Scenario: Unsuccess POST login artist using wrong email
    When user send POST wrong email login artist request to potentivio
    Then response status code should be 400
    And response structure should match json schema "failed400-login-artist.json" from "Login"

  @failedlogin @emptypassword
  Scenario: Unsuccess POST login artist without password
    When user send POST without password login artist request to potentivio
    Then response status code should be 400
    And response structure should match json schema "failed400-login-artist.json" from "Login"

  @failedlogin @emptyemail
  Scenario: Unsuccess POST login artist without email
    When user send POST without email login artist request to potentivio
    Then response status code should be 400
    And response structure should match json schema "failed400-login-artist.json" from "Login"

  @failedlogin @emptyemail @emptypassword
  Scenario: Unsuccess POST login artist without email and password
    When user send POST without email and password login artist request to potentivio
    Then response status code should be 400
    And response structure should match json schema "failed400-login-artist.json" from "Login"

  @failedlogin @unregisteredaccount
  Scenario: Unsuccess POST login artist with unregistered account
    When user send POST with unregistered account login artist request to potentivio
    Then response status code should be 400
    And response structure should match json schema "failed400-login-artist.json" from "Login"