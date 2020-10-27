
package com.candysrouse.DAO;

import com.candysrouse.Conexion.Conexion;
import com.candysrouse.Model.detalleTipoRolModel;
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
public class candyApidetalleTipoRolDAO {
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
    int idDetalleTipoRol;
    int idTipoRol;
    int idModulo;
    boolean acceso;
    boolean lectura;
    boolean actualizacion;
    boolean eliminacion;

    //Declaracion de consultas
    String INSERT = "INSERT INTO gearsgtc_java_panaderia.tbldetalleTipoRol VALUES(NULL, ?, ?, ?, ?, ?, ?)";
    //Consulta SELECT para obtener todos los registros
    String SELECT = "SELECT * FROM gearsgtc_java_panaderia.tbldetalleTipoRol";
    String selectById = "SELECT * FROM gearsgtc_java_panaderia.tbldetalleTipoRol where idDetalleTipoRol = ";
    //Consulta DELETE para eliminar un registro en especifico de la DB
    String DELETE = "DELETE FROM gearsgtc_java_panaderia.tbldetalleTipoRol where idDetalleTipoRol = ";
    //Consulta UPDATE para actualizar datos de un registro en especifico
    String UPDATE = "UPDATE gearsgtc_java_panaderia.tbldetalleTipoRol SET idTipoRol = ?, idModulo = ?, acceso = ?, lectura = ?, actualizacion = ?, eliminacion = ?  WHERE idDetalleTipoRol = ?";

    //Definicion de metodos CRUD
    public boolean agregar(detalleTipoRolModel objTable) {
        try {
            //Obtenermos la conexio de la tabla
            connection = con.getConnection();
            //Preparamos la consulta
            PreparedStatement statement = connection.prepareStatement(INSERT);

            //Asignamos los valores a los campos de la consulta sql 
            
            statement.setInt(1, objTable.getIdTipoRol());
            statement.setInt(2, objTable.getIdModulo());
            statement.setBoolean(3, objTable.isAcceso());
            statement.setBoolean(4, objTable.isLectura());
            statement.setBoolean(5, objTable.isActualizacion());
            statement.setBoolean(6, objTable.isEliminacion());
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
    public List<detalleTipoRolModel> obtenerTodos() {
        //Creamos la lista del tipo de objeto correspondiente que almacena los registros
        List<detalleTipoRolModel> listaTodos = new ArrayList<detalleTipoRolModel>();

        try {
            String sql = SELECT;
            connection = con.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.execute();
            rs = statement.executeQuery(sql);
            res = true;

            if (res) {
                while (rs.next()) {
                    idDetalleTipoRol = rs.getInt("idDetalleTipoRol");
                    idTipoRol = rs.getInt("idTipoRol");
                    idModulo = rs.getInt("idModulo");
                    acceso = rs.getBoolean("acceso");
                    lectura = rs.getBoolean("lectura");
                    actualizacion = rs.getBoolean("actualizacion");
                    eliminacion = rs.getBoolean("eliminacion");

                    //Creacion de objeto de detalleTipoRol
                    detalleTipoRolModel objModel = new detalleTipoRolModel(idDetalleTipoRol, idTipoRol, idModulo, acceso, lectura, actualizacion, eliminacion);
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
    public detalleTipoRolModel obtenerRegistro(int idDetalleTipoRol) {

        //Creacion de nuestro objeto 
        detalleTipoRolModel objModel;
        try {
            String sql = selectById + Integer.toString(idDetalleTipoRol);
            connection = con.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.execute();
            rs = statement.executeQuery(sql);

            res = true;

            if (res) {
                while (rs.next()) {
                    idDetalleTipoRol = rs.getInt("idDetalleTipoRol");
                    idTipoRol = rs.getInt("idTipoRol");
                    idModulo = rs.getInt("idModulo");
                    acceso = rs.getBoolean("acceso");
                    lectura = rs.getBoolean("lectura");
                    actualizacion = rs.getBoolean("actualizacion");
                    eliminacion = rs.getBoolean("eliminacion");
                }
            }

            connection.close();
        } catch (SQLException e) {
            return null;
        }
        //Creacion de objeto de tipo detalleTipoRolModel
        detalleTipoRolModel objModelByid = new detalleTipoRolModel(idDetalleTipoRol, idTipoRol, idModulo, acceso, lectura, actualizacion, eliminacion);
        return objModelByid;
    }

    //Metodo publico para eliminar un Registro
    public boolean eliminar(int idDetalleTipoRol) {
        try {
            String sql = DELETE + Integer.toString(idDetalleTipoRol);
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
    public boolean actualizar(detalleTipoRolModel objTable) {
        try {
            //Obtenermos la conexion
            connection = con.getConnection();
            //Preparamos la consulta
            PreparedStatement statement = connection.prepareStatement(UPDATE);

            //Asignamos los valores a los campos de la consulta sql 
             
            statement.setInt(1, objTable.getIdTipoRol());
            statement.setInt(2, objTable.getIdModulo());
            statement.setBoolean(3, objTable.isAcceso());
            statement.setBoolean(4, objTable.isLectura());
            statement.setBoolean(5, objTable.isActualizacion());
            statement.setBoolean(6, objTable.isEliminacion());
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
