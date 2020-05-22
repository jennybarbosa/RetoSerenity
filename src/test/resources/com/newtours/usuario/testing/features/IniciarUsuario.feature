Feature: Login

  Scenario: Succesful Login
    Given I am in home newtours
    When I enter my credentials
      | userName           | Password           |
      | alejandra.serenity | alejandra.serenity |
    Then I validate the "SING-OFF" text

  Scenario Outline: Failed Login
    Given I am in home newtours
    When I enter my wrong credentials
      | userName   | Password   |
      | <Username> | <Password> |
    Then I validate the "SING-ON" text confirm

    Examples: 
      | Username           | Password           |
      | alejandra.serenity |              12345 |
      | aleja              | alejandra.serenity |
      | aleja12            | al1234             |
