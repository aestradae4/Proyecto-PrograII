<<<<<<< HEAD
package com.candysrouse.Model;

public class detalleFacturaModel {

    int idFactura;
    int idProducto;
    int cantidad;

    public detalleFacturaModel() {
    }

    public detalleFacturaModel(int idFactura, int idProducto, int cantidad) {
        this.idFactura = idFactura;
        this.idProducto = idProducto;
        this.cantidad = cantidad;
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

    public int getCantidad() {
        return this.cantidad;
=======

package com.candysrouse.Model;


public class detalleFacturaModel {
    private productoModel producto; 
    private facturaModel factura; 
    private int cantidad; 

    public detalleFacturaModel(productoModel producto, facturaModel factura, int cantidad) {
        this.producto = producto;
        this.factura = factura;
        this.cantidad = cantidad;
    }

    public productoModel getProducto() {
        return producto;
    }

    public void setProducto(productoModel producto) {
        this.producto = producto;
    }

    public facturaModel getFactura() {
        return factura;
    }

    public void setFactura(facturaModel factura) {
        this.factura = factura;
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
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("detalleFacturaModel{producto=").append(producto);
        sb.append(", factura=").append(factura);
        sb.append(", cantidad=").append(cantidad);
        sb.append('}');
        return sb.toString();
    }
    
>>>>>>> APIs
}
