package com.candysrouse.Model;

public class datoGeneralesModel extends tipoPersonaModel {

    private int idDatosGenerales;
    private int dpi;
    private int nit;
    private String correo;
    private String nombreg;
    private String apellido;
    private String direccion;
    private int telefono;
    private String fechaRegistro;
    private boolean registroActivo = true;
    private boolean credito = true;

    public datoGeneralesModel(int idDatosGenerales, int dpi, int nit, String correo, String nombreg, String apellido, String direccion, int telefono, String fechaRegistro, int idTipoPersona, String nombre, boolean credito) {
        super(idTipoPersona, nombre);
        this.idDatosGenerales = idDatosGenerales;
        this.dpi = dpi;
        this.nit = nit;
        this.correo = correo;
        this.nombreg = nombreg;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaRegistro = fechaRegistro;
        this.credito = credito;
        
        
        
    }

    public int getIdDatosGenerales() {
        return idDatosGenerales;
    }

    public void setIdDatosGenerales(int idDatosGenerales) {
        this.idDatosGenerales = idDatosGenerales;
    }

    public int getDpi() {
        return dpi;
    }

    public void setDpi(int dpi) {
        this.dpi = dpi;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombreg() {
        return nombreg;
    }

    public void setNombreg(String nombreg) {
        this.nombreg = nombreg;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isRegistroActivo() {
        return registroActivo;
    }

    public void setRegistroActivo(boolean registroActivo) {
        this.registroActivo = registroActivo;
    }

    public boolean isCredito() {
        return credito;
    }

    public void setCredito(boolean credito) {
        this.credito = credito;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("datoGeneralesModel{idDatosGenerales=").append(idDatosGenerales);
        sb.append(", dpi=").append(dpi);
        sb.append(", nit=").append(nit);
        sb.append(", correo=").append(correo);
        sb.append(", nombreg=").append(nombreg);
        sb.append(", apellido=").append(apellido);
        sb.append(", direccion=").append(direccion);
        sb.append(", telefono=").append(telefono);
        sb.append(", fechaRegistro=").append(fechaRegistro);
        sb.append(", registroActivo=").append(registroActivo);
        sb.append(", credito=").append(credito);
        sb.append("").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

    
    

}
