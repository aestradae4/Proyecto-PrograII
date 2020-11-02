package com.candysrouse.DAO;

import com.candysrouse.Conexion.Conexion;
import com.candysrouse.Model.formaPagoModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class candyApiFormaPagoDAO {
    //Variable de conexión

    Connection connection;
    //Instanciamos nuevo objeto de tipo Conexión en base a la clase "Conexion"
    Conexion con = new Conexion();

    //Variables de resultado de consulta en DB
    ResultSet rs;
    int resultado;
    boolean res;

    //Declaracion de variables de objeto 
    int idFormaPago;
    String tipoPago;

    //Declaracion de consultas
    String INSERT = "INSERT INTO gearsgtc_java_panaderia.tblFormaPago VALUES(NULL, ?)";
    //Consulta SELECT para obtener todos los usuarios
    String SELECT = "SELECT * FROM gearsgtc_java_panaderia.tblFormaPago";
    String selectById = "SELECT * FROM gearsgtc_java_panaderia.tblFormaPago where idFormaPago = ";
    //Consulta DELETE para eliminar un registro en especifico de la DB
    String DELETE = "DELETE FROM gearsgtc_java_panaderia.tblFormaPago where idFormaPago = ";
    //Consulta UPDATE para actualizar datos de un registro en especifico
    String UPDATE = "UPDATE gearsgtc_java_panaderia.tblFormaPago SET tipoPago = ? WHERE idFormaPago = ?";

    //Definicion de metodos CRUD
    public boolean agregar(formaPagoModel objFormaPago) {
        try {
            //Obtenermos la conexion
            connection = con.getConnection();
            //Preparamos la consulta
            PreparedStatement statement = connection.prepareStatement(INSERT);

            //Asignamos los valores a los campos de la consulta sql 
            statement.setString(1, objFormaPago.getTipoPago());
            statement.execute();
            connection.close();

            res = true;
            return res;
        } catch (SQLException ex) {
            res = false;
            return res;
        }

    }

    //Obtener todos los registros 
    public List<formaPagoModel> obtenerTodos() {
        //Creamos la lista del tipo de objeto correspondiente que almacena los registros
        List<formaPagoModel> listaFormaPago = new ArrayList<formaPagoModel>();

        try {
            String sql = SELECT;
            connection = con.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.execute();
            rs = statement.executeQuery(sql);
            res = true;

            if (res) {
                while (rs.next()) {
                    idFormaPago = rs.getInt("idFormaPago");
                    tipoPago = rs.getString ("tipopago");

                    //Creacion de objeto de tipo Empleado
                    formaPagoModel formaPago = new formaPagoModel(idFormaPago, tipoPago);
                    //Agregamos el objeto a nuestra lista de objetos
                    listaFormaPago.add(formaPago);

                }
            }
            //Cerramos la conexion a la base de datos 
            connection.close();
            //Retornamos la lista de registros
            return listaFormaPago;

        } catch (SQLException ex) {
            return listaFormaPago;
        }
    }

    //Obtener un usuario en especifico mediante su ID
    public formaPagoModel obtenerUnaFormaPago(int idFormaPago) {

        //Creacion de nuestro objeto 
        formaPagoModel tipoPagoGeneral;
        try {
            String sql = selectById + Integer.toString(idFormaPago);
            connection = con.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.execute();
            rs = statement.executeQuery(sql);

            res = true;

            if (res) {
                while (rs.next()) {
                    idFormaPago = rs.getInt("idFormaPago:");
                    tipoPago = rs.getString ("tipoPago");
                    
                }
            }

            connection.close();
        } catch (SQLException e) {
            return null;
        }
        //Creacion de objeto de tipo empleadoModel
        formaPagoModel formaPagoByid = new formaPagoModel(idFormaPago, tipoPago);
        return formaPagoByid;
    }

    //Metodo publico para eliminar un usuario 
    public boolean eliminar(int idEmpleado) {
        try {
            String sql = DELETE + Integer.toString(idEmpleado);
            connection = con.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.execute();
            res = true;
            connection.close();
            return res;
        } catch (SQLException e) {
            res = false;
            return res;
        }
    }

    //Metodo publico paraa actualizar un usuario 
    public boolean actualizar(formaPagoModel objFormaPago) {
        try {
            //Obtenermos la conexion
            connection = con.getConnection();
            //Preparamos la consulta
            PreparedStatement statement = connection.prepareStatement(UPDATE);

            //Asignamos los valores a los campos de la consulta sql 
            statement.setString(1, objFormaPago.getTipoPago());
            statement.setInt(2, objFormaPago.getIdFormaPago());
            statement.execute();
            connection.close();

            res = true;
            return res;
        } catch (SQLException ex) {
            res = false;
            return res;
        }
    }
}
