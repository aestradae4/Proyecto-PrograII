package com.candysrouse.Model;

public class tipoPersonaModel {

    private int idTipoPersona;
    private String nombre;

    public tipoPersonaModel(int idTipoPersona, String nombre) {
        this.nombre = nombre;
    }

<<<<<<< HEAD
    public tipoPersonaModel() {

    }

=======
>>>>>>> APIs
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdTipoPersona() {
        return idTipoPersona;
    }

    public void setIdTipoPersona(int idTipoPersona) {
        this.idTipoPersona = idTipoPersona;
    }
<<<<<<< HEAD
=======

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("tipoPersonaModel{idTipoPersona=").append(idTipoPersona);
        sb.append(", nombre=").append(nombre);
        sb.append('}');
        return sb.toString();
    }

>>>>>>> APIs
}
