@artist
Feature: Artist

    @positive @getallartist
    Scenario: Success GET All Artist
      When user send GET All Artist request to potentivio
      Then response status code should be 200
      And response structure should match json schema "all-artist.json"

    @positive @getprofileartist
    Scenario: Success GET Profile Artist
      When user send GET Profile Artist request to potentivio
      Then response status code should be 200
      And response structure should match json schema "profile-artist.json"

    @positive @getdetailartist
    Scenario: Success GET Detail Artist
      When user send GET Detail Artist request to potentivio
      Then response status code should be 200
      And response structure should match json schema "detail-artist.json"

    @positive @updateartist
    Scenario: Success PUT Update Artist
      When user send PUT Update Artist request to potentivio
      Then response status code should be 200
      And response structure should match json schema "update-artist.json"

#  @positive @deleteartist
#  Scenario: Success DELETE Artist
#    When user send DELETE Artist request to potentivio
#    Then response status code should be 200

