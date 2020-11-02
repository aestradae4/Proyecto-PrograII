package com.candysrouse.Model;

public class comprasModel {

    int idCompra;
    String fecha;
    int idFormaPago;
    int idProveedor;

    public comprasModel(int idCompra, String fecha, int idFormaPago, int idProveedor) {
        this.idCompra = idCompra;
        this.fecha = fecha;
        this.idFormaPago = idFormaPago;
        this.idProveedor = idProveedor;
    }

    public comprasModel() {
    }

    public int getIdCompra() {
        return this.idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
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

    public int getIdProveedor() {
        return this.idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

       
}
