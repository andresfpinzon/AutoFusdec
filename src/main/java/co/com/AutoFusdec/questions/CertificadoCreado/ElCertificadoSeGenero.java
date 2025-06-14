package co.com.AutoFusdec.questions.CertificadoCreado;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;
import java.io.IOException;

import static jxl.biff.FormatRecord.logger;

public class ElCertificadoSeGenero implements Question<Boolean> {

    public static ElCertificadoSeGenero correctamente() {
        return new ElCertificadoSeGenero();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String nombreCertificado = actor.recall("nombre_certificado");
        logger.info(nombreCertificado);

        String rutaDescargas = System.getProperty("user.home") + "\\Downloads\\certificado_" + nombreCertificado + ".pdf";
        File archivo = new File(rutaDescargas);

        if (archivo.exists() && archivo.isFile()) {
            try (PDDocument documento = PDDocument.load(archivo)) {
                PDFTextStripper stripper = new PDFTextStripper();
                String contenido = stripper.getText(documento);
                logger.info("Contenido del certificado:\n" + contenido);

                String nombreNormalizado = nombreCertificado.replace("_", " ").toLowerCase();
                return contenido.toLowerCase().contains(nombreNormalizado);
            } catch (IOException e) {
                logger.error("Error al leer el PDF: ", e);
                return false;
            }
        } else {
            logger.warn("El archivo no existe en la ruta esperada: " + rutaDescargas);
        }

        return false;
    }
}


