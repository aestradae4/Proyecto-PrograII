package com.candysrouse.DAO;

import com.candysrouse.Conexion.Conexion;
import com.candysrouse.Model.tipoRolModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class candyApiTipoRolDAO {

    //Variable de conexión
    Connection connection;
    //Instanciamos nuevo objeto de tipo Conexión en base a la clase "Conexion"
    Conexion con = new Conexion();

    //Variables de resultado de consulta en DB
    ResultSet rs;
    int resultado;
    boolean res;

    //Declaracion de variables de objeto 
    int idTipoRol;
    String descripcionPuesto;

    //Declaracion de consultas
    String INSERT = "INSERT INTO gearsgtc_java_panaderia.tblTipoRol VALUES(NULL, ?)";
    //Consulta SELECT para obtener todos los usuarios
    String SELECT = "SELECT * FROM gearsgtc_java_panaderia.tblTipoRol";
    String selectById = "SELECT * FROM gearsgtc_java_panaderia.tblTipoRol where idTipoRol = ";
    //Consulta DELETE para eliminar un registro en especifico de la DB
    String DELETE = "DELETE FROM gearsgtc_java_panaderia.tblTipoRol where idTipoRol = ";
    //Consulta UPDATE para actualizar datos de un registro en especifico
    String UPDATE = "UPDATE gearsgtc_java_panaderia.tblTipoRol SET descripcionPuesto = ? WHERE idTipoRol = ?";

    //Definicion de metodos CRUD
    public boolean agregar(tipoRolModel objTipoRol) {
        try {
            //Obtenermos la conexion
            connection = con.getConnection();
            //Preparamos la consulta
            PreparedStatement statement = connection.prepareStatement(INSERT);

            //Asignamos los valores a los campos de la consulta sql 
            statement.setString(1, objTipoRol.getDescripcionPuesto());
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
    public List<tipoRolModel> obtenerTodos() {
        //Creamos la lista del tipo de objeto correspondiente que almacena los registros
        List<tipoRolModel> listaTipoRol = new ArrayList<tipoRolModel>();

        try {
            String sql = SELECT;
            connection = con.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.execute();
            rs = statement.executeQuery(sql);
            res = true;

            if (res) {
                while (rs.next()) {
                    idTipoRol = rs.getInt("idTipoRol");
                    descripcionPuesto = rs.getString("descripcionPuesto");

                    //Creacion de objeto de tipo Empleado
                    tipoRolModel tipoRol = new tipoRolModel(idTipoRol, descripcionPuesto);
                    //Agregamos el objeto a nuestra lista de objetos
                    listaTipoRol.add(tipoRol);

                }
            }
            //Cerramos la conexion a la base de datos 
            connection.close();
            //Retornamos la lista de registros
            return listaTipoRol;

        } catch (SQLException ex) {
            return listaTipoRol;
        }
    }

    //Obtener un usuario en especifico mediante su ID
    public tipoRolModel obtenerUnTipoRol(int idTipoRol) {

        //Creacion de nuestro objeto 
        tipoRolModel tipoRolGeneral;
        try {
            String sql = selectById + Integer.toString(idTipoRol);
            connection = con.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.execute();
            rs = statement.executeQuery(sql);

            res = true;

            if (res) {
                while (rs.next()) {
                    idTipoRol = rs.getInt("idTipoRol");
                    descripcionPuesto = rs.getString("descripcionPuesto");
                }
            }

            connection.close();
        } catch (SQLException e) {
            return null;
        }
        //Creacion de objeto de tipo empleadoModel
        tipoRolModel tipoRolByid = new tipoRolModel(idTipoRol, descripcionPuesto);
        return tipoRolByid;
    }

    //Metodo publico para eliminar un usuario 
    public boolean eliminar(int idTipoRol) {
        try {
            String sql = DELETE + Integer.toString(idTipoRol);
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
    public boolean actualizar(tipoRolModel objTipoRol) {
        try {
            //Obtenermos la conexion
            connection = con.getConnection();
            //Preparamos la consulta
            PreparedStatement statement = connection.prepareStatement(UPDATE);

            //Asignamos los valores a los campos de la consulta sql
            statement.setString(1, objTipoRol.getDescripcionPuesto());
            statement.setInt(2, objTipoRol.getIdTipoRol());
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
