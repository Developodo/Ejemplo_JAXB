package edu.carlosserrano.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name="agenda")
@XmlAccessorType(XmlAccessType.FIELD)
public class Agenda implements Serializable {
    @Serial
    private static final long serialVersionUID=1L;

    @XmlElement(name="user")
    private List<User> users;

    public Agenda() {
        users=new ArrayList<>();
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
    public boolean addUser(User u){
        return this.users.add(u);
    }

    @Override
    public String toString() {
        return "Agenda{" +
                "users=" + users +
                '}';
    }
}
