package com.univercity.oopjava.practice.task9.version3;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Arrays;

public class LibraryV3 implements Externalizable {
    private static final long serialVersionUID = 1L;

    private String name;
    private BookV3[] books;
    private ReaderV3[] readers;

    public LibraryV3() {
    }

    public LibraryV3(String name, BookV3[] books, ReaderV3[] readers) {
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

    public BookV3[] getBooks() {
        return books;
    }

    public void setBooks(BookV3[] books) {
        this.books = books;
    }

    public ReaderV3[] getReaders() {
        return readers;
    }

    public void setReaders(ReaderV3[] readers) {
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

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(name);
        out.writeObject(books);
        out.writeObject(readers);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = (String) in.readObject();
        books = (BookV3[]) in.readObject();
        readers = (ReaderV3[]) in.readObject();
    }
}
