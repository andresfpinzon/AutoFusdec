#language:es
  #author:Santiago Gonzalez Fontecha

Característica: Crear una edicion en la página de gestión de ediciones del sistema Fusdec
  Como usuario con rol administrador
  Quiero registrar una nueva edicion desde la página de gestión de ediciones
  Para poder visualizarlo correctamente en la lista de ediciones.

  Antecedentes:
    Dado que el usuario se encuentra en la pagina de inicio de sesion de Fusdec
    Cuando ingrese las credenciales correctas (correo y contrasena)
      |      correo      |      password        |
      | Fusdec@gmail.com | C0ntras3naFusd3cCE   |

  @crearedicion

  Esquema del escenario: Verificar el registro exitoso de una nueva edicion
    Cuando este en la pagina de ediciones diligenciar correctamente el formulario y dar clic a crear edicion:
      | titulo   | fechaI   | fechaF   |
      | <titulo> | <fechaI> | <fechaF> |
    Entonces se debe verificar que la edicion se cree correctamente y se agregue a la lista de ediciones.
  Ejemplos:
    | titulo | fechaI     | fechaF     |
    | 2025   | 23/05/2025 | 30/05/2025 |