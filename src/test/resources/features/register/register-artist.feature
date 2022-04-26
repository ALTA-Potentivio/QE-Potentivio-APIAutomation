Feature: Register Artist

  @positive
  Scenario: Success POST Register artist
    When user send POST Register artist request to potentivio
    Then response status code should be 200
    And response structure should match json schema "register-artist.json"