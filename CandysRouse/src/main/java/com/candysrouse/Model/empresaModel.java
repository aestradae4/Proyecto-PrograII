package com.candysrouse.Model;

public class empresaModel {

    int idEmpresa;
    int nitEmpresa;
    int telefonoEmpresa;
    String direccionEmpresa;
    int idDatosGenerales;

    public empresaModel(int idEmpresa, int nitEmpresa, int telefonoEmpresa, String direccionEmpresa, int idDatosGenerales) {
        this.idEmpresa = idEmpresa;
        this.nitEmpresa = nitEmpresa;
        this.telefonoEmpresa = telefonoEmpresa;
        this.direccionEmpresa = direccionEmpresa;
        this.idDatosGenerales = idDatosGenerales;
    }

    public empresaModel() {
    }

    public int getIdEmpresa() {
        return this.idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public int getNitEmpresa() {
        return this.nitEmpresa;
    }

    public void setNitEmpresa(int nitEmpresa) {
        this.nitEmpresa = nitEmpresa;
    }

    public int getTelefonoEmpresa() {
        return this.telefonoEmpresa;
    }

    public void setTelefonoEmpresa(int telefonoEmpresa) {
        this.telefonoEmpresa = telefonoEmpresa;
    }

    public String getDireccionEmpresa() {
        return this.direccionEmpresa;
    }

    public void setDireccionEmpresa(String direccionEmpresa) {
        this.direccionEmpresa = direccionEmpresa;
    }

    public int getIdDatosGenerales() {
        return this.idDatosGenerales;
    }

    public void setIdDatosGenerales(int idDatosGenerales) {
        this.idDatosGenerales = idDatosGenerales;
    }

    
}
