package com.candysrouse.Model;

public class productoModel {

    private int idProducto;
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
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public recetaModel getReceta() {
        return receta;
    }

    public void setReceta(recetaModel receta) {
        this.receta = receta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("productoModel{idProducto=").append(idProducto);
        sb.append(", receta=").append(receta);
        sb.append(", nombre=").append(nombre);
        sb.append(", descripcion=").append(descripcion);
        sb.append('}');
        return sb.toString();
    }

}
