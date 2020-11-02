package com.candysrouse.DAO;

import com.candysrouse.Conexion.Conexion;
import com.candysrouse.Model.materiaPrimaModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class candyApiMateriaPrimaDAO {
    //Variable de conexión
    Connection connection;
    //Instanciamos nuevo objeto de tipo Conexión en base a la clase "Conexion"
    Conexion con = new Conexion();

    //Variables de resultado de consulta en DB
    ResultSet rs;
    int resultado;
    boolean res;

    //Declaracion de variables de objeto 
    int idMateriaPrima;
    String nombre;
    String medida;
    int cantidad;
    int costo;

    //Declaracion de consultas
    String INSERT = "INSERT INTO gearsgtc_java_panaderia.tblMateriaPrima VALUES(NULL, ?, ?, ?, ?)";
    //Consulta SELECT para obtener todos los usuarios
    String SELECT = "SELECT * FROM gearsgtc_java_panaderia.tblMateriaPrima";
    String selectById = "SELECT * FROM gearsgtc_java_panaderia.tblMateriaPrima where idMateriaPrima = ";
    //Consulta DELETE para eliminar un registro en especifico de la DB
    String DELETE = "DELETE FROM gearsgtc_java_panaderia.tblMateriaPrima where idMateriaPrima = ";
    //Consulta UPDATE para actualizar datos de un registro en especifico
    //Se realizo prueba del update
    String UPDATE = "UPDATE gearsgtc_java_panaderia.tblMateriaPrima SET nombre = ?, medida = ?, cantidad = ?, costo = ?  WHERE idMateriaPrima = ?";

    //Definicion de metodos CRUD
    public boolean agregar(materiaPrimaModel objmateriaPrima) {
        try {
            //Obtenermos la conexion
            connection = con.getConnection();
            //Preparamos la consulta
            PreparedStatement statement = connection.prepareStatement(INSERT);

            //Asignamos los valores a los campos de la consulta sql 
            //statement.setInt(1, objEmpleado.getIdEmpleado()); 
            statement.setString(1, objmateriaPrima.getNombre());
            statement.setString(2, objmateriaPrima.getMedida());
            statement.setInt(3, objmateriaPrima.getCantidad());
            statement.setInt(4, objmateriaPrima.getCosto());
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
    public List<materiaPrimaModel> obtenerTodos() {
        //Creamos la lista del tipo de objeto correspondiente que almacena los registros
        List<materiaPrimaModel> listaMateriaPrima = new ArrayList<materiaPrimaModel>();

        try {
            String sql = SELECT;
            connection = con.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.execute();
            rs = statement.executeQuery(sql);
            res = true;

            if (res) {
                while (rs.next()) {
                    idMateriaPrima = rs.getInt("idMateriaPrima");
                    nombre = rs.getString("nombre");
                    medida = rs.getString("medida");
                    cantidad = rs.getInt("cantidad"); 
                    costo = rs.getInt("costo");


                    //Creacion de objeto de tipo Empleado
                    materiaPrimaModel materiaPrima = new materiaPrimaModel(idMateriaPrima, nombre, medida, cantidad, costo);
                    //Agregamos el objeto a nuestra lista de objetos
                    listaMateriaPrima.add(materiaPrima);

                }
            }
            //Cerramos la conexion a la base de datos 
            connection.close();
            //Retornamos la lista de registros
            return listaMateriaPrima;

        } catch (SQLException ex) {
            return listaMateriaPrima;
        }
    }

    //Obtener un usuario en especifico mediante su ID
    public materiaPrimaModel obtenerUnaMateria(int idMateriaPrima) {

        //Creacion de nuestro objeto 
        materiaPrimaModel materiaPrima;
        try {
            String sql = selectById + Integer.toString(idMateriaPrima);
            connection = con.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.execute();
            rs = statement.executeQuery(sql);

            res = true;

            if (res) {
                while (rs.next()) {
                    idMateriaPrima = rs.getInt("idMateriaPrima");
                    nombre = rs.getString("nombre");
                    medida = rs.getString("medida");
                    cantidad = rs.getInt("cantidad"); 
                    costo = rs.getInt("costo");
                }
            }

            connection.close();
        } catch (SQLException e) {
            return null;
        }
        //Creacion de objeto de tipo empleadoModel
        materiaPrimaModel materiaPrimaByid = new materiaPrimaModel(idMateriaPrima, nombre, medida, cantidad, costo);
        return materiaPrimaByid;
    }

    //Metodo publico para eliminar un usuario 
    public boolean eliminar(int idMateriaPrima) {
        try {
            String sql = DELETE + Integer.toString(idMateriaPrima);
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
    public boolean actualizar(materiaPrimaModel objmateriaPrima) {
        try {
            //Obtenermos la conexion
            connection = con.getConnection();
            //Preparamos la consulta
            PreparedStatement statement = connection.prepareStatement(UPDATE);

            //Asignamos los valores a los campos de la consulta sql 
            statement.setString(1, objmateriaPrima.getNombre());
            statement.setString(2, objmateriaPrima.getMedida());
            statement.setInt(3, objmateriaPrima.getCantidad());
            statement.setInt(4, objmateriaPrima.getCosto());
            statement.setInt(5, objmateriaPrima.getIdMateriaPrima());
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
