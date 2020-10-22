<<<<<<< HEAD
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
=======

package com.candysrouse.Model;


public class comprasModel {
    private int idProveedor;
    private proveedorModel proveedor; 
    private String fecha; 
    private formaPagoModel formaPago; 

    public comprasModel(int idProveedor, proveedorModel proveedor, String fecha, formaPagoModel formaPago) {
        this.idProveedor = idProveedor;
        this.proveedor = proveedor;
        this.fecha = fecha;
        this.formaPago = formaPago;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public proveedorModel getProveedor() {
        return proveedor;
    }

    public void setProveedor(proveedorModel proveedor) {
        this.proveedor = proveedor;
    }

    public String getFecha() {
        return fecha;
>>>>>>> APIs
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

<<<<<<< HEAD
    public int getIdFormaPago() {
        return this.idFormaPago;
    }

    public void setIdFormaPago(int idFormaPago) {
        this.idFormaPago = idFormaPago;
    }

=======
    public formaPagoModel getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(formaPagoModel formaPago) {
        this.formaPago = formaPago;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("comprasModel{idProveedor=").append(idProveedor);
        sb.append(", proveedor=").append(proveedor);
        sb.append(", fecha=").append(fecha);
        sb.append(", formaPago=").append(formaPago);
        sb.append('}');
        return sb.toString();
    }
    
    
>>>>>>> APIs
}
