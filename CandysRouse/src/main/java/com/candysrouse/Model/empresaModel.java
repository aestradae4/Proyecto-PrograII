package com.candysrouse.Model;

<<<<<<< HEAD
public class empresaModel {

    int idEmpresa;
    int nitEmpresa;
    int telefonoEmpresa;
    String direccionEmpresa;
    int idDatosGenerales;

    public empresaModel(int idEmpresa, int nitEmpresa, int telefonoEmpresa, String direccionEmpresa, int idDatosGenerales) {
=======
public class empresaModel extends datoGeneralesModel{
    private int idEmpresa; 
    private int nitEmpresa;
    private int telefonoEmpresa; 
    private String direccionEmpresa;
    private String razonSocialEmpresa; 

    public empresaModel(int idEmpresa, int nitEmpresa, int telefonoEmpresa, String direccionEmpresa, String razonSocialEmpresa, int idDatosGenerales, int dpi, int nit, String correo, String nombreg, String apellido, String direccion, int telefono, String fechaRegistro, int idTipoPersona, String nombre, boolean credito) {
        super(idDatosGenerales, dpi, nit, correo, nombreg, apellido, direccion, telefono, fechaRegistro, idTipoPersona, nombre, credito);
>>>>>>> APIs
        this.idEmpresa = idEmpresa;
        this.nitEmpresa = nitEmpresa;
        this.telefonoEmpresa = telefonoEmpresa;
        this.direccionEmpresa = direccionEmpresa;
<<<<<<< HEAD
        this.idDatosGenerales = idDatosGenerales;
    }

    public empresaModel() {
    }

    public int getIdEmpresa() {
        return this.idEmpresa;
=======
        this.razonSocialEmpresa = razonSocialEmpresa;
    }

    public int getIdEmpresa() {
        return idEmpresa;
>>>>>>> APIs
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public int getNitEmpresa() {
<<<<<<< HEAD
        return this.nitEmpresa;
=======
        return nitEmpresa;
>>>>>>> APIs
    }

    public void setNitEmpresa(int nitEmpresa) {
        this.nitEmpresa = nitEmpresa;
    }

    public int getTelefonoEmpresa() {
        return this.telefonoEmpresa;
    }

    public void setTelefonoEmpresa(int telefonoEmpresa) {
        this.telefonoEmpresa = telefonoEmpresa;
    }

    public String getDireccionEmpresa() {
<<<<<<< HEAD
        return this.direccionEmpresa;
=======
        return direccionEmpresa;
>>>>>>> APIs
    }

    public void setDireccionEmpresa(String direccionEmpresa) {
        this.direccionEmpresa = direccionEmpresa;
    }

    public int getIdDatosGenerales() {
        return this.idDatosGenerales;
    }

    public void setIdDatosGenerales(int idDatosGenerales) {
        this.idDatosGenerales = idDatosGenerales;
    }

    
}
