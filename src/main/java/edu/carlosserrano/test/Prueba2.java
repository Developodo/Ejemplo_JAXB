package edu.carlosserrano.test;

import edu.carlosserrano.dataaccess.XMLManager;
import edu.carlosserrano.model.Agenda;
import edu.carlosserrano.model.User;

public class Prueba2 {
    public static void main(String[] args) {
        Agenda agenda=new Agenda();
        agenda.addUser(new User(1L,"Carlos","c@g.com"));
        agenda.addUser(new User(2L,"Eva","e@g.com"));
        XMLManager.writeXML(agenda,"agenda.xml");
    }
}
