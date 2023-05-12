package com.univercity.oopjava.practice.task9.version3;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Arrays;

public class BookV3 implements Externalizable {
    private static final long serialVersionUID = 1L;

    private String name;
    private Integer year;
    private Integer number;
    private AuthorV3[] authors;

    public BookV3() {
    }

    public BookV3(String name, Integer year, Integer number, AuthorV3[] authors) {
        this.name = name;
        this.year = year;
        this.number = number;
        this.authors = authors;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public AuthorV3[] getAuthors() {
        return authors;
    }

    public void setAuthors(AuthorV3[] authors) {
        this.authors = authors;
    }


    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", number=" + number +
                ", authors=" + Arrays.toString(authors) +
                "}\n";
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(name);
        out.writeObject(year);
        out.writeObject(number);
        out.writeObject(authors);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = (String) in.readObject();
        year = (Integer) in.readObject();
        number = (Integer) in.readObject();
        authors = (AuthorV3[]) in.readObject();

    }
}
