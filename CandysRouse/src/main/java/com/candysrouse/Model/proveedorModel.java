package com.candysrouse.Model;

public class proveedorModel {

    int idProveedor;
    int idEmpresa;
    int diasCredito;
    int credito;

    public proveedorModel() {

    }

    public proveedorModel(int idProveedor, int idEmpresa, int diasCredito, int credito) {
        this.idProveedor = idProveedor;
        this.idEmpresa = idEmpresa;
        this.diasCredito = diasCredito;
        this.credito = credito;
    }

    public int getIdProveedor() {
        return this.idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public int getIdEmpresa() {
        return this.idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public int getDiasCredito() {
        return this.diasCredito;
    }

    public void setDiasCredito(int diasCredito) {
        this.diasCredito = diasCredito;
    }

    public int getCredito() {
        return this.credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }



}
