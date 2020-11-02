package com.candysrouse.Model;

public class productoModel {

    int idProducto;
    int idReceta;
    String nombre;
    String descripcion;
    double existencia;
    double precio;

    public productoModel(int idProducto, int idReceta, String nombre, String descripcion, double existencia, double precio) {
        this.idProducto = idProducto;
        this.idReceta = idReceta;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.existencia = existencia;
        this.precio = precio;
    }

    public productoModel() {
    }

    public int getIdProducto() {
        return this.idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getIdReceta() {
        return this.idReceta;
    }

    public void setIdReceta(int idReceta) {
        this.idReceta = idReceta;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getExistencia() {
        return this.existencia;
    }

    public void setExistencia(double existencia) {
        this.existencia = existencia;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}
