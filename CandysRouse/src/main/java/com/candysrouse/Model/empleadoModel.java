package com.candysrouse.Model;

public class empleadoModel {

     int idEmpleado;
     String usuario;
     String pass;
     float sueldo;
     String tipoDeContrato;
     int idDatosGenerales;
     int idTipoRol;
     
   

    public empleadoModel(int idEmpleado, String usuario, String pass, float sueldo, String tipoDeContrato, int idDatosGenerales, int idTipoRol) {
        this.idEmpleado = idEmpleado;
        this.usuario = usuario;
        this.pass = pass;
        this.sueldo = sueldo;
        this.tipoDeContrato = tipoDeContrato;
        this.idDatosGenerales = idDatosGenerales;
        this.idTipoRol = idTipoRol;
    }

    public empleadoModel() {
    }

    public int getIdEmpleado() {
        return this.idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getUsuario() {
        return this.usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPass() {
        return this.pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public float getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public String getTipoDeContrato() {
        return this.tipoDeContrato;
    }

    public void setTipoDeContrato(String tipoDeContrato) {
        this.tipoDeContrato = tipoDeContrato;
    }

    public int getIdDatosGenerales() {
        return this.idDatosGenerales;
    }

    public void setIdDatosGenerales(int idDatosGenerales) {
        this.idDatosGenerales = idDatosGenerales;
    }

    public int getIdTipoRol() {
        return this.idTipoRol;
    }

    public void setIdTipoRol(int idTipoRol) {
        this.idTipoRol = idTipoRol;
    }
    
    

}
