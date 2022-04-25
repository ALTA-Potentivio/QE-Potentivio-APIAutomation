Feature: Login Artist

  @negative
  Scenario: Unsuccessful POST login artist
    When user send POST login artist request to potentivio
    Then response status code should be 400
    And response structure should match json schema "failed-login-artist.json"