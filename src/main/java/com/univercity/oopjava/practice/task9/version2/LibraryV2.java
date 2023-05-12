package com.univercity.oopjava.practice.task9.version2;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;

public class LibraryV2 implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private transient BookV2[] books;
    private ReaderV2[] readers;

    public LibraryV2() {
    }

    public LibraryV2(String name, BookV2[] books, ReaderV2[] readers) {
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

    public BookV2[] getBooks() {
        return books;
    }

    public void setBooks(BookV2[] books) {
        this.books = books;
    }

    public ReaderV2[] getReaders() {
        return readers;
    }

    public void setReaders(ReaderV2[] readers) {
        this.readers = readers;
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.writeObject(name);
        out.writeObject(books.length);
        for (int i = 0; i < books.length; i++) {
            out.writeObject(books[i].getName());
            out.writeObject(books[i].getYear());
            out.writeObject(books[i].getNumber());
            out.writeObject(books[i].getAuthors());
        }
        out.writeObject(readers);
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        name = (String) in.readObject();
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
        readers = (ReaderV2[]) in.readObject();
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
