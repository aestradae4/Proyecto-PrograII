package com.candysrouse.Model;

public class ingredientesModel {

    int idReceta;
    int idMateriaPrima;
    int cantidad;

    public ingredientesModel(int idReceta, int idMateriaPrima, int cantidad) {
        this.idReceta = idReceta;
        this.idMateriaPrima = idMateriaPrima;
        this.cantidad = cantidad;
    }

    public ingredientesModel() {
    }

    public int getIdReceta() {
        return this.idReceta;
    }

    public void setIdReceta(int idReceta) {
        this.idReceta = idReceta;
    }

    public int getIdMateriaPrima() {
        return this.idMateriaPrima;
    }

    public void setIdMateriaPrima(int idMateriaPrima) {
        this.idMateriaPrima = idMateriaPrima;
    }

    public int getCantidad() {
        return this.cantidad;

    }
}
