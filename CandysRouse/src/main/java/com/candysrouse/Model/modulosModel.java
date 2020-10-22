package com.candysrouse.Model;

public class modulosModel {
<<<<<<< HEAD

    private int idModulo;
=======
    private int idModulo; 
>>>>>>> APIs
    private String nombre;

    public modulosModel(int idModulo, String nombre) {
        this.nombre = nombre;
    }

<<<<<<< HEAD
    public modulosModel() {

    }

=======
>>>>>>> APIs
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
<<<<<<< HEAD

=======
    
>>>>>>> APIs
    public int getIdModulo() {
        return idModulo;
    }

    public void setIdModulo(int idModulo) {
        this.idModulo = idModulo;
    }

<<<<<<< HEAD
=======
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("modulosModel{idModulo=").append(idModulo);
        sb.append(", nombre=").append(nombre);
        sb.append('}');
        return sb.toString();
    }
    
>>>>>>> APIs
}
