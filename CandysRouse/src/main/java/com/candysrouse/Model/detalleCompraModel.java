package com.candysrouse.Model;

public class detalleCompraModel {


    int idDetalleCompra;
    int idMateriaPrima;
    int cantidad;

    public detalleCompraModel() {
    }

    public detalleCompraModel(int idDetalleCompra, int idMateriaPrima, int cantidad) {
        this.idDetalleCompra = idDetalleCompra;
        this.idMateriaPrima = idMateriaPrima;
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getIdDetalleCompra() {
        return idDetalleCompra;
    }

    public void setIdDetalleCompra(int idDetalleCompra) {
        this.idDetalleCompra = idDetalleCompra;
    }

    public int getIdMateriaPrima() {
        return idMateriaPrima;
    }

    public void setIdMateriaPrima(int idMateriaPrima) {
        this.idMateriaPrima = idMateriaPrima;
    }
}
