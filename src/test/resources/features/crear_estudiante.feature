#language:es
  #author:AndresPinzon

Característica: Crear un estudiante en la página de gestión de estudiantes del sistema Fusdec
  Como usuario con rol secretario
  Quiero registrar un nuevo estudiante desde la página de gestión de estudiantes
  Para poder visualizarlo correctamente en la lista de estudiantes.


  @crearestudiante
  Escenario: Verificar el registro exitoso de un nuevo estudiante
    Dado que el usuario se encuentra autenticado
    Cuando este en la pagina de estudiantes diligendiar correctamente el formulario:
      |numero_documento  | nombre | apellido | tipo_de_documento | genero | unidad |colegio  | edicion | grado |
      |<numero_documento>|<nombre>|<apellido>|<tipo_de_documento>|<genero>|<unidad>|<colegio>|<edicion>|<grado>|
    Entonces se debe verificar que el estudiante se cree correctamente y se agregue a la lista de estudiantes.
    Ejemplo
    |numero_documento| nombre | apellido | tipo_de_documento | genero  | unidad|colegio| edicion | grado|
    |1030666555      |andres  |pinzon    |c.c                |masculino|1      |2      |3        |9°    |