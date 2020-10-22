package com.candysrouse.DAO;

import com.candysrouse.Conexion.Conexion;
import com.candysrouse.Model.empleadoModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class candyApiUsuariosDAO {
    //Variable de conexión

    Connection connection;
    //Instanciamos nuevo objeto de tipo Conexión en base a la clase "Conexion"
    Conexion con = new Conexion();

    //Variables de resultado de consulta en DB
    ResultSet rs;
    int resultado;
    boolean res;

    //Declaracion de variables de objeto 
    int idEmpleado;
    String usuario;
    String pass;
    float sueldo;
    String tipoDeContrato;
    int idDatosGenerales;
    int idTipoRol;

    //Declaracion de consultas
    String INSERT = "INSERT INTO gearsgtc_java_panaderia.tblEmpleado VALUES(NULL, ?, ?, ?, ?, ?, ?)";
    //Consulta SELECT para obtener todos los usuarios
    String SELECT = "SELECT * FROM gearsgtc_java_panaderia.tblEmpleado";
    String selectById = "SELECT * FROM gearsgtc_java_panaderia.tblEmpleado where idEmpleado = ";
    //Consulta DELETE para eliminar un registro en especifico de la DB
    String DELETE = "DELETE FROM gearsgtc_java_panaderia.tblEmpleado where idEmpleado = ";
    //Consulta UPDATE para actualizar datos de un registro en especifico
    String UPDATE = "UPDATE gearsgtc_java_panaderia.tblEmpleado SET usuario = ?, pass = ?, sueldo = ?, tipoDeContrato = ?, idDatosGenerales = ?, idTipoRol = ?  WHERE idEmpleado = ?";

    //Definicion de metodos CRUD
    public boolean agregar(empleadoModel objEmpleado) {
        try {
            //Obtenermos la conexion
            connection = con.getConnection();
            //Preparamos la consulta
            PreparedStatement statement = connection.prepareStatement(INSERT);

            //Asignamos los valores a los campos de la consulta sql 
            //statement.setInt(1, objEmpleado.getIdEmpleado()); 
            statement.setString(1, objEmpleado.getUsuario());
            statement.setString(2, objEmpleado.getPass());
            statement.setDouble(3, objEmpleado.getSueldo());
            statement.setString(4, objEmpleado.getTipoDeContrato());
            statement.setInt(5, objEmpleado.getIdDatosGenerales());
            statement.setInt(6, objEmpleado.getIdTipoRol());
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
    public List<empleadoModel> obtenerTodos() {
        //Creamos la lista del tipo de objeto correspondiente que almacena los registros
        List<empleadoModel> listaEmpleados = new ArrayList<empleadoModel>();

        try {
            String sql = SELECT;
            connection = con.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.execute();
            rs = statement.executeQuery(sql);
            res = true;

            if (res) {
                while (rs.next()) {
                    idEmpleado = rs.getInt("idEmpleado");
                    usuario = rs.getString("usuario");
                    pass = rs.getString("pass");
                    sueldo = rs.getFloat("sueldo");
                    tipoDeContrato = rs.getString("tipoDeContrato");
                    idDatosGenerales = rs.getInt("idDatosGenerales");
                    idTipoRol = rs.getInt("idTipoRol");

                    //Creacion de objeto de tipo Empleado
                    empleadoModel empleado = new empleadoModel(idEmpleado, usuario, pass, sueldo, tipoDeContrato, idDatosGenerales, idTipoRol);
                    //Agregamos el objeto a nuestra lista de objetos
                    listaEmpleados.add(empleado);

                }
            }
            //Cerramos la conexion a la base de datos 
            connection.close();
            //Retornamos la lista de registros
            return listaEmpleados;

        } catch (SQLException ex) {
            return listaEmpleados;
        }
    }

    //Obtener un usuario en especifico mediante su ID
    public empleadoModel obtenerUnEmpleado(int idEmpleado) {

        //Creacion de nuestro objeto 
        empleadoModel empleado;
        try {
            String sql = selectById + Integer.toString(idEmpleado);
            connection = con.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.execute();
            rs = statement.executeQuery(sql);

            res = true;

            if (res) {
                while (rs.next()) {
                    idEmpleado = rs.getInt("idEmpleado");
                    usuario = rs.getString("usuario");
                    pass = rs.getString("pass");
                    sueldo = rs.getFloat("sueldo");
                    tipoDeContrato = rs.getString("tipoDeContrato");
                    idDatosGenerales = rs.getInt("idDatosGenerales");
                    idTipoRol = rs.getInt("idTipoRol");
                }
            }

            connection.close();
        } catch (SQLException e) {
            return null;
        }
        //Creacion de objeto de tipo empleadoModel
        empleadoModel empleadoByid = new empleadoModel(idEmpleado, usuario, pass, sueldo, tipoDeContrato, idDatosGenerales, idTipoRol);
        return empleadoByid;
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
    public boolean actualizar(empleadoModel objEmpleado) {
        try {
            //Obtenermos la conexion
            connection = con.getConnection();
            //Preparamos la consulta
            PreparedStatement statement = connection.prepareStatement(UPDATE);

            //Asignamos los valores a los campos de la consulta sql 
             
            statement.setString(1, objEmpleado.getUsuario());
            statement.setString(2, objEmpleado.getPass());
            statement.setDouble(3, objEmpleado.getSueldo());
            statement.setString(4, objEmpleado.getTipoDeContrato());
            statement.setInt(5, objEmpleado.getIdDatosGenerales());
            statement.setInt(6, objEmpleado.getIdTipoRol());
            statement.setInt(7, objEmpleado.getIdEmpleado());
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