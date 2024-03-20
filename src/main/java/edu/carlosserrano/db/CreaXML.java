package edu.carlosserrano.db;

import edu.carlosserrano.dataaccess.XMLManager;

public class CreaXML {
    public static void main(String[] args) {
        Conexion c=new Conexion("localhost","root","root","demojava");
        XMLManager.writeXML(c,"conexion.xml");
    }
}
