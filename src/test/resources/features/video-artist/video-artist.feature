@all @video-artist
Feature: Video Artist

  @post-video
  Scenario: Success POST Video-Artist
    Given user has already had login token as artist
    When user send POST video artist request to potentivio
    Then response status code should be 200
    And response structure should match json schema "post-video.json" from "Video-Artist"

  @delete-video
  Scenario: Success DELETE Video-Artist
    Given user has already had login token as artist
    When user send DELETE video artist request to potentivio
    Then response status code should be 200
    And response structure should match json schema "delete-video.json" from "Video-Artist"

