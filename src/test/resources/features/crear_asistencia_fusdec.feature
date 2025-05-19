#language:es
  #author:JulianRivera

Característica: Crear una asistencia en la página de gestión de asistencias
  Como usuario con rol "INSTRUCTOR"
  Quiero registrar la asistencia de un estudiante desde la página de gestión de asistencias
  Para poder confirmar la asistencia del estudiante que haya asistido.
  @autenticacion

  Escenario: Verificar la autenticacion exitosa en la pagina de Facebook
    Dado que el usuario se encuentra en la pagina de inicio de sesion de Facebook
    Cuando ingrese las credenciales correctas (usuario y contrasena)
      | usuarios | clave |
      | john     | 2345   |
    Entonces se debe verificar que el usuario haya sido autenticado correctamente y redirigido a su pagina de inicio de Facebook