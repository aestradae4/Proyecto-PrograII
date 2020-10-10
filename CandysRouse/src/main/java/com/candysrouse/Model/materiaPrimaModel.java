package com.candysrouse.Model;

public class materiaPrimaModel {

    private int idReceta;
    private String nombre;
    private String medida;
    private int cantidad;
    private int costo;

    public materiaPrimaModel(int idReceta, String nombre, String medida, int cantidad, int costo) {
        this.idReceta = idReceta;
        this.nombre = nombre;
        this.medida = medida;
        this.cantidad = cantidad;
        this.costo = costo;
    }

    public int getIdReceta() {
        return idReceta;
    }

    public void setIdReceta(int idReceta) {
        this.idReceta = idReceta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
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
        sb.append("materiaPrimaModel{idReceta=").append(idReceta);
        sb.append(", nombre=").append(nombre);
        sb.append(", medida=").append(medida);
        sb.append(", cantidad=").append(cantidad);
        sb.append(", costo=").append(costo);
        sb.append('}');
        return sb.toString();
    }

}
