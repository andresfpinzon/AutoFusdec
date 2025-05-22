#language:es
  #author:AndresPinzon

Característica: Crear un estudiante en la página de gestión de estudiantes del sistema Fusdec
  Como usuario con rol secretario
  Quiero registrar un nuevo estudiante desde la página de gestión de estudiantes
  Para poder visualizarlo correctamente en la lista de estudiantes.
  Antecedentes:
    Dado que el usuario se encuentra en la pagina de inicio de sesion de Fusdec
    Cuando ingrese las credenciales correctas (usuario y contrasena)
      | correo           | password             |
      | Fusdec@gmail.com | C0ntras3naFusd3cCE   |

  @crearestudiante
  Esquema del escenario: Verificar el registro exitoso de un nuevo estudiante
    Cuando este en la pagina de estudiantes diligendiar correctamente el formulario y dar clic a crear estudiante
      | numero_documento   | nombre   | apellido   | tipo_de_documento   | genero   | unidad   | colegio   | edicion   | grado   |
      | <numero_documento> | <nombre> | <apellido> | <tipo_de_documento> | <genero> | <unidad> | <colegio> | <edicion> | <grado> |
    Entonces se debe verificar que el estudiante se cree correctamente y se agregue a la lista de estudiantes.
    Ejemplos:
      | numero_documento | nombre | apellido | tipo_de_documento | genero    | unidad | colegio | edicion | grado |
      | 1030666555       | andres | pinzon   | C.C               | Masculino | 1      | 1       | 1       | 8°   |