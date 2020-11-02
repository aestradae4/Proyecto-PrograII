
package com.candysrouse.Model;

public class detalleFacturaModel {
    int idDetalleFactura; 
    int idFactura;
    int idProducto;
    int cantidad;

    public detalleFacturaModel() {
    }

    public detalleFacturaModel(int idDetalleFactura, int idFactura, int idProducto, int cantidad) {
        this.idDetalleFactura = idDetalleFactura;
        this.idFactura = idFactura;
        this.idProducto = idProducto;
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getIdDetalleFactura() {
        return this.idDetalleFactura;
    }

    public void setIdDetalleFactura(int idDetalleFactura) {
        this.idDetalleFactura = idDetalleFactura;
    }

    public int getIdFactura() {
        return this.idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public int getIdProducto() {
        return this.idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }
    
    
}
