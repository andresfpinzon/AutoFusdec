#language:es
  #author:Santiago Gonzalez Fontecha

Característica: Crear un usuario en la página de gestión de usuarios del sistema Fusdec
  Como usuario con rol administrador
  Quiero registrar un nuevo usuario desde la página de gestión de usuarios
  Para poder visualizarlo correctamente en la lista de usuarios.

  Antecedentes:
    Dado que el usuario se encuentra en la pagina de inicio de sesion de Fusdec
    Cuando ingrese las credenciales correctas (correo y contrasena)
      |      correo      |      password        |
      | Fusdec@gmail.com | C0ntras3naFusd3cCE   |

  @crearusuario

  Esquema del escenario: Verificar el registro exitoso de un nuevo usuario
    Cuando este en la pagina de usuarios diligenciar correctamente el formulario y dar clic a crear usuario:
      |  numeroDocumento  |  nombre  |  apellido  |  correo  |  password  |
      | <numeroDocumento> | <nombre> | <apellido> | <correo> | <password> |
    Entonces se debe verificar que el usuario se cree correctamente y se agregue a la lista de usuarios.
  Ejemplos:
  | numeroDocumento | nombre |apellido |      correo      |  password  |
  |   1030666555    | andres | pinzon  | Andres@gmail.com | Andres123 |