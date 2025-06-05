# language: es
# author: Sebastian Pinzon

Característica: Visualizar la auditoría de un certificado en la página de gestión de auditoría
  Como usuario con rol administrador
  Quiero visualizar la última auditoría de un certificado

  Antecedentes:
    Dado que el usuario se encuentra en la pagina de inicio de sesion de Fusdec
    Cuando ingrese las credenciales correctas (correo y contrasena)
      | correo           | password             |
      | Fusdec@gmail.com | C0ntras3naFusd3cCE   |

  @visualizarauditoria
  Escenario: Visualizar la auditoría de un certificado
    Cuando esté en la página de auditorías y seleccione correctamente todos los campos
    Entonces visualizará los detalles de una la auditoría del certificados