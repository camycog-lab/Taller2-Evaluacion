Feature: Autenticación de Usuarios

  Scenario Outline: Validar ingreso con distintos usuarios
    Given que el usuario esta en la pagina de login
    When ingresa el usuario "<usuario>" y la clave "<clave>"
    Then el sistema muestra el mensaje "<mensaje>"

    Examples:
      | usuario | clave | mensaje          |
      | admin   | 1234  | Acceso Exitoso   |
      | pepe    | 0000  | Clave Incorrecta |