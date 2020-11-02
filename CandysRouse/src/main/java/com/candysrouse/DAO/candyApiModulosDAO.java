package com.candysrouse.DAO;

import com.candysrouse.Conexion.Conexion;
import com.candysrouse.Model.modulosModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class candyApiModulosDAO {
    //Variable de conexión

    Connection connection;
    //Instanciamos nuevo objeto de tipo Conexión en base a la clase "Conexion"
    Conexion con = new Conexion();

    //Variables de resultado de consulta en DB
    ResultSet rs;
    int resultado;
    boolean res;

    //Declaracion de variables de objeto 
    int idModulo;
    String nombreModulo;

    //Declaracion de consultas
    String INSERT = "INSERT INTO gearsgtc_java_panaderia.tblModulos VALUES(NULL, ?)";
    //Consulta SELECT para obtener todos los usuarios
    String SELECT = "SELECT * FROM gearsgtc_java_panaderia.tblModulos";
    String selectById = "SELECT * FROM gearsgtc_java_panaderia.tblModulos where idModulo = ";
    //Consulta DELETE para eliminar un registro en especifico de la DB
    String DELETE = "DELETE FROM gearsgtc_java_panaderia.tblModulos where idModulo = ";
    //Consulta UPDATE para actualizar datos de un registro en especifico
    String UPDATE = "UPDATE gearsgtc_java_panaderia.tblModulos SET nombreModulo = ? WHERE idModulo = ?";

    //Definicion de metodos CRUD
    public boolean agregar(modulosModel objmodulo) {
        try {
            //Obtenermos la conexion
            connection = con.getConnection();
            //Preparamos la consulta
            PreparedStatement statement = connection.prepareStatement(INSERT);

            //Asignamos los valores a los campos de la consulta sql 
            statement.setString(1, objmodulo.getNombreModulo());
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
    public List<modulosModel> obtenerTodos() {
        //Creamos la lista del tipo de objeto correspondiente que almacena los registros
        List<modulosModel> listaModulos = new ArrayList<modulosModel>();

        try {
            String sql = SELECT;
            connection = con.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.execute();
            rs = statement.executeQuery(sql);
            res = true;

            if (res) {
                while (rs.next()) {
                    idModulo = rs.getInt("idModulo");
                    nombreModulo = rs.getString("nombreModulo");

                    //Creacion de objeto de tipo Empleado
                    modulosModel tipoRol = new modulosModel(idModulo, nombreModulo);
                    //Agregamos el objeto a nuestra lista de objetos
                    listaModulos.add(tipoRol);

                }
            }
            //Cerramos la conexion a la base de datos 
            connection.close();
            //Retornamos la lista de registros
            return listaModulos;

        } catch (SQLException ex) {
            return listaModulos;
        }
    }

    //Obtener un usuario en especifico mediante su ID
    public modulosModel obtenerUnModulo(int idModulo) {

        //Creacion de nuestro objeto 
        modulosModel tipoRolGeneral;
        try {
            String sql = selectById + Integer.toString(idModulo);
            connection = con.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.execute();
            rs = statement.executeQuery(sql);

            res = true;

            if (res) {
                while (rs.next()) {
                    idModulo = rs.getInt("idModulo");
                    nombreModulo = rs.getString("nombreModulo");
                }
            }

            connection.close();
        } catch (SQLException e) {
            return null;
        }
        //Creacion de objeto de tipo empleadoModel
        modulosModel moduloByid = new modulosModel(idModulo, nombreModulo);
        return moduloByid;
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
    public boolean actualizar(modulosModel objmodulo) {
        try {
            //Obtenermos la conexion
            connection = con.getConnection();
            //Preparamos la consulta
            PreparedStatement statement = connection.prepareStatement(UPDATE);

            //Asignamos los valores a los campos de la consulta sql
            statement.setString(1, objmodulo.getNombreModulo());
            statement.setInt(2, objmodulo.getIdModulo());
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
