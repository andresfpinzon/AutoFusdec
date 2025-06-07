#language:es
  #author:Santiago Gonzalez Fontecha

Característica: Crear un curso en la página de gestión de cursos del sistema Fusdec
  Como usuario con rol administrador
  Quiero registrar un nuevo curso desde la página de gestión de cursos
  Para poder visualizarlo correctamente en la lista de cursos.

  Antecedentes:
    Dado que el usuario se encuentra en la pagina de inicio de sesion de Fusdec
    Cuando ingrese las credenciales correctas (correo y contrasena)
      |      correo      |      password        |
      | Fusdec@gmail.com | C0ntras3naFusd3cCE   |

  @crearusuario

  Esquema del escenario: Verificar el registro exitoso de un nuevo curso
    Cuando este en la pagina de cursos diligenciar correctamente el formulario y dar clic a crear curso:
      |  nombre  |  descripcion  |  intensidadHoraria  |
      | <nombre> | <descripcion> | <intensidadHoraria> |
    Entonces se debe verificar que el usuario se cree correctamente y se agregue a la lista de usuarios.
  Ejemplos:
    | nombre      | descripcion           | intensidadHoraria |
    | cursoprueba | descripcion de prueba | 120 horas         |