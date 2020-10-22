package com.candysrouse.Model;

public class productoModel {

    private int idProducto;
<<<<<<< HEAD
    private int idReceta;
    private String nombre;
    private String descripcion;
    private double existencia;
    private double precio;

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
=======
    private recetaModel receta;
    private String nombre;
    private String descripcion;

    public productoModel(int idProducto, recetaModel receta, String nombre, String descripcion) {
        this.idProducto = idProducto;
        this.receta = receta;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public int getIdProducto() {
        return idProducto;
>>>>>>> APIs
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

<<<<<<< HEAD
    public int getIdReceta() {
        return this.idReceta;
    }

    public void setIdReceta(int idReceta) {
        this.idReceta = idReceta;
    }

    public String getNombre() {
        return this.nombre;
=======
    public recetaModel getReceta() {
        return receta;
    }

    public void setReceta(recetaModel receta) {
        this.receta = receta;
    }

    public String getNombre() {
        return nombre;
>>>>>>> APIs
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
<<<<<<< HEAD
        return this.descripcion;
=======
        return descripcion;
>>>>>>> APIs
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

<<<<<<< HEAD
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
=======
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("productoModel{idProducto=").append(idProducto);
        sb.append(", receta=").append(receta);
        sb.append(", nombre=").append(nombre);
        sb.append(", descripcion=").append(descripcion);
        sb.append('}');
        return sb.toString();
>>>>>>> APIs
    }

}
