#language:es
  #author:Santiago Gonzalez Fontecha

Característica: Crear un usuario en la página de gestión de usuarios del sistema Fusdec
  Como usuario con rol administrador
  Quiero registrar un nuevo usuario desde la página de gestión de usuarios
  Para poder visualizarlo correctamente en la lista de usuarios.

  @crearusuario

  Esquema del escenario: Verificar el registro exitoso de un nuevo usuario
    Dado que el usuario se encuentra autenticado
    Cuando este en la pagina de usuarios diligenciar correctamente el formulario y dar clic a crear usuario:
      | numeroDocumento | nombre |apellido | correo |pasword | roles |
      | <numeroDocumento> | <nombre> | <apellido> | <correo> | <pasword> | <roles> |
    Entonces se debe verificar que el usuario se cree correctamente y se agregue a la lista de usuarios.
  Ejemplos:
  | numeroDocumento | nombre |apellido | correo |pasword | roles |
  | 1030666555 | andres | pinzon | Andres@gmail.com | Andres123 | secretario |