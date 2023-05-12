package com.univercity.oopjava.practice.task9.version2;

import java.io.Serializable;

public class AuthorV2 implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private String surname;

    public AuthorV2() {
    }

    public AuthorV2(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
