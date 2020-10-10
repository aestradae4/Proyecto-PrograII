
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
        this.fecha = fecha;
        this.monto = monto;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

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
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

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
    
}
