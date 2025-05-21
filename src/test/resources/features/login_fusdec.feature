#language:es
  #author:JulianRivera

Característica: : Autenticacion en la pagina de Fusdec
  Como usuario de Fusdec
  Quiero autenticarme en el portal de Fusdec
  Para poder acceder al contenido y funcionalidades disponibles en mi cuenta.

  @autenticacion
  Escenario: Verificar la autenticacion exitosa en la pagina de Fusdec
    Dado que el usuario se encuentra en la pagina de inicio de sesion de Fusdec
    Cuando ingrese las credenciales correctas (correo y contrasena)
      | correo           | password             |
      | Fusdec@gmail.com | C0ntras3naFusd3cCE   |
    Entonces se debe verificar que el usuario haya sido autenticado correctamente y redirigido a la pagina de inicio de Fusdec