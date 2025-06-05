package co.com.AutoFusdec.models.usogeneral;

import java.util.Random;

public class NumeroAleatorio {
    public static String generarNumeroAleatorio(){
        int numero = new Random().nextInt(10000);
        return String.valueOf(numero);
    }
}
