package edu.carlosserrano.test;

import edu.carlosserrano.dataaccess.XMLManager;
import edu.carlosserrano.model.User;

public class Prueba1 {
    public static void main(String[] args) {
        /*User u=new User(5,"Gloria","g@g.com");
        XMLManager.writeXML(u,"user.xml");*/

        User u = XMLManager.readXML(new User(),"user.xml");
        System.out.println(u);
    }
}
