package com.univercity.oopjava.practice.task9.version1;

import java.io.Serializable;
import java.util.Arrays;

public class LibraryV1 implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private BookV1[] books;
    private ReaderV1[] readers;

    public LibraryV1() {
    }

    public LibraryV1(String name, BookV1[] books, ReaderV1[] readers) {
        this.name = name;
        this.books = books;
        this.readers = readers;
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

    public BookV1[] getBooks() {
        return books;
    }

    public void setBooks(BookV1[] books) {
        this.books = books;
    }

    public ReaderV1[] getReaders() {
        return readers;
    }

    public void setReaders(ReaderV1[] readers) {
        this.readers = readers;
    }

    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                ", books=" + Arrays.toString(books) +
                ", readers=" + Arrays.toString(readers) +
                '}';
    }
}
