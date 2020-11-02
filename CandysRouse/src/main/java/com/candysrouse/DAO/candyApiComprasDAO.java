
package com.candysrouse.DAO;

import com.candysrouse.Conexion.Conexion;
import com.candysrouse.Model.comprasModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author María de los Angeles Carranza Del Cid.
 */
public class candyApiComprasDAO {
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
    int idCompra;
    String fecha;
    int idFormaPago;
    int idProveedor;
    

    //Declaracion de consultas
    String INSERT = "INSERT INTO gearsgtc_java_panaderia.tblCompra VALUES(NULL, ?, ?, ?)";
    //Consulta SELECT para obtener todos los registros
    String SELECT = "SELECT * FROM gearsgtc_java_panaderia.tblCompra";
    String selectById = "SELECT * FROM gearsgtc_java_panaderia.tblCompra where idCompra = ";
    //Consulta DELETE para eliminar un registro en especifico de la DB
    String DELETE = "DELETE FROM gearsgtc_java_panaderia.tblCompra where idCompra = ";
    //Consulta UPDATE para actualizar datos de un registro en especifico
    String UPDATE = "UPDATE gearsgtc_java_panaderia.tblCompra SET fecha = ?, idFormaPago = ?, idProveedor = ?  WHERE idCompra = ?";

    //Definicion de metodos CRUD
    public boolean agregarDAO(comprasModel objTable) {
        try {
            //Obtenermos la conexio de la tabla
            connection = con.getConnection();
            //Preparamos la consulta
            PreparedStatement statement = connection.prepareStatement(INSERT);

            //Asignamos los valores a los campos de la consulta sql 
            
            statement.setString(1, objTable.getFecha());
            statement.setInt(2, objTable.getIdFormaPago());
            statement.setInt(3, objTable.getIdProveedor());
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
    public List<comprasModel> obtenerTodosDAO() {
        //Creamos la lista del tipo de objeto correspondiente que almacena los registros
        List<comprasModel> listaTodos = new ArrayList<comprasModel>();

        try {
            String sql = SELECT;
            connection = con.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.execute();
            rs = statement.executeQuery(sql);
            res = true;

            if (res) {
                while (rs.next()) {
                    idCompra = rs.getInt("idCompra");
                    fecha = rs.getString("fecha");
                    idFormaPago = rs.getInt("idFormaPago");
                    idProveedor = rs.getInt("idProveedor");

                    //Creacion de objeto de compras
                    comprasModel objModel = new comprasModel(idCompra, fecha, idFormaPago,idProveedor);
                    //Agregamos el objeto a nuestra lista de objetos
                    listaTodos.add(objModel);

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
    public comprasModel obtenerRegistroDAO(int idCompra) {

        //Creacion de nuestro objeto 
        comprasModel objModel;
        try {
            String sql = selectById + Integer.toString(idCompra);
            connection = con.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.execute();
            rs = statement.executeQuery(sql);

            res = true;

            if (res) {
                while (rs.next()) {
                    idCompra = rs.getInt("idCompra");
                    fecha = rs.getString("fecha");
                    idFormaPago = rs.getInt("idFormaPago");
                    idProveedor = rs.getInt("idProveedor");

                }
            }

            connection.close();
        } catch (SQLException e) {
            return null;
        }
        //Creacion de objeto de tipo comprasModel
        comprasModel objModelByid = new comprasModel(idCompra, fecha, idFormaPago, idProveedor);
        return objModelByid;
    }

    //Metodo publico para eliminar un Registro
    public boolean eliminarDAO(int idCompra) {
        try {
            String sql = DELETE + Integer.toString(idCompra);
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
    public boolean actualizarDAO(comprasModel objTable) {
        try {
            //Obtenermos la conexion
            connection = con.getConnection();
            //Preparamos la consulta
            PreparedStatement statement = connection.prepareStatement(UPDATE);

            //Asignamos los valores a los campos de la consulta sql 
             
            statement.setString(1, objTable.getFecha());
            statement.setInt(2, objTable.getIdFormaPago());
            statement.setInt(3, objTable.getIdProveedor());
            statement.setInt(4, objTable.getIdCompra());
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
