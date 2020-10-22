package com.candysrouse.Model;

public class tipoRolModel {

    int idTipoRol;
    String descripcionPuesto;

    public tipoRolModel(int idTipoRol, String descripcionPuesto) {
        this.idTipoRol = idTipoRol; 
        this.descripcionPuesto = descripcionPuesto;
    }

    public tipoRolModel() {

    }
    
    public int getIdTipoRol(){ 
        return this.idTipoRol; 
    }
    
    public void setIdTipoRol(int idTipoRol) {
        this.idTipoRol = idTipoRol;
    }

    
    public String getDescripcionPuesto() {
        return this.descripcionPuesto;
    }

    public void setDescripcionPuesto(String descripcionPuesto) {
        this.descripcionPuesto = descripcionPuesto;
        
    }
    
}
