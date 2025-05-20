#language:es
  #author:Sebastian Pinzon

Característica: Crear un certificado en la página de gestión de certificados del sistema Fusdec
  Como usuario con rol administrador
  Quiero registrar un nuevo certificado desde la página de gestión de certificados


  @crearcertficados
  Escenario: Verificar el registro exitoso de un nuevo certificado
    Dado que el usuario se encuentra autenticado en el sistema
    Cuando este en la pagina de certificados y seleccione correctamente todos los campo
    Entonces se debe verificar que el certificado se cree correctamente