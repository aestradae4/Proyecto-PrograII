<<<<<<< HEAD
package com.candysrouse.Model;

public class formaPagoModel {

    private int idFormaPago;
    private String tipoPago;

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

=======

package com.candysrouse.Model;


public class formaPagoModel {
    private int idformaPago;
    private String formaPago; 

    public formaPagoModel(int idformaPago, String formaPago) {
        this.idformaPago = idformaPago;
        this.formaPago = formaPago;
    }

    public int getIdformaPago() {
        return idformaPago;
    }

    public void setIdformaPago(int idformaPago) {
        this.idformaPago = idformaPago;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("formaPagoModel{idformaPago=").append(idformaPago);
        sb.append(", formaPago=").append(formaPago);
        sb.append('}');
        return sb.toString();
    }    
>>>>>>> APIs
}
