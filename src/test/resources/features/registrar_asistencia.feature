#language:es
  #author:JulianRivera

Característica: Registrar asistencia de estudiantes
Como usuario con rol "INSTRUCTOR"
Quiero registrar la asistencia de un estudiante desde la página de gestión de asistencias
Para confirmar que el estudiante ha asistido a clase

@registrar-asistencia
Escenario: Registrar asistencia marcando un checkbox
Dado que estoy autenticado como instructor
Y estoy en la página de gestión de asistencias
Cuando busco al estudiante con número de documento
  | numeroDocumento |
  |<numeroDocumento>|
Y marco el checkbox de asistencia del estudiante
Y guardo los cambios
Entonces debo ver un mensaje de confirmación "Asistencia registrada correctamente"