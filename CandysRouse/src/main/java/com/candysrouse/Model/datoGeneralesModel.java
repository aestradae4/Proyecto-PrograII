package com.candysrouse.Model;

<<<<<<< HEAD
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
=======
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
>>>>>>> APIs
        this.idDatosGenerales = idDatosGenerales;
        this.dpi = dpi;
        this.nit = nit;
        this.correo = correo;
<<<<<<< HEAD
        this.nombre = nombre;
=======
        this.nombreg = nombreg;
>>>>>>> APIs
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaRegistro = fechaRegistro;
<<<<<<< HEAD
        this.registroActivo = registroActivo;
        this.idTipoPersona = idTipoPersona;
    }

    public datoGeneralesModel() {
    }

    public int getIdDatosGenerales() {
        return this.idDatosGenerales;
=======
        this.credito = credito;
        
        
        
    }

    public int getIdDatosGenerales() {
        return idDatosGenerales;
>>>>>>> APIs
    }

    public void setIdDatosGenerales(int idDatosGenerales) {
        this.idDatosGenerales = idDatosGenerales;
    }

    public int getDpi() {
<<<<<<< HEAD
        return this.dpi;
=======
        return dpi;
>>>>>>> APIs
    }

    public void setDpi(int dpi) {
        this.dpi = dpi;
    }

    public int getNit() {
<<<<<<< HEAD
        return this.nit;
=======
        return nit;
>>>>>>> APIs
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public String getCorreo() {
<<<<<<< HEAD
        return this.correo;
=======
        return correo;
>>>>>>> APIs
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

<<<<<<< HEAD
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
=======
    public String getNombreg() {
        return nombreg;
    }

    public void setNombreg(String nombreg) {
        this.nombreg = nombreg;
    }

    public String getApellido() {
        return apellido;
>>>>>>> APIs
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
<<<<<<< HEAD
        return this.direccion;
=======
        return direccion;
>>>>>>> APIs
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

<<<<<<< HEAD
    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
=======
    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
>>>>>>> APIs
        this.telefono = telefono;
    }

    public String getFechaRegistro() {
<<<<<<< HEAD
        return this.fechaRegistro;
=======
        return fechaRegistro;
>>>>>>> APIs
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

<<<<<<< HEAD
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
