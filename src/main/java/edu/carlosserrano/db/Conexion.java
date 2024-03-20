package edu.carlosserrano.db;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="conexion")
@XmlAccessorType(XmlAccessType.FIELD)
public class Conexion {
    private String url;
    private String user;
    private String pass;
    private String dbname;

    public Conexion(String url, String user, String pass, String dbname) {
        this.url = url;
        this.user = user;
        this.pass = pass;
        this.dbname = dbname;
    }

    public Conexion() {
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getDbname() {
        return dbname;
    }

    public void setDbname(String dbname) {
        this.dbname = dbname;
    }

    @Override
    public String toString() {
        return "Conexion{" +
                "url='" + url + '\'' +
                ", user='" + user + '\'' +
                ", pass='" + pass + '\'' +
                ", dbname='" + dbname + '\'' +
                '}';
    }
}
