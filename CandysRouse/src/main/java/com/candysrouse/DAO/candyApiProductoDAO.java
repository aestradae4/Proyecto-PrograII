
package com.candysrouse.DAO;

import com.candysrouse.Conexion.Conexion;
import com.candysrouse.Model.productoModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author María de los Angeles Carranza Del Cid
 */
public class candyApiProductoDAO {
   //Variable de conexión

    Connection connection;
    //Instanciamos nuevo objeto de tipo Conexión en base a la clase "Conexion"
    Conexion con = new Conexion();

    //Variables de resultado de consulta en DB
    ResultSet rs;
    int resultado;
    boolean res;

    //Declaracion de variables de objeto 
    //Variables de datos 
    int idProducto;
    int idReceta;
    String nombre;
    String descripcion;
    double existencia;
    double precio;

    //Declaracion de consultas
    String INSERT = "INSERT INTO gearsgtc_java_panaderia.tblProducto VALUES(NULL, ?, ?, ?, ?, ?)";
    //Consulta SELECT para obtener todos los registros
    String SELECT = "SELECT * FROM gearsgtc_java_panaderia.tblProducto";
    String selectById = "SELECT * FROM gearsgtc_java_panaderia.tblProducto where idProducto = ";
    //Consulta DELETE para eliminar un registro en especifico de la DB
    String DELETE = "DELETE FROM gearsgtc_java_panaderia.tblProducto where idProducto = ";
    //Consulta UPDATE para actualizar datos de un registro en especifico
    String UPDATE = "UPDATE gearsgtc_java_panaderia.tblProducto SET idReceta = ?, nombre = ?, descripcion = ?, existencia = ?, precio = ?  WHERE idProducto = ?";

    //Definicion de metodos CRUD
    public boolean agregarDAO(productoModel objProducto) {
        try {
            //Obtenermos la conexio de la tabla
            connection = con.getConnection();
            //Preparamos la consulta
            PreparedStatement statement = connection.prepareStatement(INSERT);

            //Asignamos los valores a los campos de la consulta sql 
            
            statement.setInt(1, objProducto.getIdReceta());
            statement.setString(2, objProducto.getNombre());
            statement.setString(3, objProducto.getDescripcion());
            statement.setDouble(4, objProducto.getExistencia());
            statement.setDouble(5, objProducto.getPrecio());
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
    public List<productoModel> obtenerTodosDAO() {
        //Creamos la lista del tipo de objeto correspondiente que almacena los registros
        List<productoModel> listaTodos = new ArrayList<productoModel>();

        try {
            String sql = SELECT;
            connection = con.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.execute();
            rs = statement.executeQuery(sql);
            res = true;

            if (res) {
                while (rs.next()) {
                    idProducto = rs.getInt("idProducto");
                    idReceta = rs.getInt("idReceta");
                    nombre = rs.getString("nombre");
                    descripcion = rs.getString("descripcion");
                    existencia = rs.getInt("existencia");
                    precio = rs.getInt("precio");

                    //Creacion de objeto Producto
                    productoModel objProductoModel = new productoModel(idProducto, idReceta, nombre, descripcion, existencia, precio);
                    //Agregamos el objeto a nuestra lista de objetos
                    listaTodos.add(objProductoModel);

                }
            }
            //Cerramos la conexion a la base de datos 
            connection.close();
            //Retornamos la lista de registros
            return listaTodos;

        } catch (SQLException ex) {
            return listaTodos;
        }
    }

    //Obtener un registro en especifico mediante su ID
    public productoModel obtenerRegistroDAO(int idProducto) {

        //Creacion de nuestro objeto 
        productoModel objProductoModel;
        try {
            String sql = selectById + Integer.toString(idProducto);
            connection = con.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.execute();
            rs = statement.executeQuery(sql);

            res = true;

            if (res) {
                while (rs.next()) {
                    idProducto = rs.getInt("idProducto");
                    idReceta = rs.getInt("idReceta");
                    nombre = rs.getString("nombre");
                    descripcion = rs.getString("descripcion");
                    existencia = rs.getInt("existencia");
                    precio = rs.getInt("precio");
                }
            }

            connection.close();
        } catch (SQLException e) {
            return null;
        }
        //Creacion de objeto de tipo productoModel
        productoModel objProductoModelByid = new productoModel(idProducto, idReceta, nombre, descripcion, existencia, precio);
        return objProductoModelByid;
    }

    //Metodo publico para eliminar un Registro
    public boolean eliminarDAO(int idProducto) {
        try {
            String sql = DELETE + Integer.toString(idProducto);
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

    //Metodo publico para actualizar un Registro 
    public boolean actualizarDAO(productoModel objProducto) {
        try {
            //Obtenermos la conexion
            connection = con.getConnection();
            //Preparamos la consulta
            PreparedStatement statement = connection.prepareStatement(UPDATE);

            //Asignamos los valores a los campos de la consulta sql 
             
            statement.setInt(1, objProducto.getIdReceta());
            statement.setString(2, objProducto.getNombre());
            statement.setString(3, objProducto.getDescripcion());
            statement.setDouble(4, objProducto.getExistencia());
            statement.setDouble(5, objProducto.getPrecio());
            statement.setInt(6, objProducto.getIdProducto());
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
