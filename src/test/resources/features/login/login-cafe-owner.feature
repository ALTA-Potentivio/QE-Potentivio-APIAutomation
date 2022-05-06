Feature: Login Cafe Owner

  Scenario: Successful POST login cafe owner
    When user send POST login cafe owner request to potentivio
    Then response status code should be 200
    And response structure should match json schema "login-cafe-owner.json" from "Login"


  @failedlogin @wrongpassword
  Scenario: Unsuccess POST login cafe owner using wrong password
    When user send POST wrong password login cafe owner request to potentivio
    Then response status code should be 400
    And response structure should match json schema "failed400-login-cafe-owner.json" from "Login"

  @failedlogin @wrongemail
  Scenario: Unsuccess POST login cafe owner using wrong email
    When user send POST wrong email login cafe owner request to potentivio
    Then response status code should be 400
    And response structure should match json schema "failed400-login-cafe-owner.json" from "Login"

  @failedlogin @emptypassword
  Scenario: Unsuccess POST login cafe owner without password
    When user send POST without password login cafe owner request to potentivio
    Then response status code should be 400
    And response structure should match json schema "failed400-login-cafe-owner.json" from "Login"

  @failedlogin @emptyemail
  Scenario: Unsuccess POST login cafe owner without email
    When user send POST without email login cafe owner request to potentivio
    Then response status code should be 400
    And response structure should match json schema "failed400-login-cafe-owner.json" from "Login"

  @failedlogin @emptyemail @emptypassword
  Scenario: Unsuccess POST login cafe owner without email and password
    When user send POST without email and password login cafe owner request to potentivio
    Then response status code should be 400
    And response structure should match json schema "failed400-login-cafe-owner.json" from "Login"

  @failedlogin @unregisteredaccount
  Scenario: Unsuccess POST login cafe owner with unregistered account
    When user send POST with unregistered account login cafe owner request to potentivio
    Then response status code should be 400
    And response structure should match json schema "failed400-login-cafe-owner.json" from "Login"
