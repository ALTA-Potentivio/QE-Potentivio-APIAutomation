@all @hire-as-cafe
Feature: Hire As Cafe

  @post-hire
  Scenario: Success Hire Artist
    Given user has already had login token as cafe-owner 2
    When user send POST hire artist 3 request to potentivio
    Then response status code should be 200
    And response structure should match json schema "hire-artist.json" from "Hire"

  @put-reject
  Scenario: Success reject Hire Artist
    Given user has already had login token as artist 3
    When user send PUT reject accept request to potentivio
    Then response status code should be 200
    And response structure should match json schema "put-reject.json" from "Hire"

  @post-hire
  Scenario: Success Hire Artist
    Given user has already had login token as cafe-owner 2
    When user send POST hire artist 4 request to potentivio
    Then response status code should be 200
    And response structure should match json schema "hire-artist.json" from "Hire"

  @put-cancel
  Scenario: Success Cancel Hire Artist
    Given user has already had login token as cafe-owner 2
    When user send PUT cancel accept request to potentivio
    Then response status code should be 200
    And response structure should match json schema "put-cancel.json" from "Hire"
