package com.candysrouse.Model;

public class materiaPrimaModel {

    int idMateriaPrima;
    String nombre;
    String medida;
    int cantidad;
    int costo;

    public materiaPrimaModel() {
    }

    public materiaPrimaModel(int idMateriaPrima, String nombre, String medida, int cantidad, int costo) {
        this.idMateriaPrima = idMateriaPrima;
        this.nombre = nombre;
        this.medida = medida;
        this.cantidad = cantidad;
        this.costo = costo;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getIdMateriaPrima() {
        return idMateriaPrima;
    }

    public void setIdMateriaPrima(int idMateriaPrima) {
        this.idMateriaPrima = idMateriaPrima;
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

  
}