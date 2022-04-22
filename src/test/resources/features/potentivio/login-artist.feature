Feature: Login Artist

  @positive
  Scenario: Success POST login artist
    When user send POST login artist request to potentivio
    Then response status code should be 200
    And response structure should match json schema "login.json"