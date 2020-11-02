package com.candysrouse.Model;

public class detalleCompraModel {


    int idDetalleCompra;
    int idCompra;
    int idMateriaPrima;
    int cantidad;

    public detalleCompraModel(int idDetalleCompra, int idCompra, int idMateriaPrima, int cantidad) {
        this.idDetalleCompra = idDetalleCompra;
        this.idCompra = idCompra;
        this.idMateriaPrima = idMateriaPrima;
        this.cantidad = cantidad;
    }

    public detalleCompraModel() {
    }

    public int getIdDetalleCompra() {
        return this.idDetalleCompra;
    }

    public void setIdDetalleCompra(int idDetalleCompra) {
        this.idDetalleCompra = idDetalleCompra;
    }

    public int getIdCompra() {
        return this.idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public int getIdMateriaPrima() {
        return this.idMateriaPrima;
    }

    public void setIdMateriaPrima(int idMateriaPrima) {
        this.idMateriaPrima = idMateriaPrima;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}
