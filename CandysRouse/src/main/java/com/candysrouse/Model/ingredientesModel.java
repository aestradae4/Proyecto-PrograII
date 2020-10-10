package com.candysrouse.Model;

public class ingredientesModel {

    private int idIngredientes;
    private recetaModel receta;
    private materiaPrimaModel materiaPrima;
    private int cantidad;

    public ingredientesModel(int idIngredientes, recetaModel receta, materiaPrimaModel materiaPrima, int cantidad) {
        this.idIngredientes = idIngredientes;
        this.receta = receta;
        this.materiaPrima = materiaPrima;
        this.cantidad = cantidad;
    }

    public int getIdIngredientes() {
        return idIngredientes;
    }

    public void setIdIngredientes(int idIngredientes) {
        this.idIngredientes = idIngredientes;
    }

    public recetaModel getReceta() {
        return receta;
    }

    public void setReceta(recetaModel receta) {
        this.receta = receta;
    }

    public materiaPrimaModel getMateriaPrima() {
        return materiaPrima;
    }

    public void setMateriaPrima(materiaPrimaModel materiaPrima) {
        this.materiaPrima = materiaPrima;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ingredientesModel{idIngredientes=").append(idIngredientes);
        sb.append(", receta=").append(receta);
        sb.append(", materiaPrima=").append(materiaPrima);
        sb.append(", cantidad=").append(cantidad);
        sb.append('}');
        return sb.toString();
    }

}
