Feature: Validar los caracteres en los campos de ingreso de la app

  Scenario Outline : 004 verificar que el campo e-mail reciba caracteres permitidos
    Given Un usuario activo que posee un correo electronico que tiene diferentes tipos de caracteres
    When ingresa el correo electronico con "<CARACTERES A VALIDAR>" y seleccione el boton login
    Then  el sistema no muestra error de e-mail en pantalla
    Examples:
      | CARACTERES A VALIDAR  |
      | Numeros               |
      | Caracteres especiales |
      | Upper Cases           |
      | Low Cases             |


  Scenario: 005 Verificar que en el campo contraseña no se acepten valores menores a 6 caracteres
    Given un usuario que quiere ingresar a la app
    When ingrese una contraseña con menos de 6 caracteres y seleccione el boton login
    Then el sistema muestra mensaje de error por contraseña menor a 6 caracteres


  Scenario: 006 Verificar que en el campo contraseña se acepten valores mayores o iguales a 6 caracteres
    Given un usuario que quiere ingresar a la app
    When ingresa la contraseña  igual o mayor a 6 caracteres y seleccione el boton login
    Then el sistema no muestra mensaje de error por contraseña

  Scenario Outline: 7 Verificar que cuando alguno de los dos campos este vacio se notifique al usuario
    Given un usuario que quiere ingresar a la app
    When  ingresa el correo electronico "<CORREO_VALIDAR>" y el password "<PASS_VALIDAR>" en el campo correspondiente
    Then el sistema muestra el mensaje de error de ingreso correspondiente al campo faltante
    Examples:
      | CORREO_VALIDAR | PASS_VALIDAR |
      | vacio          | con datos    |
      | con datos      | vacio        |
      | vacio          | vacio        |
