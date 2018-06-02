package com.example.jpa.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity(name = "USER")
public class Person implements Serializable{

    @Id
    @Column(name = "USER_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userID;

    @Column(name = "USERNAME")
    private String username;

    @Column(name = "PASSWORD")
    private String passwrd;

    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswrd() {
        return passwrd;
    }

    public void setPasswrd(String passwrd) {
        this.passwrd = passwrd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(userID, person.userID) &&
                Objects.equals(username, person.username) &&
                Objects.equals(passwrd, person.passwrd);
    }

    @Override
    public int hashCode() {

        return Objects.hash(userID, username, passwrd);
    }

    @Override
    public String toString() {
        return "Person{" +
                "userID=" + userID +
                ", username='" + username + '\'' +
                ", passwrd='" + passwrd + '\'' +
                '}';
    }
}
