@Genre

Feature: Genre

  @positif-AddGenre
  Scenario: Success add Genre Music
    Given user has already had login token as artist
    When user send POST Create Genre Music artist request to potentivio
    Then response status code should be 200
    And response structure should match json schema "create-genre.json" from "Genre"

  @positif-getlistgenre
  Scenario: Success  Get all Genre Music
    Given user has already had login token as artist
    When user send  Get All Genre Music artist request to potentivio
    Then response status code should be 200
    And response structure should match json schema "all-genre.json" from "Genre"