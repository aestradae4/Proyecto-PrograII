package com.candysrouse.DAO;

import com.candysrouse.Conexion.Conexion;
import com.candysrouse.Model.tipoPersonaModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class candyApiTipoPersonaDAO {
    //Variable de conexión

    Connection connection;
    //Instanciamos nuevo objeto de tipo Conexión en base a la clase "Conexion"
    Conexion con = new Conexion();

    //Variables de resultado de consulta en DB
    ResultSet rs;
    int resultado;
    boolean res;

    //Declaracion de variables de objeto 
    int idTipoPersona;
    String nombreTipoPersona;

    //Declaracion de consultas
    String INSERT = "INSERT INTO gearsgtc_java_panaderia.tblTipoPersona VALUES(NULL, ?)";
    //Consulta SELECT para obtener todos los usuarios
    String SELECT = "SELECT * FROM gearsgtc_java_panaderia.tblTipoPersona";
    String selectById = "SELECT * FROM gearsgtc_java_panaderia.tblTipoPersona where idTipoPersona = ";
    //Consulta DELETE para eliminar un registro en especifico de la DB
    String DELETE = "DELETE FROM gearsgtc_java_panaderia.tblTipoPersona where idTipoPersona = ";
    //Consulta UPDATE para actualizar datos de un registro en especifico
    String UPDATE = "UPDATE gearsgtc_java_panaderia.tblTipoPersona SET  nombreTipoPersona = ? WHERE idTipoPersona = ?";

    //Definicion de metodos CRUD
    public boolean agregar(tipoPersonaModel objTP) {
        try {
            //Obtenermos la conexion
            connection = con.getConnection();
            //Preparamos la consulta
            PreparedStatement statement = connection.prepareStatement(INSERT);

            //Asignamos los valores a los campos de la consulta sql 
            //statement.setInt(1, objEmpleado.getIdEmpleado()); 
            statement.setString(1, objTP.getNombreTipoPersona());
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
    public List<tipoPersonaModel> obtenerTodos() {
        //Creamos la lista del tipo de objeto correspondiente que almacena los registros
        List<tipoPersonaModel> listaTipoPersona = new ArrayList<tipoPersonaModel>();

        try {
            String sql = SELECT;
            connection = con.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.execute();
            rs = statement.executeQuery(sql);
            res = true;

            if (res) {
                while (rs.next()) {
                    idTipoPersona = rs.getInt("idTipoPersona"); 
                    nombreTipoPersona = rs.getString("nombreTipoPersona");  

                    //Creacion de objeto de tipo Empleado
                    tipoPersonaModel proveedor = new tipoPersonaModel(idTipoPersona, nombreTipoPersona);
                    //Agregamos el objeto a nuestra lista de objetos
                    listaTipoPersona.add(proveedor);

                }
            }
            //Cerramos la conexion a la base de datos 
            connection.close();
            //Retornamos la lista de registros
            return listaTipoPersona;

        } catch (SQLException ex) {
            return listaTipoPersona;
        }
    }

    //Obtener un usuario en especifico mediante su ID
    public tipoPersonaModel obtenerUnTipoPer(int idTipoPersona) {

        //Creacion de nuestro objeto 
        tipoPersonaModel tipoPer;
        try {
            String sql = selectById + Integer.toString(idTipoPersona);
            connection = con.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.execute();
            rs = statement.executeQuery(sql);

            res = true;

            if (res) {
                while (rs.next()) {
                 idTipoPersona = rs.getInt("idTipoPersona"); 
                 nombreTipoPersona = rs.getString("nombreTipoPersona"); 
                }
            }

            connection.close();
        } catch (SQLException e) {
            return null;
        }
        //Creacion de objeto de tipo empleadoModel
        tipoPersonaModel tipoPerByid = new tipoPersonaModel(idTipoPersona, nombreTipoPersona);
        return tipoPerByid;
    }

    //Metodo publico para eliminar un usuario 
    public boolean eliminar(int idTipoPersona) {
        try {
            String sql = DELETE + Integer.toString(idTipoPersona);
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
    public boolean actualizar(tipoPersonaModel objTP) {
        try {
            //Obtenermos la conexion
            connection = con.getConnection();
            //Preparamos la consulta
            PreparedStatement statement = connection.prepareStatement(UPDATE);

            //Asignamos los valores a los campos de la consulta sql 
             
            statement.setString(1, objTP.getNombreTipoPersona());
            statement.setInt(2, objTP.getIdTipoPersona());
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
