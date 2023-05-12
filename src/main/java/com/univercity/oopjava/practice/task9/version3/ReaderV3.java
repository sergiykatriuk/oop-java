package com.univercity.oopjava.practice.task9.version3;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Arrays;

public class ReaderV3 implements Externalizable {
    private static final long serialVersionUID = 1L;

    private String name;
    private String surname;
    private Integer regNum;
    private BookV3[] books;

    public ReaderV3() {
    }

    public ReaderV3(String name, String surname, Integer regNum, BookV3[] books) {
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

    public BookV3[] getBooks() {
        return books;
    }

    public void setBooks(BookV3[] books) {
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

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(name);
        out.writeObject(surname);
        out.writeObject(regNum);
        out.writeObject(books);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = (String) in.readObject();
        surname = (String) in.readObject();
        regNum = (Integer) in.readObject();
        books = (BookV3[]) in.readObject();
    }
}
