package com.candysrouse.Model;

public class tipoRolModel {
<<<<<<< HEAD

    int idTipoRol;
    String descripcionPuesto;

    public tipoRolModel(int idTipoRol, String descripcionPuesto) {
        this.idTipoRol = idTipoRol; 
        this.descripcionPuesto = descripcionPuesto;
    }

    public tipoRolModel() {

    }

    public int getIdTipoRol() {
        return this.idTipoRol;
=======
    private int idTipoRol; 
    private String descripcionPuesto; 

    public tipoRolModel(int idTipoRol, String descripcionPuesto) {
        this.descripcionPuesto = descripcionPuesto;
    }

    public String getDescripcionPuesto() {
        return descripcionPuesto;
    }

    public void setDescripcionPuesto(String descripcionPuesto) {
        this.descripcionPuesto = descripcionPuesto;
    }

    public int getIdTipoRol() {
        return idTipoRol;
>>>>>>> APIs
    }

    public void setIdTipoRol(int idTipoRol) {
        this.idTipoRol = idTipoRol;
    }
<<<<<<< HEAD
    
    public String getDescripcionPuesto() {
        return this.descripcionPuesto;
    }

    public void setDescripcionPuesto(String descripcionPuesto) {
        this.descripcionPuesto = descripcionPuesto;
    }

=======

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("tipoRolModel{idTipoRol=").append(idTipoRol);
        sb.append(", descripcionPuesto=").append(descripcionPuesto);
        sb.append('}');
        return sb.toString();
    }
    
>>>>>>> APIs
}
