package com.univercity.oopjava.practice.task9.version2;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;

public class ReaderV2 implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private String surname;
    private Integer regNum;
    private transient BookV2[] books;

    public ReaderV2() {
    }

    public ReaderV2(String name, String surname, Integer regNum, BookV2[] books) {
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

    public BookV2[] getBooks() {
        return books;
    }

    public void setBooks(BookV2[] books) {
        this.books = books;
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.writeObject(name);
        out.writeObject(surname);
        out.writeObject(regNum);
        out.writeObject(books.length);
        for (int i = 0; i < books.length; i++) {
            out.writeObject(books[i].getName());
            out.writeObject(books[i].getYear());
            out.writeObject(books[i].getNumber());
            out.writeObject(books[i].getAuthors());
        }
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        name = (String) in.readObject();
        surname = (String) in.readObject();
        regNum = (Integer) in.readObject();
        int booksLength = (int) in.readObject();
        books = new BookV2[booksLength];
        for (int i = 0; i < books.length; i++) {
            books[i] = new BookV2(
                    (String) in.readObject(),
                    (Integer) in.readObject(),
                    (Integer) in.readObject(),
                    (AuthorV2[]) in.readObject()
            );
        }
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
