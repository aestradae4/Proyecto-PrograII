package com.candysrouse.Conexion;

import java.sql.*;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;

public class Conexion {

    //Variable de tipo conexion 
    Connection con;
    //Variable de tipo DataSource
    BasicDataSource dataSource = null;

    //Metodo para crear la conexion; 
    DataSource getDataSource() {
        if (dataSource == null) {
            //Instanciar una nueva conexion 
            dataSource = new BasicDataSource();
            //Definicion de driver
            dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
            //Ingreso de username y password de DB 
            dataSource.setUsername("gearsgtc_javapan");
            dataSource.setPassword("d0Ok[MQ+FCSQ");
            //Ingreso de url del servidor de DB
            dataSource.setUrl("jdbc:mysql://dnzmakers.com:3306/gearsgtc_java_panaderia?useTimeZone=true&serverTimezone=UTC&autoReconnect=true&useSSL=false");
            //Tamaño inicial de conexiones
            dataSource.setInitialSize(20);
            //Indica tiempo de sincronización en segundos
            dataSource.setMaxIdle(15);
            //Número de conexiones totales
            dataSource.setMaxTotal(1);
            //Tiempo de espera de respuesta en milisegundos
            dataSource.setMaxWaitMillis(5000);
        }
        return dataSource;
    }

    //Metodo publico para obtener la conexion 
    public Connection getConnection() throws SQLException {
        return getDataSource().getConnection();
    }
}
