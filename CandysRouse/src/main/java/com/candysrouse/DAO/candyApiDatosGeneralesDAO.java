package com.candysrouse.DAO;

import com.candysrouse.Conexion.Conexion;
import com.candysrouse.Model.datoGeneralesModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class candyApiDatosGeneralesDAO {
    //Variable de conexión
    Connection connection;
    //Instanciamos nuevo objeto de tipo Conexión en base a la clase "Conexion"
    Conexion con = new Conexion();

    //Variables de resultado de consulta en DB
    ResultSet rs;
    int resultado;
    boolean res;

    //Declaracion de variables de objeto 
    int idDatosGenerales;
    int dpi;
    int nit;
    String correo;
    String nombre;
    String apellido;
    String direccion;
    String telefono;
    String fechaRegistro;
    int registroActivo;
    int idTipoPersona;

    //Declaracion de consultas
    String INSERT = "INSERT INTO gearsgtc_java_panaderia.tblDatosGenerales VALUES(NULL, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    //Consulta SELECT para obtener todos los usuarios
    String SELECT = "SELECT * FROM gearsgtc_java_panaderia.tblDatosGenerales";
    String selectById = "SELECT * FROM gearsgtc_java_panaderia.tblDatosGenerales where idDatosGenerales = ";
    //Consulta DELETE para eliminar un registro en especifico de la DB
    String DELETE = "DELETE FROM gearsgtc_java_panaderia.tblDatosGenerales where idDatosGenerales = ";
    //Consulta UPDATE para actualizar datos de un registro en especifico
    //Se realizo prueba del update
    String UPDATE = "UPDATE gearsgtc_java_panaderia.tblDatosGenerales SET dpi = ?, nit = ?, correo = ?,"
            + " nombre = ?, apellido = ?, direccion = ?, telefono = ?, fechaRegistro = ?,"
            + " registroActivo = ?, idTipoPersona = ?  WHERE idDatosGenerales = ?";

    //Definicion de metodos CRUD
    public boolean agregar(datoGeneralesModel objdatoGeneral) {
        try {
            //Obtenermos la conexion
            connection = con.getConnection();
            //Preparamos la consulta
            PreparedStatement statement = connection.prepareStatement(INSERT);

            //Asignamos los valores a los campos de la consulta sql 
            //statement.setInt(1, objEmpleado.getIdEmpleado()); 
            statement.setInt(1, objdatoGeneral.getDpi());
            statement.setInt(2, objdatoGeneral.getNit());
            statement.setString(3, objdatoGeneral.getCorreo());
            statement.setString(4, objdatoGeneral.getNombre());
            statement.setString(5, objdatoGeneral.getApellido());
            statement.setString(6, objdatoGeneral.getDireccion());
            statement.setString(7, objdatoGeneral.getTelefono());
            statement.setString(8, objdatoGeneral.getFechaRegistro());
            statement.setInt(9, objdatoGeneral.getRegistroActivo());
            statement.setInt(10, objdatoGeneral.getIdTipoPersona());
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
    public List<datoGeneralesModel> obtenerTodos() {
        //Creamos la lista del tipo de objeto correspondiente que almacena los registros
        List<datoGeneralesModel> listaDatosGenerales = new ArrayList<datoGeneralesModel>();

        try {
            String sql = SELECT;
            connection = con.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.execute();
            rs = statement.executeQuery(sql);
            res = true;

            if (res) {
                while (rs.next()) {
                    idDatosGenerales = rs.getInt("idDatosGenerales");
                    dpi = rs.getInt("dpi");
                    nit = rs.getInt("nit");
                    correo = rs.getString("correo"); 
                    nombre = rs.getString("nombre");
                    apellido = rs.getString("apellido");
                    direccion = rs.getString("direccion");
                    telefono = rs.getString("telefono");
                    fechaRegistro = rs.getString("fechaRegistro");
                    registroActivo = rs.getInt("registroActivo");
                    idTipoPersona = rs.getInt("idTipoPersona");

                    //Creacion de objeto de tipo Empleado
                    datoGeneralesModel datosGenerales = new datoGeneralesModel(idDatosGenerales, dpi, nit, correo, nombre, apellido, direccion, telefono, fechaRegistro, registroActivo, idTipoPersona);
                    //Agregamos el objeto a nuestra lista de objetos
                    listaDatosGenerales.add(datosGenerales);

                }
            }
            //Cerramos la conexion a la base de datos 
            connection.close();
            //Retornamos la lista de registros
            return listaDatosGenerales;

        } catch (SQLException ex) {
            return listaDatosGenerales;
        }
    }

    //Obtener un usuario en especifico mediante su ID
    public datoGeneralesModel obtenerUnDatoGeneral(int idDatosGenerales) {

        //Creacion de nuestro objeto 
        datoGeneralesModel datoGeneral;
        try {
            String sql = selectById + Integer.toString(idDatosGenerales);
            connection = con.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.execute();
            rs = statement.executeQuery(sql);

            res = true;

            if (res) {
                while (rs.next()) {
                    idDatosGenerales = rs.getInt("idDatosGenerales");
                    dpi = rs.getInt("dpi");
                    nit = rs.getInt("nit");
                    correo = rs.getString("correo"); 
                    nombre = rs.getString("nombre");
                    apellido = rs.getString("apellido");
                    direccion = rs.getString("direccion");
                    telefono = rs.getString("telefono");
                    fechaRegistro = rs.getString("fechaRegistro");
                    registroActivo = rs.getInt("registroActivo");
                    idTipoPersona = rs.getInt("idTipoPersona");
                }
            }

            connection.close();
        } catch (SQLException e) {
            return null;
        }
        //Creacion de objeto de tipo empleadoModel
        datoGeneralesModel datoGeneralByid = new datoGeneralesModel(idDatosGenerales, dpi, nit,
                correo, nombre, apellido, direccion, telefono, fechaRegistro, registroActivo, idTipoPersona);
        return datoGeneralByid;
    }

    //Metodo publico para eliminar un usuario 
    public boolean eliminar(int idDatosGenerales) {
        try {
            String sql = DELETE + Integer.toString(idDatosGenerales);
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
    public boolean actualizar(datoGeneralesModel objdatoGeneral) {
        try {
            //Obtenermos la conexion
            connection = con.getConnection();
            //Preparamos la consulta
            PreparedStatement statement = connection.prepareStatement(UPDATE);

            //Asignamos los valores a los campos de la consulta sql 
            statement.setInt(1, objdatoGeneral.getDpi());
            statement.setInt(2, objdatoGeneral.getNit());
            statement.setString(3, objdatoGeneral.getCorreo());
            statement.setString(4, objdatoGeneral.getNombre());
            statement.setString(5, objdatoGeneral.getApellido());
            statement.setString(6, objdatoGeneral.getDireccion());
            statement.setString(7, objdatoGeneral.getTelefono());
            statement.setString(8, objdatoGeneral.getFechaRegistro());
            statement.setInt(9, objdatoGeneral.getRegistroActivo());
            statement.setInt(10, objdatoGeneral.getIdTipoPersona());
            statement.setInt(11, objdatoGeneral.getIdDatosGenerales()); 
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
