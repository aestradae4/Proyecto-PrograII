
package com.candysrouse.DAO;

import com.candysrouse.Conexion.Conexion;
import com.candysrouse.Model.detalleFacturaModel;
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
public class candyApiDetalleFacturaDAO {
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
    int idDetalleFactura; 
    int idFactura;
    int idProducto;
    int cantidad;

    //Declaracion de consultas
    String INSERT = "INSERT INTO gearsgtc_java_panaderia.tblDetalleFactura VALUES(NULL, ?, ?, ?)";
    //Consulta SELECT para obtener todos los registros
    String SELECT = "SELECT * FROM gearsgtc_java_panaderia.tblDetalleFactura";
    String selectById = "SELECT * FROM gearsgtc_java_panaderia.tblDetalleFactura where idDetalleFactura = ";
    //Consulta DELETE para eliminar un registro en especifico de la DB
    String DELETE = "DELETE FROM gearsgtc_java_panaderia.tblDetalleFactura where idDetalleFactura = ";
    //Consulta UPDATE para actualizar datos de un registro en especifico
    String UPDATE = "UPDATE gearsgtc_java_panaderia.tblDetalleFactura SET idFactura = ?, idProducto = ?, cantidad = ?  WHERE idDetalleFactura = ?";

    //Definicion de metodos CRUD
    public boolean agregarDAO(detalleFacturaModel objTable) {
        try {
            //Obtenermos la conexio de la tabla
            connection = con.getConnection();
            //Preparamos la consulta
            PreparedStatement statement = connection.prepareStatement(INSERT);

            //Asignamos los valores a los campos de la consulta sql 
            
            statement.setInt(1, objTable.getIdFactura());
            statement.setInt(2, objTable.getIdProducto());
            statement.setInt(3, objTable.getCantidad());
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
    public List<detalleFacturaModel> obtenerTodosDAO() {
        //Creamos la lista del tipo de objeto correspondiente que almacena los registros
        List<detalleFacturaModel> listaTodos = new ArrayList<detalleFacturaModel>();

        try {
            String sql = SELECT;
            connection = con.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.execute();
            rs = statement.executeQuery(sql);
            res = true;

            if (res) {
                while (rs.next()) {
                    idDetalleFactura = rs.getInt("idDetalleFactura");
                    idFactura = rs.getInt("idFactura");
                    idProducto = rs.getInt("idProducto");
                    cantidad = rs.getInt("cantidad");

                    //Creacion de objeto de detalleFactura
                    detalleFacturaModel objModel = new detalleFacturaModel(idDetalleFactura, idFactura, idProducto, cantidad);
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
    public detalleFacturaModel obtenerRegistroDAO(int idDetalleFactura) {

        //Creacion de nuestro objeto 
        detalleFacturaModel objModel;
        try {
            String sql = selectById + Integer.toString(idDetalleFactura);
            connection = con.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.execute();
            rs = statement.executeQuery(sql);

            res = true;

            if (res) {
                while (rs.next()) {
                    idDetalleFactura = rs.getInt("idDetalleFactura");
                    idFactura = rs.getInt("idFactura");
                    idProducto = rs.getInt("idProducto");
                    cantidad = rs.getInt("cantidad");
                }
            }

            connection.close();
        } catch (SQLException e) {
            return null;
        }
        //Creacion de objeto de tipo detalleFacturaModel
        detalleFacturaModel objModelByid = new detalleFacturaModel(idDetalleFactura, idFactura, idProducto, cantidad);
        return objModelByid;
    }

    //Metodo publico para eliminar un Registro
    public boolean eliminarDAO(int idDetalleFactura) {
        try {
            String sql = DELETE + Integer.toString(idDetalleFactura);
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
    public boolean actualizarDAO(detalleFacturaModel objTable) {
        try {
            //Obtenermos la conexion
            connection = con.getConnection();
            //Preparamos la consulta
            PreparedStatement statement = connection.prepareStatement(UPDATE);

            //Asignamos los valores a los campos de la consulta sql 
             
            statement.setInt(1, objTable.getIdFactura());
            statement.setInt(2, objTable.getIdProducto());
            statement.setInt(3, objTable.getCantidad());
            statement.setInt(4, objTable.getIdDetalleFactura());
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
