package com.candysrouse.Model;

<<<<<<< HEAD
public class empresaModel {

    private int idEmpresa;
    private int nitEmpresa;
    private int telefonoEmpresa;
    private String direccionEmpresa;
    private int idDatosGenerales;

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
        return telefonoEmpresa;
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

<<<<<<< HEAD
    public void setidDatosGenerales(int idDatosGenerales) {
        this.idDatosGenerales = idDatosGenerales;
    }

    public int getidDatosGerenales() {
        return this.idDatosGenerales;
=======
    public String getRazonSocialEmpresa() {
        return razonSocialEmpresa;
    }

    public void setRazonSocialEmpresa(String razonSocialEmpresa) {
        this.razonSocialEmpresa = razonSocialEmpresa;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("empresaModel{idEmpresa=").append(idEmpresa);
        sb.append(", nitEmpresa=").append(nitEmpresa);
        sb.append(", telefonoEmpresa=").append(telefonoEmpresa);
        sb.append(", direccionEmpresa=").append(direccionEmpresa);
        sb.append(", razonSocialEmpresa=").append(razonSocialEmpresa);
        sb.append("").append(super.toString());
        sb.append('}');
        return sb.toString();
>>>>>>> APIs
    }
}
