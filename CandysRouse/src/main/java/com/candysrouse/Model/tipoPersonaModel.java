package com.candysrouse.Model;

public class tipoPersonaModel {

    int idTipoPersona;
    String nombreTipoPersona;

    public tipoPersonaModel(int idTipoPersona, String nombreTipoPersona) {
        this.idTipoPersona = idTipoPersona; 
        this.nombreTipoPersona = nombreTipoPersona;
    }

    public tipoPersonaModel() {

    }

    public String getNombreTipoPersona() {
        return this.nombreTipoPersona;
    }

    public void setNombreTipoPersona(String nombreTipoPersona) {
        this.nombreTipoPersona = nombreTipoPersona;
    }

    public int getIdTipoPersona() {
        return this.idTipoPersona;
    }

    public void setIdTipoPersona(int idTipoPersona) {
        this.idTipoPersona = idTipoPersona;
    }

}
