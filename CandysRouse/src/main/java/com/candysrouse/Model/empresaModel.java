package com.candysrouse.Model;

public class empresaModel {

    private int idEmpresa;
    private int nitEmpresa;
    private int telefonoEmpresa;
    private String direccionEmpresa;
    private int idDatosGenerales;

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
        return telefonoEmpresa;
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

    public void setidDatosGenerales(int idDatosGenerales) {
        this.idDatosGenerales = idDatosGenerales;
    }

    public int getidDatosGerenales() {
        return this.idDatosGenerales;
    }
}
