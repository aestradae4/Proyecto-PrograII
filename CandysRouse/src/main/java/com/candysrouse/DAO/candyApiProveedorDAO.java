package com.candysrouse.DAO;

import com.candysrouse.Conexion.Conexion;
import com.candysrouse.Model.proveedorModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class candyApiProveedorDAO {
    //Variable de conexión

    Connection connection;
    //Instanciamos nuevo objeto de tipo Conexión en base a la clase "Conexion"
    Conexion con = new Conexion();

    //Variables de resultado de consulta en DB
    ResultSet rs;
    int resultado;
    boolean res;

    //Declaracion de variables de objeto 
    int idProveedor;
    int idEmpresa;
    int diasCredito;
    int credito;

    //Declaracion de consultas
    String INSERT = "INSERT INTO gearsgtc_java_panaderia.tblProveedor VALUES(NULL, ?, ?, ?)";
    //Consulta SELECT para obtener todos los usuarios
    String SELECT = "SELECT * FROM gearsgtc_java_panaderia.tblProveedor";
    String selectById = "SELECT * FROM gearsgtc_java_panaderia.tblProveedor where idProveedor = ";
    //Consulta DELETE para eliminar un registro en especifico de la DB
    String DELETE = "DELETE FROM gearsgtc_java_panaderia.tblProveedor where idProveedor = ";
    //Consulta UPDATE para actualizar datos de un registro en especifico
    String UPDATE = "UPDATE gearsgtc_java_panaderia.tblProveedor SET idEmpresa = ?, credito = ?, diasCredito = ? WHERE idProveedor = ?";

    //Definicion de metodos CRUD
    public boolean agregar(proveedorModel objPro) {
        try {
            //Obtenermos la conexion
            connection = con.getConnection();
            //Preparamos la consulta
            PreparedStatement statement = connection.prepareStatement(INSERT);

            //Asignamos los valores a los campos de la consulta sql 
            //statement.setInt(1, objEmpleado.getIdEmpleado()); 
            statement.setInt(1, objPro.getIdEmpresa());
            statement.setInt(2, objPro.getCredito());
            statement.setInt(3, objPro.getDiasCredito());
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
    public List<proveedorModel> obtenerTodos() {
        //Creamos la lista del tipo de objeto correspondiente que almacena los registros
        List<proveedorModel> listaPro = new ArrayList<proveedorModel>();

        try {
            String sql = SELECT;
            connection = con.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.execute();
            rs = statement.executeQuery(sql);
            res = true;

            if (res) {
                while (rs.next()) {
                    idProveedor = rs.getInt("idProveedor"); 
                    idEmpresa = rs.getInt("idEmpresa"); 
                    credito = rs.getInt("credito"); 
                    diasCredito = rs.getInt("diasCredito"); 

                    //Creacion de objeto de tipo Empleado
                    proveedorModel proveedor = new proveedorModel(idProveedor, idEmpresa, credito, diasCredito);
                    //Agregamos el objeto a nuestra lista de objetos
                    listaPro.add(proveedor);

                }
            }
            //Cerramos la conexion a la base de datos 
            connection.close();
            //Retornamos la lista de registros
            return listaPro;

        } catch (SQLException ex) {
            return listaPro;
        }
    }

    //Obtener un usuario en especifico mediante su ID
    public proveedorModel obtenerUnPro(int idProveedor) {

        //Creacion de nuestro objeto 
        proveedorModel proveedor;
        try {
            String sql = selectById + Integer.toString(idProveedor);
            connection = con.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.execute();
            rs = statement.executeQuery(sql);

            res = true;

            if (res) {
                while (rs.next()) {
                   idProveedor = rs.getInt("idProveedor"); 
                   idEmpresa = rs.getInt("idEmpresa"); 
                   credito = rs.getInt("credito"); 
                   diasCredito = rs.getInt("diasCredito"); 
                }
            }

            connection.close();
        } catch (SQLException e) {
            return null;
        }
        //Creacion de objeto de tipo empleadoModel
        proveedorModel proByid = new proveedorModel(idProveedor, idEmpresa, credito, diasCredito);
        return proByid;
    }

    //Metodo publico para eliminar un usuario 
    public boolean eliminar(int idProveedor) {
        try {
            String sql = DELETE + Integer.toString(idProveedor);
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
    public boolean actualizar(proveedorModel objPro) {
        try {
            //Obtenermos la conexion
            connection = con.getConnection();
            //Preparamos la consulta
            PreparedStatement statement = connection.prepareStatement(UPDATE);

            //Asignamos los valores a los campos de la consulta sql 
             
            statement.setInt(1, objPro.getIdEmpresa());
            statement.setInt(2, objPro.getCredito());
            statement.setInt(3, objPro.getDiasCredito());
            statement.setInt(4, objPro.getIdProveedor());
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
