package com.candysrouse.Model;

public class detalleTipoRolModel {
    //Variables de datos 
    int idDetalleTipoRol;
    int idTipoRol;
    int idModulo;
    int acceso;
    int lectura;
    int actualizacion;
    int eliminacion;
//Este es el contructor de TipoRol

    public detalleTipoRolModel() {
    }

    public detalleTipoRolModel(int idDetalleTipoRol, int idTipoRol, int idModulo, int acceso, int lectura, int actualizacion, int eliminacion) {
        this.idDetalleTipoRol = idDetalleTipoRol;
        this.idTipoRol = idTipoRol;
        this.idModulo = idModulo;
        this.acceso = acceso;
        this.lectura = lectura;
        this.actualizacion = actualizacion;
        this.eliminacion = eliminacion;
    }

    public int getIdDetalleTipoRol() {
        return this.idDetalleTipoRol;
    }

    public void setIdDetalleTipoRol(int idDetalleTipoRol) {
        this.idDetalleTipoRol = idDetalleTipoRol;
    }

    public int getIdTipoRol() {
        return this.idTipoRol;
    }

    public void setIdTipoRol(int idTipoRol) {
        this.idTipoRol = idTipoRol;
    }

    public int getIdModulo() {
        return this.idModulo;
    }

    public void setIdModulo(int idModulo) {
        this.idModulo = idModulo;
    }

    public int getAcceso() {
        return this.acceso;
    }

    public void setAcceso(int acceso) {
        this.acceso = acceso;
    }

    public int getLectura() {
        return this.lectura;
    }

    public void setLectura(int lectura) {
        this.lectura = lectura;
    }

    public int getActualizacion() {
        return this.actualizacion;
    }

    public void setActualizacion(int actualizacion) {
        this.actualizacion = actualizacion;
    }

    public int getEliminacion() {
        return this.eliminacion;
    }

    public void setEliminacion(int eliminacion) {
        this.eliminacion = eliminacion;
    }
    
}
