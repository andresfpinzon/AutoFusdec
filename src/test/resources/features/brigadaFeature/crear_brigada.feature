#language:es
  #author: Julian Rivera

Característica: Crear un certificado en la página de gestión de certificados del sistema Fusdec
  Como usuario
  Quiero registrar un nuevo certificado desde la página de gestión de certificados

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
      Entonces se debe verificar que el brigada se cree correctamente
      Ejemplos:
        | nombreBrigada|ubicacionBrigada|
        |<Brigada Doña Juana>|<https://maps.app.goo.gl/NLQe3jj8YHQHdDUd8>|