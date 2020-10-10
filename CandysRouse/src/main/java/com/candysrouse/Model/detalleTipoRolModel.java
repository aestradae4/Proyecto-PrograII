package com.candysrouse.Model;

public class detalleTipoRolModel {
    private int idTipoRol; 
    private boolean acceso = true;
    private boolean lectura = true;
    private boolean actualizacion = true;
    private boolean eliminacion = true;
    private modulosModel moduloModel; 
    private tipoRolModel tipoRol; 

    public detalleTipoRolModel(int idTipoRol, boolean acceso, boolean lectura, boolean actualizacion, boolean eliminacion, modulosModel moduloModel, tipoRolModel tipoRol) {
        this.idTipoRol = idTipoRol; 
        this.acceso = acceso;
        this.lectura = lectura;
        this.actualizacion = actualizacion;
        this.eliminacion = eliminacion;
    }

    public int getIdTipoRol() {
        return idTipoRol;
    }

    public void setIdTipoRol(int idTipoRol) {
        this.idTipoRol = idTipoRol;
    }

    public boolean isAcceso() {
        return acceso;
    }

    public void setAcceso(boolean acceso) {
        this.acceso = acceso;
    }

    public boolean isLectura() {
        return lectura;
    }

    public void setLectura(boolean lectura) {
        this.lectura = lectura;
    }

    public boolean isActualizacion() {
        return actualizacion;
    }

    public void setActualizacion(boolean actualizacion) {
        this.actualizacion = actualizacion;
    }

    public boolean isEliminacion() {
        return eliminacion;
    }

    public void setEliminacion(boolean eliminacion) {
        this.eliminacion = eliminacion;
    }

    public modulosModel getModuloModel() {
        return moduloModel;
    }

    public void setModuloModel(modulosModel moduloModel) {
        this.moduloModel = moduloModel;
    }

    public tipoRolModel getTipoRol() {
        return tipoRol;
    }

    public void setTipoRol(tipoRolModel tipoRol) {
        this.tipoRol = tipoRol;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("detalleTipoRolModel{idTipoRol=").append(idTipoRol);
        sb.append(", acceso=").append(acceso);
        sb.append(", lectura=").append(lectura);
        sb.append(", actualizacion=").append(actualizacion);
        sb.append(", eliminacion=").append(eliminacion);
        sb.append(", moduloModel=").append(moduloModel);
        sb.append(", tipoRol=").append(tipoRol);
        sb.append('}');
        return sb.toString();
    }
    

}
