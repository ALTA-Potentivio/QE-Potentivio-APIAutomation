@hire-as-cafe
Feature: Hire As Cafe

  @post-hire
  Scenario: Success Hire Artist
    Given user has already had login token as cafe-owner
    When user send POST hire artist request to potentivio
    Then response status code should be 500
    And response structure should match json schema "hire-artist.json" from "Hire"

  @get-hire-cafe
  Scenario: Success get hire cafe information
    Given user has already had login token as cafe-owner
    When user send GET hire cafe request to potentivio
    Then response status code should be 200
    And response structure should match json schema "get-hire-cafe.json" from "Hire"

  @put-cafe-done
  Scenario: Success put cafe done payment status
    Given user has already had login token as cafe-owner
    When user send PUT cafe done request to potentivio
    Then response status code should be 200
    And response structure should match json schema "put-cafe-done.json" from "Hire"

  @put-rating
  Scenario: Success give rating to Artist
    Given user has already had login token as cafe-owner
    When user send PUT rating accept request to potentivio
    Then response status code should be 200
    And response structure should match json schema "put-rating.json" from "Hire"
