package com.candysrouse.Model;

public class modulosModel {

    private int idModulo;
    private String nombre;

    public modulosModel(int idModulo, String nombre) {
        this.nombre = nombre;
    }

    public modulosModel() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdModulo() {
        return idModulo;
    }

    public void setIdModulo(int idModulo) {
        this.idModulo = idModulo;
    }

}
