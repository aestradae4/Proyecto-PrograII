package com.candysrouse.DAO;

import com.candysrouse.Conexion.Conexion;
import com.candysrouse.Model.facturaModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class candyApiFacturaDAO {

    //Variable de conexión
    Connection connection;
    //Instanciamos nuevo objeto de tipo Conexión en base a la clase "Conexion"
    Conexion con = new Conexion();

    //Variables de resultado de consulta en DB
    ResultSet rs;
    int resultado;
    boolean res;

    //Declaracion de variables de objeto 
    int idFactura;
    int idDatosGenerales;
    int idEmpresa;
    String fecha;
    float monto;

    //Declaracion de consultas
    String INSERT = "INSERT INTO gearsgtc_java_panaderia.tblFactura VALUES(NULL, ?, ?, ?, ?)";
    //Consulta SELECT para obtener todos los usuarios
    String SELECT = "SELECT * FROM gearsgtc_java_panaderia.tblFactura";
    String selectById = "SELECT * FROM gearsgtc_java_panaderia.tblFactura where idFactura = ";
    //Consulta DELETE para eliminar un registro en especifico de la DB
    String DELETE = "DELETE FROM gearsgtc_java_panaderia.tblFactura where idFactura = ";
    //Consulta UPDATE para actualizar datos de un registro en especifico
    //Se realizo prueba del update
    String UPDATE = "UPDATE gearsgtc_java_panaderia.tblFactura SET idDatosGenerales = ?, idEmpresa = ?, fecha = ?, monto = ?  WHERE idFactura = ?";

    //Definicion de metodos CRUD
    public boolean agregar(facturaModel objfactura) {
        try {
            //Obtenermos la conexion
            connection = con.getConnection();
            //Preparamos la consulta
            PreparedStatement statement = connection.prepareStatement(INSERT);

            //Asignamos los valores a los campos de la consulta sql 
            //statement.setInt(1, objEmpleado.getIdEmpleado()); 
            statement.setInt(1, objfactura.getIdDatosGenerales());
            statement.setInt(2, objfactura.getIdEmpresa());
            statement.setString(3, objfactura.getFecha());
            statement.setFloat(4, objfactura.getMonto());
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
    public List<facturaModel> obtenerTodos() {
        //Creamos la lista del tipo de objeto correspondiente que almacena los registros
        List<facturaModel> listaFactura = new ArrayList<facturaModel>();

        try {
            String sql = SELECT;
            connection = con.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.execute();
            rs = statement.executeQuery(sql);
            res = true;

            if (res) {
                while (rs.next()) {
                    idFactura = rs.getInt("idFactura");
                    idDatosGenerales = rs.getInt("idDatosGenerales");
                    idEmpresa = rs.getInt("idEmpresa");
                    fecha = rs.getString("fecha");
                    monto = rs.getFloat("monto");


                    //Creacion de objeto de datos factura
                    facturaModel factura = new facturaModel(idFactura, idDatosGenerales, idEmpresa, fecha, monto);
                    //Agregamos el objeto a nuestra lista de objetos
                    listaFactura.add(factura);

                }
            }
            //Cerramos la conexion a la base de datos 
            connection.close();
            //Retornamos la lista de registros
            return listaFactura;

        } catch (SQLException ex) {
            return listaFactura;
        }
    }

    //Obtener un usuario en especifico mediante su ID
    public facturaModel obtenerUnaFactura(int idFactura) {

        //Creacion de nuestro objeto 
        facturaModel factura;
        try {
            String sql = selectById + Integer.toString(idFactura);
            connection = con.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.execute();
            rs = statement.executeQuery(sql);

            res = true;

            if (res) {
                while (rs.next()) {
                    idFactura = rs.getInt("idFactura");
                    idDatosGenerales = rs.getInt("idDatosGenerales");
                    idEmpresa = rs.getInt("idEmpresa");
                    fecha = rs.getString("fecha");
                    monto = rs.getFloat("monto");

                }
            }

            connection.close();
        } catch (SQLException e) {
            return null;
        }
        //Creacion de objeto de tipo empleadoModel
        facturaModel facturalByid = new facturaModel(idFactura,idDatosGenerales, idEmpresa, fecha, monto);
        return facturalByid;
    }

    //Metodo publico para eliminar un usuario 
    public boolean eliminar(int idFactura) {
        try {
            String sql = DELETE + Integer.toString(idFactura);
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
    public boolean actualizar(facturaModel objfactura) {
        try {
            //Obtenermos la conexion
            connection = con.getConnection();
            //Preparamos la consulta
            PreparedStatement statement = connection.prepareStatement(UPDATE);

            //Asignamos los valores a los campos de la consulta sql 
            statement.setInt(1, objfactura.getIdDatosGenerales());
            statement.setInt(2, objfactura.getIdEmpresa());
            statement.setString(3, objfactura.getFecha());
            statement.setFloat(4, objfactura.getMonto());
            statement.setInt(5, objfactura.getIdFactura());
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
