@register
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