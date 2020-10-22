package com.candysrouse.Model;

public class proveedorModel {

    private int idProveedor;
    private int idEmpresa;
    private int diasCredito;
    private boolean credito;

    public proveedorModel() {

    }

    public proveedorModel(int idProveedor, int idEmpresa, int diasCredito, boolean credito) {
        this.idProveedor = idProveedor;
        this.idEmpresa = idEmpresa;
        this.diasCredito = diasCredito;
        this.credito = credito;
    }

    public int getidProveedor() {
        return this.idProveedor;
    }

    public void setidProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public int getidEmpresa() {
        return this.idEmpresa;
    }

    public void setidEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public int getdiasCredito() {
        return this.diasCredito;
    }

    public void setdiasCredito(int diasCredito) {
        this.diasCredito = diasCredito;
    }

    public int getcredito() {
        return this.diasCredito;
    }

    public void setcredito(int diasCredito) {
        this.diasCredito = diasCredito;
    }
}
