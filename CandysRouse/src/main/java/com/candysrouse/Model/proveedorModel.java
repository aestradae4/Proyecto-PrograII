<<<<<<< HEAD
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

    public boolean isCredito() {
        return this.credito;
    }

    public void setCredito(boolean credito) {
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

  

}
