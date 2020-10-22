package com.candysrouse.Model;

public class comprasModel {

    private int idCompra;
    private int idProveedor;
    private String fecha;
    private int idFormaPago;

    public comprasModel() {
    }

    public comprasModel(int idCompra, int idProveedor, String fecha, int idFormaPago) {
        this.idCompra = idCompra;
        this.idProveedor = idProveedor;
        this.fecha = fecha;
        this.idFormaPago = idFormaPago;
    }

    public int getIdCompra() {
        return this.idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public int getIdProveedor() {
        return this.idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getFecha() {
        return this.fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getIdFormaPago() {
        return this.idFormaPago;
    }

    public void setIdFormaPago(int idFormaPago) {
        this.idFormaPago = idFormaPago;
    }

}
