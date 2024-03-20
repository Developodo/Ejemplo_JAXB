package edu.carlosserrano.db;

import edu.carlosserrano.dataaccess.XMLManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Ejemplo {
    public static void main(String[] args) {
        Conexion c = XMLManager.readXML(new Conexion(),"conexion.xml");
        //ya tenemos los parámetros de conexión
        String url="jdbc:mariadb://"+c.getUrl()+"/"+c.getDbname();
        try (Connection conn = DriverManager.getConnection(url,c.getUser(),c.getPass())){
            System.out.println("OK conectado a "+c.getUrl());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
