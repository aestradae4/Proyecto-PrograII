package com.candysrouse.Model;

public class facturaModel {

    int idFactura;
    int idDatosGenerales;
    int idEmpresa;
    String fecha;
    float monto;

    public facturaModel() {
    }


    public facturaModel(int idFactura, int idDatosGenerales, int idEmpresa, String fecha, float monto) {
        this.idFactura = idFactura;
        this.idDatosGenerales = idDatosGenerales;
        this.idEmpresa = idEmpresa;
        this.fecha = fecha;
        this.monto = monto;
    }

    public float getMonto() {
        return this.monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public int getIdFactura() {
        return this.idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public int getIdDatosGenerales() {
        return this.idDatosGenerales;
    }

    public void setIdDatosGenerales(int idDatosGenerales) {
        this.idDatosGenerales = idDatosGenerales;
    }

    public int getIdEmpresa() {
        return this.idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getFecha() {
        return this.fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    
}
