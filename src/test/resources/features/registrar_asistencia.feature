#language:es
  #author:JulianRivera

Característica: Registrar asistencia de estudiantes
Como usuario con rol "INSTRUCTOR"
Quiero registrar la asistencia de un estudiante desde la página de gestión de asistencias
Para confirmar que el estudiante ha asistido a clase



@registrar-asistencia
Esquema del escenario: Confirmar asistencia marcando un checkbox
Dado que el usuario se encuentra autenticado
Cuando estoy en la página de gestión de asistencias busco al estudiante con número de documento
  | campo         | valor   |
  |numeroDocumento|<numeroDocumento>|
Entonces marco el checkbox de asistencia del estudiante guardo los cambios debo ver un mensaje de confirmación "Asistencia registrada correctamente
  Ejemplos:
    | numeroDocumento |
    | 2000005 |