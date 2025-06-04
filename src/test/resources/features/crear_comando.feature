#language:es
  #author:AndresPinzon

Característica: Crear un comando en la página de gestión de comandos del sistema Fusdec
  Como usuario con rol administrativo
  Quiero registrar un nuevo comando desde la página de gestión de comandos
  Para poder visualizarlo correctamente en la lista de comandos.

  Antecedentes:
    Dado que el usuario se encuentra en la pagina de inicio de sesion de Fusdec
    Cuando ingrese las credenciales correctas (correo y contrasena)
      | correo           | password             |
      | Fusdec@gmail.com | C0ntras3naFusd3cCE   |

  @crearcomando
  Esquema del escenario: Verificar el registro exitoso de un nuevo comando
    Cuando este en la pagina de comandos diligendiar correctamente el formulario y dar clic a crear comando
      | nombre_comando   | ubicacion   | fundacion   |
      | <nombre_comando> | <ubicacion> | <fundacion> |
    Entonces se debe verificar que el comando se cree correctamente y se agregue a la lista de comandos.

    Ejemplos:
      | nombre_comando    | ubicacion                                 | fundacion |
      | comando de prueba | https://maps.app.goo.gl/1fknWn1kLXxq9upH8 | Fusdec    |