package com.univercity.oopjava.practice.task9.version1;

import java.io.Serializable;
import java.util.Arrays;

public class BookV1 implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private Integer year;
    private Integer number;
    private AuthorV1[] authors;

    public BookV1() {
    }

    public BookV1(String name, Integer year, Integer number, AuthorV1[] authors) {
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

    public AuthorV1[] getAuthors() {
        return authors;
    }

    public void setAuthors(AuthorV1[] authors) {
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
}
