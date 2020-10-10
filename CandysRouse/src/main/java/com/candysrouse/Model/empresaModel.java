package com.candysrouse.Model;

public class empresaModel extends datoGeneralesModel{
    private int idEmpresa; 
    private int nitEmpresa;
    private int telefonoEmpresa; 
    private String direccionEmpresa;
    private String razonSocialEmpresa; 

    public empresaModel(int idEmpresa, int nitEmpresa, int telefonoEmpresa, String direccionEmpresa, String razonSocialEmpresa, int idDatosGenerales, int dpi, int nit, String correo, String nombreg, String apellido, String direccion, int telefono, String fechaRegistro, int idTipoPersona, String nombre, boolean credito) {
        super(idDatosGenerales, dpi, nit, correo, nombreg, apellido, direccion, telefono, fechaRegistro, idTipoPersona, nombre, credito);
        this.idEmpresa = idEmpresa;
        this.nitEmpresa = nitEmpresa;
        this.telefonoEmpresa = telefonoEmpresa;
        this.direccionEmpresa = direccionEmpresa;
        this.razonSocialEmpresa = razonSocialEmpresa;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public int getNitEmpresa() {
        return nitEmpresa;
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
        return direccionEmpresa;
    }

    public void setDireccionEmpresa(String direccionEmpresa) {
        this.direccionEmpresa = direccionEmpresa;
    }

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
    }
}
