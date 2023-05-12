package com.univercity.oopjava.practice.task9.version1;

import java.io.Serializable;
import java.util.Arrays;

public class ReaderV1 implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private String surname;
    private Integer regNum;
    private BookV1[] books;

    public ReaderV1() {
    }

    public ReaderV1(String name, String surname, Integer regNum, BookV1[] books) {
        this.name = name;
        this.surname = surname;
        this.regNum = regNum;
        this.books = books;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getRegNum() {
        return regNum;
    }

    public void setRegNum(Integer regNum) {
        this.regNum = regNum;
    }

    public BookV1[] getBooks() {
        return books;
    }

    public void setBooks(BookV1[] books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", regNum=" + regNum +
                ", books=" + Arrays.toString(books) +
                "}\n";
    }
}
