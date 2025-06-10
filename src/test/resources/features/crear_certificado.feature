#language:es
#author:Sebastian Pinzon

Característica: Crear un certificado en la página de gestión de certificados del sistema Fusdec
  Como usuario con rol administrador
  Quiero registrar un nuevo certificado desde la página de gestión de certificados

  Antecedentes:
    Dado que el usuario se encuentra en la pagina de inicio de sesion de Fusdec
    Cuando ingrese las credenciales correctas (correo y contrasena)
      | correo           | password             |
      | Fusdec@gmail.com | C0ntras3naFusd3cCE   |

  @crearcertficados
  Escenario: Verificar el registro exitoso de un nuevo certificado
    Cuando este en la pagina de certificados y seleccione correctamente todos los campos:
      | estudianteId         | horasCompletadas | fechaEmision |
      | ana lopez - 20000001 | 80 Horas         | 30/05/2025   |
    Entonces se debe verificar que el certificado se cree correctamente