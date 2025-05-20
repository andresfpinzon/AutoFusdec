#language:es
  #author:JohnRondon

  @dado("que el usuario cree un nuevo certificado")
    public void queElUsuarioCreeUnNuevoCertificado() {
        // Implementación del paso para crear un nuevo certificado
        // Aquí puedes agregar el código necesario para crear el certificado
        System.out.println("Creando un nuevo certificado...");
    }
    @cuando("el usuario lo envía")
    public void elUsuarioLoEnvía() {
        // Implementación del paso para enviar el certificado
        // Aquí puedes agregar el código necesario para enviar el certificado
        System.out.println("Enviando el certificado...");
    }
    @entonces("el sistema debe mostrar un mensaje de éxito")
    public void elSistemaDebeMostrarUnMensajeDeÉxito() {
        // Implementación del paso para verificar el mensaje de éxito
        // Aquí puedes agregar el código necesario para verificar el mensaje
        System.out.println("El certificado se ha enviado con éxito.");
    }
  }