#language:es
  #author:Adriana Càrdenas

Característica: validar el ingreso al sistema con credenciales validas
  Como usuario ya creaado con su respectivo rol
  Quiero ingresar al sistema con credenciales validas
  Para poder realizar diferentes obligaciones desde el perfil.


  @autenticarFusdec

  Escenario: Verificar que el usuario se loguee de manera exitosa en la pàgina de Fusdec
    Dado que el usuario ya creado se encuentre en la pagina de incio de sesion
    Cuando llene correctamente las credenciales:
      |  correo  |  password  |
      | Fusdec@gmail.com | C0ntras3naFusd3cCE |
    Entonces se debe verificar que el usuario se loguee correctamente y sea dirigido a la página de inicio de Fusdec














