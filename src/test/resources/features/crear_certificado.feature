#language:es
#author:Sebastian Pinzon

Característica: Crear un certificado en la página de gestión de certificados del sistema Fusdec
  Como usuario con rol administrador
  Quiero registrar un nuevo certificado desde la página de gestión de certificados

  @crearcertficados
  Escenario: Verificar el registro exitoso de un nuevo certificado
    Dado que el usuario se encuentra autenticado en el sistema con los siguientes datos:
      | correo              | password    |
      | admin@fusdec.com    | password123 |
    Cuando este en la pagina de certificados y seleccione correctamente todos los campos:
      | estudianteId | horasCompletadas | fechaEmision |
      | Juan Perez   | 80 Horas         | 2023-10-01   |
    Entonces se debe verificar que el certificado se cree correctamente