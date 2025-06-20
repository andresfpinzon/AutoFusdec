#language:es
  #author: Adriana Lucia Cardenas Galeano

  Característica: Crear un colegio en la pagina de gestion de cursos en el sistema de Fusdec
  Como usuario con rol adiministrador
  Quiero registrar un nuevo colegio desde la pagina de gestion de colegios
  Para poder visualizarlo en la lista de colegios.

  Antecedentes:
    Dado que el usuario se encuentra en la pagina de inicio de sesion de Fusdec
    Cuando ingrese las credenciales correctas (correo y contrasena)
    |       correo       |   password            |
    |  Fusdec@gmail.com | C0ntras3naFusd3cCE  |


    @crearcolegio
    Esquema del escenario: verificar la creacion correcta de un nuevo colegio

      Cuando este en la pagina de collegio diligenciar el formulario:
      |     nombre         |    email  |
      |    <nombre>        |   <email> |

      Entonces se debe verificar que el colegio se cree de manera correcta y se agregue en la lista de colegios.

      Ejemplos:
       |       nombre         |      email           |
       |  luis carlos galan   | luiscarlos@gmail.com |


