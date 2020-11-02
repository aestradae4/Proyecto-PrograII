
package com.candysrouse.DAO;

import com.candysrouse.Conexion.Conexion;
import com.candysrouse.Model.empresaModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Maria de los Angeles Carranza Del Cid
 */
public class candyApiEmpresaDAO {
    
    //Variable de conexión
    Connection connection;
    //Instanciamos nuevo objeto de tipo Conexión en base a la clase "Conexion"
    Conexion con = new Conexion();

    //Variables de resultado de consulta en DB
    ResultSet rs;
    int resultado;
    boolean res;

    //Declaracion de variables de objeto 
    int idEmpresa;
    int nitEmpresa;
    int telefonoEmpresa;
    String direccionEmpresa;
    int idDatosGenerales;


    //Declaracion de consultas
    String INSERT = "INSERT INTO gearsgtc_java_panaderia.tblEmpresa VALUES(NULL, ?, ?, ?, ?)";
    //Consulta SELECT para obtener todos los registros
    String SELECT = "SELECT * FROM gearsgtc_java_panaderia.tblEmpresa";
    String selectById = "SELECT * FROM gearsgtc_java_panaderia.tblEmpresa where idEmpresa = ";
    //Consulta DELETE para eliminar un registro en especifico de la DB
    String DELETE = "DELETE FROM gearsgtc_java_panaderia.tblEmpresa where idEmpresa = ";
    //Consulta UPDATE para actualizar datos de un registro en especifico
    //Se realizo prueba del update
    String UPDATE = "UPDATE gearsgtc_java_panaderia.tblEmpresa SET nitEmpresa = ?, telefonoEmpresa = ?, direccionEmpresa = ?, idDatosGenerales = ? WHERE idEmpresa = ?";

    //Definicion de metodos CRUD
    public boolean agregar(empresaModel objEmpresa) {
        try {
            //Obtenermos la conexion
            connection = con.getConnection();
            //Preparamos la consulta
            PreparedStatement statement = connection.prepareStatement(INSERT);

            //Asignamos los valores a los campos de la consulta sql 
            //statement.setInt(1, objEmpleado.getIdEmpleado()); 
            statement.setInt(1, objEmpresa.getNitEmpresa());
            statement.setInt(2, objEmpresa.getTelefonoEmpresa());
            statement.setString(3, objEmpresa.getDireccionEmpresa());
            statement.setInt(4, objEmpresa.getIdDatosGenerales());
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
    public List<empresaModel> obtenerTodos() {
        //Creamos la lista del tipo de objeto correspondiente que almacena los registros
        List<empresaModel> listaEmpresa = new ArrayList<empresaModel>();

        try {
            String sql = SELECT;
            connection = con.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.execute();
            rs = statement.executeQuery(sql);
            res = true;

            if (res) {
                while (rs.next()) {
                    idEmpresa = rs.getInt("idEmpresa");
                    nitEmpresa = rs.getInt("nitEmpresa");
                    telefonoEmpresa = rs.getInt("telefonoEmpresa");
                    direccionEmpresa = rs.getString("direccionEmpresa"); 
                    idDatosGenerales = rs.getInt("idDatosGenerales");

                    //Creacion de objeto de Empresa
                    empresaModel empresa = new empresaModel(idEmpresa, nitEmpresa, telefonoEmpresa, direccionEmpresa, idDatosGenerales);
                    //Agregamos el objeto a nuestra lista de objetos
                    listaEmpresa.add(empresa);

                }
            }
            //Cerramos la conexion a la base de datos 
            connection.close();
            //Retornamos la lista de registros
            return listaEmpresa;

        } catch (SQLException ex) {
            return listaEmpresa;
        }
    }

    //Obtener un registro en especifico mediante su ID
    public empresaModel obtenerUnaEmpresa(int idEmpresa) {

        //Creacion de nuestro objeto 
        empresaModel ObjEmpresaModel;
        try {
            String sql = selectById + Integer.toString(idEmpresa);
            connection = con.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.execute();
            rs = statement.executeQuery(sql);

            res = true;

            if (res) {
                while (rs.next()) {
                    idEmpresa = rs.getInt("idEmpresa");
                    nitEmpresa = rs.getInt("nitEmpresa");
                    telefonoEmpresa = rs.getInt("telefonoEmpresa");
                    direccionEmpresa = rs.getString("direccionEmpresa"); 
                    idDatosGenerales = rs.getInt("idDatosGenerales");
                }
            }

            connection.close();
        } catch (SQLException e) {
            return null;
        }
        //Creacion de objeto de empresaModel
        empresaModel empresaByid = new empresaModel(idEmpresa, nitEmpresa, telefonoEmpresa, direccionEmpresa, idDatosGenerales);
        return empresaByid;
    }

    //Metodo publico para eliminar un registro 
    public boolean eliminar(int idEmpresa) {
        try {
            String sql = DELETE + Integer.toString(idEmpresa);
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

    //Metodo publico paraa actualizar un registro
    public boolean actualizar(empresaModel objEmpresa) {
        try {
            //Obtenermos la conexion
            connection = con.getConnection();
            //Preparamos la consulta
            PreparedStatement statement = connection.prepareStatement(UPDATE);

            //Asignamos los valores a los campos de la consulta sql 
            statement.setInt(1, objEmpresa.getNitEmpresa());
            statement.setInt(2, objEmpresa.getTelefonoEmpresa());
            statement.setString(3, objEmpresa.getDireccionEmpresa());
            statement.setInt(4, objEmpresa.getIdDatosGenerales());
            statement.setInt(5, objEmpresa.getIdEmpresa());
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