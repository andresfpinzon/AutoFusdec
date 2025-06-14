#language:es
  #author: Julian Rivera

Característica: Crear una Unidad en la página de unidades del sistema Fusdec
  Como usuario
  Quiero registrar una Unidad desde la página de gestion de unidades

  Antecedentes:
    Dado que el usuario se encuentra en la pagina de inicio de sesion de Fusdec
    Cuando ingrese las credenciales correctas (correo y contrasena)
      | correo           | password             |
      | Fusdec@gmail.com | C0ntras3naFusd3cCE   |

    @crearunidad
    Esquema del escenario: Crear una nueva unidad
      Cuando estoy en la página de gestión de Unidades dar click en agregar, completar campos y confirmar
      | unidad |
      |<unidad>|
      Entonces se debe verificar que la unidad se cree correctamente
      Ejemplos:
        | unidad |
        |unidad|