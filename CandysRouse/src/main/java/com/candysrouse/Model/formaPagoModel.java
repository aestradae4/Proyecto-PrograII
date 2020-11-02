package com.candysrouse.Model;

public class formaPagoModel {

    int idFormaPago;
    String tipoPago;

    public formaPagoModel(int idFormaPago, String tipoPago) {
        this.idFormaPago = idFormaPago;
        this.tipoPago = tipoPago;
    }

    public formaPagoModel() {
    }

    public int getIdFormaPago() {
        return this.idFormaPago;
    }

    public void setIdFormaPago(int idFormaPago) {
        this.idFormaPago = idFormaPago;
    }

    public String getTipoPago() {
        return this.tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

}
