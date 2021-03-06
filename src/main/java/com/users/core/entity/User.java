package com.users.core.entity;

import javax.persistence.*;
//import javax.xml.bind.annotation.XmlRootElement;

import java.io.Serializable;

@Table(name = "user")
@Entity
//@XmlRootElement
//Esta anotación en para que me vaya con xml en lugar de con json
public class User implements Serializable {

    public User() {

    }

    public User(long id, String name, String lastname, String email, int movilephone) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.movilephone = movilephone;
    }

    //    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @GeneratedValue
    @Id
    @Column(name = "id")
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "lastname")
    private String lastname;
    @Column(name = "email")
    private String email;
    @Column(name = "movilephone")
    private int movilephone;

    public long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMovilephone() {
        return movilephone;
    }

    public void setMovilephone(int movilephone) {
        this.movilephone = movilephone;
    }
}
