package edu.carlosserrano.test;

import edu.carlosserrano.model.Agenda_Singleton;

public class Prueba3 {
    public static void main(String[] args) {
        Agenda_Singleton agenda=Agenda_Singleton.getInstance();
        System.out.println(agenda);
    }
}
