@all @notification
Feature: Notification

  @positive-postcategoryartist
  Scenario: Success POST Send Notification to Cafe
    Given user has already had login token as artist
    When user send POST Notification to Artist request to potentivio
    Then response status code should be 200
    And response structure should match json schema "notification-to-cafe.json" from "Notification"

  @positive-getallcategory
  Scenario: Success GET All Notification from Artist
    Given user has already had login token as cafe-owner
    When user send GET All Notification request to potentivio
    Then response status code should be 200
    And response structure should match json schema "get-all-notification.json" from "Notification"

