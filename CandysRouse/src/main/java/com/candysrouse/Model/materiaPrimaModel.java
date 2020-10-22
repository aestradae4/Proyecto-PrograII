package com.candysrouse.Model;

public class materiaPrimaModel {

    private int idMateriaPrima;
    private String nombre;
    private int medida;
    private int cantidad;
    private int costo;

    public materiaPrimaModel() {
    }

    public materiaPrimaModel(int idMateriaPrima, String nombre, int medida, int cantidad, int costo) {
        this.idMateriaPrima = idMateriaPrima;
        this.nombre = nombre;
        this.medida = medida;
        this.cantidad = cantidad;
        this.costo = costo;
    }

    public int getIdMateriaPrima() {
        return this.idMateriaPrima;
    }

    public void setIdMateriaPrima(int idMateriaPrima) {
        this.idMateriaPrima = idMateriaPrima;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMedida() {
        return this.medida;
    }

    public void setMedida(int medida) {
        this.medida = medida;
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCosto() {
        return this.costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

}
