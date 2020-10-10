package com.candysrouse.Model;

public class recetaModel {

    private int idReceta;
    private String nombreReceta;

    public recetaModel(int idReceta, String nombreReceta) {
        this.idReceta = idReceta;
        this.nombreReceta = nombreReceta;
    }

    public int getIdReceta() {
        return idReceta;
    }

    public void setIdReceta(int idReceta) {
        this.idReceta = idReceta;
    }

    public String getNombreReceta() {
        return nombreReceta;
    }

    public void setNombreReceta(String nombreReceta) {
        this.nombreReceta = nombreReceta;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("recetaModel{idReceta=").append(idReceta);
        sb.append(", nombreReceta=").append(nombreReceta);
        sb.append('}');
        return sb.toString();
    }

}
