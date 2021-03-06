@all @image-cafe
Feature: Image Cafe

  @positive @post-image
  Scenario: Success POST Send Notification to Cafe
    Given user has already had login token as artist
    When user send POST upload image cafe request to potentivio
    Then response status code should be 200
    And response structure should match json schema "post-image.json" from "Image-Cafe"

  @positive @delete-image
  Scenario: Success DELETE Image Cafe
    Given user has already had login token as cafe-owner
    When user send DELETE image cafe request to potentivio
    Then response status code should be 200
    And response structure should match json schema "delete-image.json" from "Image-Cafe"