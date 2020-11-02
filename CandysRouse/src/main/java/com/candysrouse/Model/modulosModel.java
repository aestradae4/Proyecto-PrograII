package com.candysrouse.Model;

public class modulosModel {
    //Declaración de atributos de Modulos
    int idModulo;
    String nombreModulo;

    public modulosModel() {
    }

    
    public modulosModel(int idModulo, String nombreModulo) {
        this.idModulo = idModulo;
        this.nombreModulo = nombreModulo;
    }

    public String getNombreModulo() {
        return nombreModulo;
    }

    public void setNombreModulo(String nombreModulo) {
        this.nombreModulo = nombreModulo;
    }

    public int getIdModulo() {
        return idModulo;
    }

    public void setIdModulo(int idModulo) {
        this.idModulo = idModulo;
    }


      
}
