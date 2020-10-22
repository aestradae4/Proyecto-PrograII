package com.candysrouse.Model;

public class tipoPersonaModel {

    private int idTipoPersona;
    private String nombre;

    public tipoPersonaModel(int idTipoPersona, String nombre) {
        this.nombre = nombre;
    }

    public tipoPersonaModel() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdTipoPersona() {
        return idTipoPersona;
    }

    public void setIdTipoPersona(int idTipoPersona) {
        this.idTipoPersona = idTipoPersona;
    }
}
