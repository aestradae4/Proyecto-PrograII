package com.candysrouse.Model;

public class materiaPrimaModel {

    int idMateriaPrima;
    String nombre;
    int medida;
    int cantidad;
    int costo;

    public materiaPrimaModel(int idMateriaPrima, String nombre, int medida, int cantidad, int costo) {
        this.idMateriaPrima = idMateriaPrima;
=======
    private int idReceta;
    private String nombre;
    private String medida;
    private int cantidad;
    private int costo;

    public materiaPrimaModel(int idReceta, String nombre, String medida, int cantidad, int costo) {
        this.idReceta = idReceta;
>>>>>>> APIs
        this.nombre = nombre;
        this.medida = medida;
        this.cantidad = cantidad;
        this.costo = costo;
    }

    public materiaPrimaModel() {
    }

    public int getIdMateriaPrima() {
        return this.idMateriaPrima;
    }

    public void setIdMateriaPrima(int idMateriaPrima) {
        this.idMateriaPrima = idMateriaPrima;
    }

    public String getNombre() {
        return this.nombre;
=======
    public int getIdReceta() {
        return idReceta;
    }

    public void setIdReceta(int idReceta) {
        this.idReceta = idReceta;
    }

    public String getNombre() {
        return nombre;
>>>>>>> APIs
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

<<<<<<< HEAD
    public int getMedida() {
        return this.medida;
    }

    public void setMedida(int medida) {
=======
    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
>>>>>>> APIs
        this.medida = medida;
    }

    public int getCantidad() {
<<<<<<< HEAD
        return this.cantidad;
=======
        return cantidad;
>>>>>>> APIs
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCosto() {
<<<<<<< HEAD
        return this.costo;
=======
        return costo;
>>>>>>> APIs
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    
        
}
