
package com.candysrouse.DAO;

import com.candysrouse.Conexion.Conexion;
import com.candysrouse.Model.detalleCompraModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author María de los Angeles Carrana Del Cid.
 */
public class candyApiDetalleCompraDAO {
    
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
    int idDetalleCompra;
    int idCompra;
    int idMateriaPrima;
    int cantidad;

    //Declaracion de consultas
    String INSERT = "INSERT INTO gearsgtc_java_panaderia.tblDetalleCompra VALUES(NULL, ?, ?, ?)";
    //Consulta SELECT para obtener todos los registros
    String SELECT = "SELECT * FROM gearsgtc_java_panaderia.tblDetalleCompra";
    String selectById = "SELECT * FROM gearsgtc_java_panaderia.tblDetalleCompra where idDetalleCompra = ";
    //Consulta DELETE para eliminar un registro en especifico de la DB
    String DELETE = "DELETE FROM gearsgtc_java_panaderia.tblDetalleCompra where idDetalleCompra = ";
    //Consulta UPDATE para actualizar datos de un registro en especifico
    String UPDATE = "UPDATE gearsgtc_java_panaderia.tblDetalleCompra SET idCompra = ?, idMateriaPrima = ?, cantidad = ? WHERE idDetalleCompra = ?";

    //Definicion de metodos CRUD
    public boolean agregarDAO(detalleCompraModel objTable) {
        try {
            //Obtenermos la conexio de la tabla
            connection = con.getConnection();
            //Preparamos la consulta
            PreparedStatement statement = connection.prepareStatement(INSERT);

            //Asignamos los valores a los campos de la consulta sql 
            
            statement.setInt(1, objTable.getIdCompra());
            statement.setInt(2, objTable.getIdMateriaPrima());
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
    public List<detalleCompraModel> obtenerTodosDAO() {
        //Creamos la lista del tipo de objeto correspondiente que almacena los registros
        List<detalleCompraModel> listaTodos = new ArrayList<detalleCompraModel>();

        try {
            String sql = SELECT;
            connection = con.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.execute();
            rs = statement.executeQuery(sql);
            res = true;

            if (res) {
                while (rs.next()) {
                    idDetalleCompra = rs.getInt("idDetalleCompra");
                    idCompra = rs.getInt("idCompra");
                    idMateriaPrima = rs.getInt("idMateriaPrima");
                    cantidad = rs.getInt("cantidad");

                    //Creacion de objeto de detalleCompra
                    detalleCompraModel objModel = new detalleCompraModel(idDetalleCompra, idCompra, idMateriaPrima, cantidad);
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
    public detalleCompraModel obtenerRegistroDAO(int idDetalleCompra) {

        //Creacion de nuestro objeto 
        detalleCompraModel objModel;
        try {
            String sql = selectById + Integer.toString(idDetalleCompra);
            connection = con.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.execute();
            rs = statement.executeQuery(sql);

            res = true;

            if (res) {
                while (rs.next()) {
                    idDetalleCompra = rs.getInt("idDetalleCompra");
                    idCompra = rs.getInt("idCompra");
                    idMateriaPrima = rs.getInt("idMateriaPrima");
                    cantidad = rs.getInt("cantidad");
                }
            }

            connection.close();
        } catch (SQLException e) {
            return null;
        }
        //Creacion de objeto de tipo detalleCompraModel
        detalleCompraModel objModelByid = new detalleCompraModel(idDetalleCompra, idCompra, idMateriaPrima, cantidad);
        return objModelByid;
    }

    //Metodo publico para eliminar un Registro
    public boolean eliminarDAO(int idDetalleCompra) {
        try {
            String sql = DELETE + Integer.toString(idDetalleCompra);
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
    public boolean actualizarDAO(detalleCompraModel objTable) {
        try {
            //Obtenermos la conexion
            connection = con.getConnection();
            //Preparamos la consulta
            PreparedStatement statement = connection.prepareStatement(UPDATE);

            //Asignamos los valores a los campos de la consulta sql 
             
            statement.setInt(1, objTable.getIdCompra());
            statement.setInt(2, objTable.getIdMateriaPrima());
            statement.setInt(3, objTable.getCantidad());
            statement.setInt(4, objTable.getIdDetalleCompra());
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
