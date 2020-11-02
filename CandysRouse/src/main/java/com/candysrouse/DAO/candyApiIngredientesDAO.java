package com.candysrouse.DAO;

import com.candysrouse.Conexion.Conexion;
import com.candysrouse.Model.ingredientesModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class candyApiIngredientesDAO {
    //Variable de conexión
    Connection connection;
    //Instanciamos nuevo objeto de tipo Conexión en base a la clase "Conexion"
    Conexion con = new Conexion();

    //Variables de resultado de consulta en DB
    ResultSet rs;
    int resultado;
    boolean res;

    //Declaracion de variables de objeto 
    int idIngredientes;
    int idReceta;
    int idMateriaPrima;
    float cantidad;
    
    //Declaracion de consultas
    String INSERT = "INSERT INTO gearsgtc_java_panaderia.tblIngrediente VALUES(NULL, ?, ?, ?)";
    //Consulta SELECT para obtener todos los usuarios
    String SELECT = "SELECT * FROM gearsgtc_java_panaderia.tblIngrediente";
    String selectById = "SELECT * FROM gearsgtc_java_panaderia.tblIngrediente where idIngredientes = ";
    //Consulta DELETE para eliminar un registro en especifico de la DB
    String DELETE = "DELETE FROM gearsgtc_java_panaderia.tblIngrediente where idIngredientes = ";
    //Consulta UPDATE para actualizar datos de un registro en especifico
    //Se realizo prueba del update
    String UPDATE = "UPDATE gearsgtc_java_panaderia.tblIngrediente SET idReceta = ?, idMateriaPrima = ?, cantidad = ?  WHERE idIngredientes = ?";

    //Definicion de metodos CRUD
    public boolean agregar(ingredientesModel objingredientes) {
        try {
            //Obtenermos la conexion
            connection = con.getConnection();
            //Preparamos la consulta
            PreparedStatement statement = connection.prepareStatement(INSERT);

            //Asignamos los valores a los campos de la consulta sql 
            //statement.setInt(1, objEmpleado.getIdEmpleado()); 
            statement.setInt(1, objingredientes.getIdReceta());
            statement.setInt(2, objingredientes.getIdMateriaPrima());
            statement.setFloat(3, objingredientes.getCantidad());
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
    public List<ingredientesModel> obtenerTodos() {
        //Creamos la lista del tipo de objeto correspondiente que almacena los registros
        List<ingredientesModel> listaIngredientes = new ArrayList<ingredientesModel>();

        try {
            String sql = SELECT;
            connection = con.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.execute();
            rs = statement.executeQuery(sql);
            res = true;

            if (res) {
                while (rs.next()) {
                    idIngredientes = rs.getInt("idIngredientes");
                    idReceta = rs.getInt("idReceta");
                    idMateriaPrima = rs.getInt("idMateriaPrima");
                    cantidad = rs.getFloat("cantidad");


                    //Creacion de objeto de tipo Empleado
                    ingredientesModel ingredientes = new ingredientesModel(idIngredientes, idReceta, idMateriaPrima, cantidad);
                    //Agregamos el objeto a nuestra lista de objetos
                    listaIngredientes.add(ingredientes);

                }
            }
            //Cerramos la conexion a la base de datos 
            connection.close();
            //Retornamos la lista de registros
            return listaIngredientes;

        } catch (SQLException ex) {
            return listaIngredientes;
        }
    }

    //Obtener un usuario en especifico mediante su ID
    public ingredientesModel obtenerUnIngredientes(int idIngredientes) {

        //Creacion de nuestro objeto 
        ingredientesModel ingredientes;
        try {
            String sql = selectById + Integer.toString(idIngredientes);
            connection = con.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.execute();
            rs = statement.executeQuery(sql);

            res = true;

            if (res) {
                while (rs.next()) {
                    idIngredientes = rs.getInt("idIngredientes");
                    idReceta = rs.getInt("idReceta");
                    idMateriaPrima = rs.getInt("idMateriaPrima");
                    cantidad = rs.getFloat("cantidad");

                }
            }

            connection.close();
        } catch (SQLException e) {
            return null;
        }
        //Creacion de objeto de tipo empleadoModel
        ingredientesModel ingredientesByid = new ingredientesModel(idIngredientes, idReceta, idMateriaPrima, cantidad);
        return ingredientesByid;
    }

    //Metodo publico para eliminar un usuario 
    public boolean eliminar(int idIngredientes) {
        try {
            String sql = DELETE + Integer.toString(idIngredientes);
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
    public boolean actualizar(ingredientesModel objingredientes) {
        try {
            //Obtenermos la conexion
            connection = con.getConnection();
            //Preparamos la consulta
            PreparedStatement statement = connection.prepareStatement(UPDATE);

            //Asignamos los valores a los campos de la consulta sql 
            statement.setInt(1, objingredientes.getIdReceta());
            statement.setInt(2, objingredientes.getIdMateriaPrima());
            statement.setFloat(3, objingredientes.getCantidad());
            statement.setInt(4, objingredientes.getIdIngredientes());
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
