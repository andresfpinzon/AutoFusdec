#language:es
  #author:JulianRivera

Característica: Registrar asistencia de estudiantes
Como usuario con rol "INSTRUCTOR"
Quiero registrar la asistencia de un estudiante desde la página de gestión de asistencias
Para confirmar que el estudiante ha asistido a clase

  Antecedentes:
    Dado que el usuario se encuentra en la pagina de inicio de sesion de Fusdec
    Cuando ingrese las credenciales correctas (correo y contrasena)
      | correo           | password             |
      | Fusdec@gmail.com | C0ntras3naFusd3cCE   |

  @registrar-asistencia
  Escenario: Confirmar asistencia de un estudiante
  Cuando estoy en la página de gestión de asistencias busco al estudiante con número de documento "20000002"
  Entonces debo ver al estudiante con documento "20000002" en el historial de asistencia
