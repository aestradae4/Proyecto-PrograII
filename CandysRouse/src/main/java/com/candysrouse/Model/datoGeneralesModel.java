package com.candysrouse.Model;

public class datoGeneralesModel {

    private int idDatosGenerales;
    private int dpi;
    private int nit;
    private String correo;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private String fechaRegistro;
    private int registroActivo;
    private int idTipoPersona;

    public datoGeneralesModel(int idDatosGenerales, int dpi, int nit, String correo, String nombre, String apellido, String direccion, String telefono, String fechaRegistro, int registroActivo, int idTipoPersona) {
        this.idDatosGenerales = idDatosGenerales;
        this.dpi = dpi;
        this.nit = nit;
        this.correo = correo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaRegistro = fechaRegistro;
        this.registroActivo = registroActivo;
        this.idTipoPersona = idTipoPersona;
    }

    public datoGeneralesModel() {
    }

    public int getIdDatosGenerales() {
        return this.idDatosGenerales;
    }

    public void setIdDatosGenerales(int idDatosGenerales) {
        this.idDatosGenerales = idDatosGenerales;
    }

    public int getDpi() {
        return this.dpi;
    }

    public void setDpi(int dpi) {
        this.dpi = dpi;
    }

    public int getNit() {
        return this.nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public String getCorreo() {
        return this.correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFechaRegistro() {
        return this.fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public int getRegistroActivo() {
        return this.registroActivo;
    }

    public void setRegistroActivo(int registroActivo) {
        this.registroActivo = registroActivo;
    }

    public int getIdTipoPersona() {
        return this.idTipoPersona;
    }

    public void setIdTipoPersona(int idTipoPersona) {
        this.idTipoPersona = idTipoPersona;
    }

    


}
