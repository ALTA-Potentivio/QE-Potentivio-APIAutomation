Feature: Login Cafe Owner

  Scenario: Successful POST login cafe owner
    When user send POST login cafe owner request to potentivio
    Then response status code should be 200
    And response structure should match json schema "login-cafe-owner.json"