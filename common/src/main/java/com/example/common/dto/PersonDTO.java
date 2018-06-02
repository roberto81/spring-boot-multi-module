package com.example.common.dto;

import java.util.Objects;

public class PersonDTO {

    private Long userID;
    private String username;
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
        PersonDTO personDTO = (PersonDTO) o;
        return Objects.equals(userID, personDTO.userID) &&
                Objects.equals(username, personDTO.username) &&
                Objects.equals(passwrd, personDTO.passwrd);
    }

    @Override
    public int hashCode() {

        return Objects.hash(userID, username, passwrd);
    }

    @Override
    public String toString() {
        return "PersonDTO{" +
                "userID=" + userID +
                ", username='" + username + '\'' +
                ", passwrd='" + passwrd + '\'' +
                '}';
    }
}
