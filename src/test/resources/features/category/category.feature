@all @category
Feature: Category

  @positive-postcategoryartist
  Scenario: Success POST Create Category Artist
    Given user has already had login token as artist
    When user send POST Create Category Artist request to potentivio
    Then response status code should be 200
    And response structure should match json schema "create-category.json" from "Category"

  @positive-getallcategory
  Scenario: Success GET All Category Artist
    Given user has already had login token as artist
    When user send GET All Category Artist request to potentivio
    Then response status code should be 200
    And response structure should match json schema "all-category.json" from "Category"

  @negative-getallcategory
  Scenario: Unsuccess GET All Category Artist by not logging in
    When user send GET All Category Artist request to potentivio but not login
    Then response status code should be 400
    And response structure should match json schema "unsuccess-get-all-category.json" from "Category"

