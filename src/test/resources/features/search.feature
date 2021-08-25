@Regresion
Feature: Buscador en rappi

  @SmokeTest
  Scenario: Busqueda de restaurante en rappi
    Given Estoy en la pagina de inicio de rappi
    When Realizo la busqueda de restaurante en rappi // accion
    Then Deberian aparecer los resultados de la busqueda


  @SmokeTest
  Scenario: Busqueda de Drogueria en rappi
    Given Estoy en la pagina de inicio de rappi
    When Realizo la busqueda de Drogueria en rappi
    Then Deberian aparecer los resultados de la busqueda

