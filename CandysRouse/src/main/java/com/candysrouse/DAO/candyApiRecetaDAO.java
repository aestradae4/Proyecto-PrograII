package com.candysrouse.DAO;

import com.candysrouse.Conexion.Conexion;
import com.candysrouse.Model.recetaModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class candyApiRecetaDAO {

    //Variable de conexión
    Connection connection;
    //Instanciamos nuevo objeto de tipo Conexión en base a la clase "Conexion"
    Conexion con = new Conexion();

    //Variables de resultado de consulta en DB
    ResultSet rs;
    int resultado;
    boolean res;

    //Declaracion de variables de objeto 
    int idReceta;
    String nombreReceta;

    //Declaracion de consultas
    String INSERT = "INSERT INTO gearsgtc_java_panaderia.tblReceta VALUES(NULL, ?)";
    //Consulta SELECT para obtener todos los usuarios
    String SELECT = "SELECT * FROM gearsgtc_java_panaderia.tblReceta";
    String selectById = "SELECT * FROM gearsgtc_java_panaderia.tblReceta where idReceta = ";
    //Consulta DELETE para eliminar un registro en especifico de la DB
    String DELETE = "DELETE FROM gearsgtc_java_panaderia.tblReceta where idReceta = ";
    //Consulta UPDATE para actualizar datos de un registro en especifico
    String UPDATE = "UPDATE gearsgtc_java_panaderia.tblReceta SET nombreReceta = ? WHERE idReceta = ?";

    //Definicion de metodos CRUD
    public boolean agregar(recetaModel objreceta) {
        try {
            //Obtenermos la conexion
            connection = con.getConnection();
            //Preparamos la consulta
            PreparedStatement statement = connection.prepareStatement(INSERT);

            //Asignamos los valores a los campos de la consulta sql 
            statement.setString(1, objreceta.getNombreReceta());
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
    public List<recetaModel> obtenerTodos() {
        //Creamos la lista del tipo de objeto correspondiente que almacena los registros
        List<recetaModel> listaReceta = new ArrayList<recetaModel>();

        try {
            String sql = SELECT;
            connection = con.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.execute();
            rs = statement.executeQuery(sql);
            res = true;

            if (res) {
                while (rs.next()) {
                    idReceta = rs.getInt("idReceta");
                    nombreReceta = rs.getString("nombreReceta");

                    //Creacion de objeto de tipo Empleado
                    recetaModel receta = new recetaModel(idReceta, nombreReceta);
                    //Agregamos el objeto a nuestra lista de objetos
                    listaReceta.add(receta);

                }
            }
            //Cerramos la conexion a la base de datos 
            connection.close();
            //Retornamos la lista de registros
            return listaReceta;

        } catch (SQLException ex) {
            return listaReceta;
        }
    }

    //Obtener un usuario en especifico mediante su ID
    public recetaModel obtenerUnaReceta(int idReceta) {

        //Creacion de nuestro objeto 
        recetaModel tipoRolGeneral;
        try {
            String sql = selectById + Integer.toString(idReceta);
            connection = con.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.execute();
            rs = statement.executeQuery(sql);

            res = true;

            if (res) {
                while (rs.next()) {
                    idReceta = rs.getInt("idReceta");
                    nombreReceta = rs.getString("nombreReceta");
                }
            }

            connection.close();
        } catch (SQLException e) {
            return null;
        }
        //Creacion de objeto de tipo empleadoModel
        recetaModel recetaByid = new recetaModel(idReceta, nombreReceta);
        return recetaByid;
    }

    //Metodo publico para eliminar un usuario 
    public boolean eliminar(int idReceta) {
        try {
            String sql = DELETE + Integer.toString(idReceta);
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
    public boolean actualizar(recetaModel objreceta) {
        try {
            //Obtenermos la conexion
            connection = con.getConnection();
            //Preparamos la consulta
            PreparedStatement statement = connection.prepareStatement(UPDATE);

            //Asignamos los valores a los campos de la consulta sql
            statement.setString(1, objreceta.getNombreReceta());
            statement.setInt(2, objreceta.getIdReceta());
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
