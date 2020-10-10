package com.candysrouse.Model;

public class detalleCompraModel {
    private int idDetalleCompra;
    private comprasModel compras;
    private materiaPrimaModel materiaPrima;
    private int cantidad;
    private int costo;

    public detalleCompraModel(int idDetalleCompra, comprasModel compras, materiaPrimaModel materiaPrima, int cantidad, int costo) {
        this.idDetalleCompra = idDetalleCompra;
        this.compras = compras;
        this.materiaPrima = materiaPrima;
        this.cantidad = cantidad;
        this.costo = costo;
    }

    public int getIdDetalleCompra() {
        return idDetalleCompra;
    }

    public void setIdDetalleCompra(int idDetalleCompra) {
        this.idDetalleCompra = idDetalleCompra;
    }

    public comprasModel getCompras() {
        return compras;
    }

    public void setCompras(comprasModel compras) {
        this.compras = compras;
    }

    public materiaPrimaModel getMateriaPrima() {
        return materiaPrima;
    }

    public void setMateriaPrima(materiaPrimaModel materiaPrima) {
        this.materiaPrima = materiaPrima;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("detalleCompraModel{idDetalleCompra=").append(idDetalleCompra);
        sb.append(", compras=").append(compras);
        sb.append(", materiaPrima=").append(materiaPrima);
        sb.append(", cantidad=").append(cantidad);
        sb.append(", costo=").append(costo);
        sb.append('}');
        return sb.toString();
    }

}
