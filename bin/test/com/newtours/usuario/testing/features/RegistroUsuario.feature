Feature: Registrar usuario

  Scenario: Registro exitoso
    Given I am in registry page
    When I insert data
      | firstName | lastName | phone      | mail                   | address     | city   | state        | postalCode | userName            | password            | passwordConfirm     |
      | Jenny     | Barbosa  | 3189347676 | alejandra5@pruebas.com | calle 56 76 | Bogota | Cundinamarca |     111031 | alejandra.serenity5 | alejandra.serenity5 | alejandra.serenity5 |
    Then I validate "Thank you for registering" message
