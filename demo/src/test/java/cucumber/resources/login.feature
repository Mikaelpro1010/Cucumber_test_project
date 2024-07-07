Feature: login
    Scenario: Login com sucesso
    Given User is on Homepage
    And User clicks on the login button
    When User enters a name on username field
    And User enters an password on password field
    Then User should be redirectioned to Secure Area page