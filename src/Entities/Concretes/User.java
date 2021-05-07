package Entities.Concretes;

import Entities.Abstracts.Entity;

import java.time.LocalDate;

public class User implements Entity {
    public int id;
    public String firstName;
    public String lastName;
    public String mail;
    public String password;
    public LocalDate birthOfDay;

    public User(int id, String firstName, String lastName, String mail, String password, LocalDate birthOfDay) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mail = mail;
        this.password = password;
        this.birthOfDay = birthOfDay;
    }
}
