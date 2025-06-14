package co.com.AutoFusdec.utils.hooks.useGeneral;

import java.util.Random;

public class NamesGenerater {
    private static final String VOCALES = "aeiou";
    private static final String CONSONANTES = "bcdfghjklmnpqrstvwxyz";
    private static final Random random = new Random();

    // Rangos
    private static final int MIN_LONGITUD = 3;
    private static final int MAX_LONGITUD = 10;

    /**
     * Generar un nombre aleatorio sin necesidad de ingresar parametros
     * @return Nombre generado aleatoriamente
     */
    public static String nameGenerate() {
        // Longitud aleatoria entre MIN y MAX
        int longitud = MIN_LONGITUD + random.nextInt(MAX_LONGITUD - MIN_LONGITUD + 1);
        StringBuilder nombre = new StringBuilder();
        boolean siguienteEsVocal = random.nextBoolean();

        for (int i = 0; i < longitud; i++) {
            if (siguienteEsVocal) {
                nombre.append(obtenerLetraAleatoria(VOCALES));
                // Mayor probabilidad de consonante después de vocal
                siguienteEsVocal = random.nextInt(4) == 0; // 25% probabilidad
            } else {
                nombre.append(obtenerLetraAleatoria(CONSONANTES));
                // Mayor probabilidad de vocal después de consonante
                siguienteEsVocal = random.nextInt(4) != 0; // 75% probabilidad
            }

            // Primera letra en mayúscula
            if (i == 0) {
                nombre.setCharAt(0, Character.toUpperCase(nombre.charAt(0)));
            }
        }

        return nombre.toString();
    }

    private static char obtenerLetraAleatoria(String letras) {
        return letras.charAt(random.nextInt(letras.length()));
    }
}
