package com.univercity.oopjava.practice.task9.version2;

import java.util.Arrays;

public class BookV2 {
    private static final long serialVersionUID = 1L;

    private String name;
    private Integer year;
    private Integer number;
    private AuthorV2[] authors;

    public BookV2() {
    }

    public BookV2(String name, Integer year, Integer number, AuthorV2[] authors) {
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

    public AuthorV2[] getAuthors() {
        return authors;
    }

    public void setAuthors(AuthorV2[] authors) {
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
