@Cafe
Feature: Cafe

  @all @positive-getallcafe
  Scenario: Success GET All Cafe
    Given user has already had login token as artist
    When user send GET All Cafe request to potentivio
    Then response status code should be 200
    And response structure should match json schema "all-cafe.json" from "cafe"

  @all @positive-getprofilecafe
  Scenario: Success GET Profile Cafe
    Given user has already had login token as cafe-owner
    When user send GET Profile Cafe request to potentivio
    Then response status code should be 200
    And response structure should match json schema "profil-cafe.json" from "cafe"

  @all @positive-getdetailcafe
  Scenario: Success GET Detail Cafe
    Given user has already had login token as cafe-owner
    When user send GET Detail Cafe by id request to potentivio
    Then response status code should be 200
    And response structure should match json schema "detail-cafe.json" from "cafe"

  @all @positive-updatecafe
  Scenario: Success PUT Update Cafe
    Given user has already had login token as cafe-owner
    When user send PUT Update Cafe request to potentivio
    Then response status code should be 200
    And response structure should match json schema "update-cafe.json" from "cafe"

  @positive-deletecafe
  Scenario: Success DELETE Cafe
    Given user has already had login token as cafe-owner
    When user send DELETE Cafe request to potentivio
    Then response status code should be 200
    And response structure should match json schema "delete-cafe.json" from "cafe"