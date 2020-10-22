package com.candysrouse.Model;

public class detalleTipoRolModel {

    private int idTipoRol;
    private boolean acceso;
    private boolean lectura;
    private boolean actualizacion;
    private boolean eliminacion;

    public detalleTipoRolModel(int idTipoRol, boolean acceso, boolean lectura, boolean actualizacion, boolean eliminacion) {
        this.idTipoRol = idTipoRol;
        this.acceso = acceso;
        this.lectura = lectura;
        this.actualizacion = actualizacion;
        this.eliminacion = eliminacion;
    }

    public detalleTipoRolModel() {

    }

    public int getIdTipoRol() {
        return this.idTipoRol;
    }

    public void setIdTipoRol(int idTipoRol) {
        this.idTipoRol = idTipoRol;
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
