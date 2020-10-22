package com.candysrouse.Model;

public class detalleCompraModel {

    private int idDetalleCompra;
    private int idMateriaPrima;
    private int cantidad;

    public detalleCompraModel() {
    }

    public detalleCompraModel(int idDetalleCompra, int idMateriaPrima, int cantidad) {
        this.idDetalleCompra = idDetalleCompra;
        this.idMateriaPrima = idMateriaPrima;
        this.cantidad = cantidad;
    }

    public int getIdDetalleCompra() {
        return this.idDetalleCompra;
    }

    public void setIdDetalleCompra(int idDetalleCompra) {
        this.idDetalleCompra = idDetalleCompra;
    }

    public int getIdMateriaPrima() {
        return this.idMateriaPrima;
    }

    public void setIdMateriaPrima(int idMateriaPrima) {
        this.idMateriaPrima = idMateriaPrima;
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}
