
Feature: Artist

  @all @artist @positive-updateartist
  Scenario: Success PUT Update Artist
    Given user has already had login token as artist
    When user send PUT Update Artist request to potentivio
    Then response status code should be 200
    And response structure should match json schema "update-artist.json" from "Artist"

    @all @artist @positive-getallartist
    Scenario: Success GET All Artist
      Given user has already had login token as cafe-owner
      When user send GET All Artist request to potentivio
      Then response status code should be 200
      And response structure should match json schema "all-artist.json" from "Artist"

    @all @artist @negative-getallartist
    Scenario: Unsuccess GET All Artist by not logging in
      When user send GET All Artist request to potentivio but not login
      Then response status code should be 400
      And response structure should match json schema "unsuccess-get-all-artist.json" from "Artist"

    @all @artist @positive-getprofileartist
    Scenario: Success GET Profile Artist
      Given user has already had login token as artist
      When user send GET Profile Artist request to potentivio
      Then response status code should be 200
      And response structure should match json schema "profile-artist.json" from "Artist"

    @all @artist  @negative-getprofileartist
    Scenario: Unsuccess GET Profile Artist by not logging in
      When user send GET Profile Artist request to potentivio but not login
      Then response status code should be 400
      And response structure should match json schema "unsuccess-get-profile-artist.json" from "Artist"

    @all @artist @positive-getdetailartist
    Scenario: Success GET Detail Artist
      Given user has already had login token as cafe-owner
      When user send GET Detail Artist request to potentivio
      Then response status code should be 200
      And response structure should match json schema "detail-artist.json" from "Artist"

    @all @artist @negative-getdetailartist
    Scenario: Unsuccess GET Detail Artist by not logging in
      When user send GET Detail Artist request to potentivio but not login
      Then response status code should be 400
      And response structure should match json schema "unsuccess-get-detail-artist.json" from "Artist"

    @positive-deleteartist
    Scenario: Success DELETE Artist
      Given user has already had login token as artist
      When user send DELETE Artist request to potentivio
      Then response status code should be 200
      And response structure should match json schema "delete-artist.json" from "Artist"

