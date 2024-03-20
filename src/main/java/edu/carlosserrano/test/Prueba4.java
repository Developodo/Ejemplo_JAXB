package edu.carlosserrano.test;

import edu.carlosserrano.model.Agenda_Singleton;
import edu.carlosserrano.model.User;

public class Prueba4 {
    public static void main(String[] args) {
        Agenda_Singleton agenda=Agenda_Singleton.getInstance();
        agenda.addUser(new User(3L,"Marta","m@g.com"));
    }
}
