
package com.candysrouse.Model;


public class proveedorModel {
    private int idProveedor; 
    private empresaModel empresa; 
    private boolean credito; 
    private int diasCredito;

    public proveedorModel(int idProveedor, empresaModel empresa, boolean credito, int diasCredito) {
        this.idProveedor = idProveedor;
        this.empresa = empresa;
        this.credito = credito;
        this.diasCredito = diasCredito;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public empresaModel getEmpresa() {
        return empresa;
    }

    public void setEmpresa(empresaModel empresa) {
        this.empresa = empresa;
    }

    public boolean isCredito() {
        return credito;
    }

    public void setCredito(boolean credito) {
        this.credito = credito;
    }

    public int getDiasCredito() {
        return diasCredito;
    }

    public void setDiasCredito(int diasCredito) {
        this.diasCredito = diasCredito;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("proveedorModel{idProveedor=").append(idProveedor);
        sb.append(", empresa=").append(empresa);
        sb.append(", credito=").append(credito);
        sb.append(", diasCredito=").append(diasCredito);
        sb.append('}');
        return sb.toString();
    }
    
    
}
