#Author: your.email@your.domain.com
@Regresion
Feature: Formulario Popup Validation
  El usuario debe poder ingresar al formulario los datos requeridos
  cada campo del formulario realiza validaciones de obligatoriedad
  Longitud y formato, el sistema debe presentar las validaciones respectivas
  paraa cada campo a travez de un globo informativo.

  @CasoExitoso
  Scenario: Diligenciamiento exitoso del formulario  PopupValidation, no se presenta ningun mensaje
    Given Autentico en colorlib  con usuario "demo" y clave "demo"
    And Ingreso a la funcionalidad  forms validation
    When Diligencio formulario Popup validation
      | Required | Select | MultipleS1 | MultipleS2 | Url                   | Email            | Password1 | Password2 | MinSize | MaxSize | Number | Ip          | Date       | DateEarlier |
      | Valor1   | Golf   | Tennis     | Golf       | http://www.valor1.com | valor1@gmail.com | valor1    | valor1    |  123456 |  123456 | -99.99 | 200.200.5.4 | 2018-01-22 | 2012/09/12  |
    Then Verifico ingreso exitoso

  @CasoAlterno
  Scenario: Diligenciamiento con errores del formulario Popup Validation
    Se presenta Globo informativo indicando error en el diligenciamiento de alguno de los campos

    Given Autentico en colorlib  con usuario "demo" y clave "demo"
    And Ingreso a la funcionalidad  forms validation
    When Diligencio formulario Popup validation
      | Required | Select | MultipleS1 | MultipleS2 | Url                   | Email            | Password1 | Password2 | MinSize | MaxSize | Number | Ip          | Date       | DateEarlier |
      |          | Golf   | Tennis     | Golf       | http://www.valor1.com | valor1@gmail.com | valor1    | valor1    |  123456 |  123456 | -99.99 | 200.200.5.4 | 2018-01-22 | 2012/09/12  |
    Then Verifico que se presente Globo Informativo de validacion

  @Reto
  Scenario: Diligenciamiento formulario block Validation
    Given Autentico en colorlib  con usuario "demo" y clave "demo"
    And Ingresar a Funcionalidad Block Validation
    When Diligenciar Formulario Block Validation
      | Required | Email            | Password | Confirmpassword | Date      | Url                   | DigitsOnly | Range |
      | Valor    | valor1@gmail.com | Tennis   | Tennis          | 8-12-2018 | http://www.valor1.com |    1234567 |     1 |
    Then Verificar Respuesta Exitosa Fallida

  @RetoAlterno
  Scenario: Diligenciamiento formulario block Validation
    Given Autentico en colorlib  con usuario "demo" y clave "demo"
    And Ingresar a Funcionalidad Block Validation
    When Diligenciar Formulario Block Validation
      | Required | Email            | Password | Confirmpassword | Date      | Url                   | DigitsOnly | Range |
      | Valor    | valor1@gmail.com | Tennis   | Tennis          | 8-12-2018 | http://www.valor1.com |            |     1 |
    Then Verificar Respuesta Exitosa Fallida

  @Reto2
  Scenario: Diligenciamiento formulario Inline Validation
    Given Autentico en colorlib  con usuario "demo" y clave "demo"
    And  Ingresar a Funcionalidad Inline Validation
    When Diligenciar Formulario Inline Validation
   | Required | Email            | Password | Confirmpassword | Date      | Url                   | Minimum3Chars |Maximum6Chars|Minimum3 |Maximum16|
   | Valor    | valor1@gmail.com | Tennis   | Tennis          | 8-12-2018 | http://www.valor1.com | 1234          |123456       |123      |12 |
   Then Verificar Respuesta Exitosa o Fallida
   
    @RetoAlterno2
  Scenario: Diligenciamiento formulario Inline Validation
    Given Autentico en colorlib  con usuario "demo" y clave "demo"
    And  Ingresar a Funcionalidad Inline Validation
    When Diligenciar Formulario Inline Validation
   | Required | Email            | Password | Confirmpassword | Date      | Url                   | Minimum3Chars |Maximum6Chars|Minimum3 |Maximum16|
   | Valor    | valor1@gmail.com | Tennis   |           | 8-12-2018 | http://www.valor1.com | 1234          |123456       |123      |12 |
   Then Verificar Respuesta Exitosa o Fallida
