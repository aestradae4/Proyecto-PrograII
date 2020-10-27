package com.candysrouse.Model;

public class detalleTipoRolModel {
    //Variables de datos 
    int idDetalleTipoRol;
    int idTipoRol;
    int idModulo;
    boolean acceso;
    boolean lectura;
    boolean actualizacion;
    boolean eliminacion;
//Este es el contructor de TipoRol

    public detalleTipoRolModel() {
    }

    public detalleTipoRolModel(int idDetalleTipoRol, int idTipoRol, int idModulo, boolean acceso, boolean lectura, boolean actualizacion, boolean eliminacion) {
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

    public boolean isAcceso() {
        return this.acceso;
    }

    public void setAcceso(boolean acceso) {
        this.acceso = acceso;
    }

    public boolean isLectura() {
        return this.lectura;
    }

    public void setLectura(boolean lectura) {
        this.lectura = lectura;
    }

    public boolean isActualizacion() {
        return this.actualizacion;
    }

    public void setActualizacion(boolean actualizacion) {
        this.actualizacion = actualizacion;
    }

    public boolean isEliminacion() {
        return this.eliminacion;
    }

    public void setEliminacion(boolean eliminacion) {
        this.eliminacion = eliminacion;
    }
    
}
