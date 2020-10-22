package com.candysrouse.Model;

public class detalleCompraModel {
<<<<<<< HEAD

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
=======
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
>>>>>>> APIs
    }

    public void setIdDetalleCompra(int idDetalleCompra) {
        this.idDetalleCompra = idDetalleCompra;
    }

<<<<<<< HEAD
    public int getIdMateriaPrima() {
        return this.idMateriaPrima;
    }

    public void setIdMateriaPrima(int idMateriaPrima) {
        this.idMateriaPrima = idMateriaPrima;
    }

    public int getCantidad() {
        return this.cantidad;
=======
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
>>>>>>> APIs
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

<<<<<<< HEAD
=======
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

>>>>>>> APIs
}
