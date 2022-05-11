@hire-as-artist
Feature: Hire As Cafe

  @get-hire-artist
  Scenario: Success Get Hire Information Artist
    Given user has already had login token as artist
    When user send GET hire artist request to potentivio
    Then response status code should be 200
    And response structure should match json schema "get-hire-artist.json" from "Hire"

  @post-accept
  Scenario: Success Accept Hire Artist
    Given user has already had login token as artist
    When user send POST accept request to potentivio
    Then response status code should be 200
    And response structure should match json schema "post-accept.json" from "Hire"

  @put-reject
  Scenario: Success reject Hire Artist
    Given user has already had login token as artist
    When user send PUT reject accept request to potentivio
    Then response status code should be 200
    And response structure should match json schema "put-reject.json" from "Hire"

  @put-cancel
  Scenario: Success Cancel Hire Artist
    Given user has already had login token as artist
    When user send PUT cancel accept request to potentivio
    Then response status code should be 200
    And response structure should match json schema "put-cancel.json" from "Hire"
