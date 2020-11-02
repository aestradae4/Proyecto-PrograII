package com.candysrouse.Model;

public class ingredientesModel {

    int idIngredientes;
    int idReceta;
    int idMateriaPrima;
    float cantidad;
    
    public ingredientesModel() {
    }

    public ingredientesModel(int idIngredientes, int idReceta, int idMateriaPrima, float cantidad) {
        this.idIngredientes = idIngredientes;
        this.idReceta = idReceta;
        this.idMateriaPrima = idMateriaPrima;
        this.cantidad = cantidad;
    }

    public float getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public int getIdIngredientes() {
        return this.idIngredientes;
    }

    public void setIdIngredientes(int idIngredientes) {
        this.idIngredientes = idIngredientes;
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
    


}
