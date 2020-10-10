package com.candysrouse.Model;

public class tipoRolModel {
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
    }

    public void setIdTipoRol(int idTipoRol) {
        this.idTipoRol = idTipoRol;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("tipoRolModel{idTipoRol=").append(idTipoRol);
        sb.append(", descripcionPuesto=").append(descripcionPuesto);
        sb.append('}');
        return sb.toString();
    }
    
}
