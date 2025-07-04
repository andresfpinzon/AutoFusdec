#language:es
  #author: Julian Rivera

Característica: Crear un Brigada en la página de gestión de brigadas del sistema Fusdec
  Como usuario
  Quiero registrar una Brigada desde la página de gestión de brigadas

  Antecedentes:
    Dado que el usuario se encuentra en la pagina de inicio de sesion de Fusdec
    Cuando ingrese las credenciales correctas (correo y contrasena)
      | correo           | password             |
      | Fusdec@gmail.com | C0ntras3naFusd3cCE   |

    @crearbrigada
    Esquema del escenario: Crear una brigada
      Cuando estoy en la página de gestión de brigadas dar click en agregar, llenar campos y confirmar
      | nombreBrigada | ubicacionBrigada |
      |<nombreBrigada>|<ubicacionBrigada>|
      Entonces se debe verificar que la brigada se creo correctamente ingresando en el buscador el nombre de la brigada
      Ejemplos:
        | nombreBrigada|ubicacionBrigada|
        |brigada |https://maps.app.goo.gl/NLQe3jj8YHQHdDUd8|