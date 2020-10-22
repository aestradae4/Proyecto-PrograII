<<<<<<< HEAD
package com.candysrouse.Model;

public class facturaModel {

    private int idFactura;
    private int idDatosGenerales;
    private int idEmpresa;
    private String fecha;
    private double monto;

    public facturaModel() {
    }

    public facturaModel(int idFactura, int idDatosGenerales, int idEmpresa, String fecha, double monto) {
        this.idFactura = idFactura;
        this.idDatosGenerales = idDatosGenerales;
        this.idEmpresa = idEmpresa;
=======

package com.candysrouse.Model;


public class facturaModel {
    private int idFactura;
    private datoGeneralesModel datoGeneral;
    private empresaModel empresaModel; 
    private String fecha;
    private double monto;

    public facturaModel(int idFactura, datoGeneralesModel datoGeneral, empresaModel empresaModel, String fecha, double monto) {
        this.idFactura = idFactura;
        this.datoGeneral = datoGeneral;
        this.empresaModel = empresaModel;
>>>>>>> APIs
        this.fecha = fecha;
        this.monto = monto;
    }

    public int getIdFactura() {
<<<<<<< HEAD
        return this.idFactura;
=======
        return idFactura;
>>>>>>> APIs
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

<<<<<<< HEAD
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
=======
    public datoGeneralesModel getDatoGeneral() {
        return datoGeneral;
    }

    public void setDatoGeneral(datoGeneralesModel datoGeneral) {
        this.datoGeneral = datoGeneral;
    }

    public empresaModel getEmpresaModel() {
        return empresaModel;
    }

    public void setEmpresaModel(empresaModel empresaModel) {
        this.empresaModel = empresaModel;
    }

    public String getFecha() {
        return fecha;
>>>>>>> APIs
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getMonto() {
<<<<<<< HEAD
        return this.monto;
=======
        return monto;
>>>>>>> APIs
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

<<<<<<< HEAD
=======
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("facturaModel{idFactura=").append(idFactura);
        sb.append(", datoGeneral=").append(datoGeneral);
        sb.append(", empresaModel=").append(empresaModel);
        sb.append(", fecha=").append(fecha);
        sb.append(", monto=").append(monto);
        sb.append('}');
        return sb.toString();
    }
    
>>>>>>> APIs
}
