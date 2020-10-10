
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
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

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
    
    
}
