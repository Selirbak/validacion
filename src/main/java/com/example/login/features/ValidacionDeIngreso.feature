#language es




Feature: Validar la funcionalidad de la pagina de ingreso de la app

  Scenario: 001 verificar el ingreso correcto a la aplicación
    Given Un usuario activo que cuenta con un correo electronico valido
    When ingresa el correo electronico y  contraseña validos en los campos correspondientes
    Then  el sistema me da ingreso a la aplicación mostrando aviso en color verde de operacion exitosa



  Scenario Outline: 003 verificar el ingreso incorrecto a la aplicación
    Given Un usuario activo que desea ingresar a la app
    When ingresa el correo electronico "<CORREO_VALIDAR>" y el password es "<PASS_VALIDAR>" en el campo correspondiente
    Then  el sistema no me da ingreso a la aplicación
    Examples:
      | CORREO_VALIDAR | PASS_VALIDAR |
      | VALIDO         | INVALIDO     |
      | INVALIDO       | VALIDO       |
      | INVALIDO       | INVALIDO     |




