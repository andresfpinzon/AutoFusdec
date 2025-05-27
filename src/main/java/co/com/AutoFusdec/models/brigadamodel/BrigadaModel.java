package co.com.AutoFusdec.models.brigadamodel;

public class BrigadaModel {
    private String nombreBrigada;
    private String ubicacionBrigada;

    public BrigadaModel(String nombreBrigada, String ubicacionBrigada) {
        this.nombreBrigada = nombreBrigada;
        this.ubicacionBrigada = ubicacionBrigada;
    }

    public String getNombreBrigada() {
        return nombreBrigada;
    }

    public void setNombreBrigada(String nombreBrigada) {
        this.nombreBrigada = nombreBrigada;
    }

    public String getUbicacionBrigada() {
        return ubicacionBrigada;
    }

    public void setUbicacionBrigada(String ubicacionBrigada) {
        this.ubicacionBrigada = ubicacionBrigada;
    }


}
