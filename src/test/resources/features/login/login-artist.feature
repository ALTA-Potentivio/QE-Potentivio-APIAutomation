@login
Feature: Login Artist


  @positive
  Scenario: Successful POST login artist
    When user send POST login artist request to potentivio
    Then response status code should be 200
    And response structure should match json schema "login-artist.json"

  @negativelogin
  Scenario: Unsuccess POST login artist
    When user send POST failed login artist request to potentivio
    Then response status code should be 400
    And response structure should match json schema "failed400-login-artist.json"