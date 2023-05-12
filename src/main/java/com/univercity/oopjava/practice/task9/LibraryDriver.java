package com.univercity.oopjava.practice.task9;

import com.univercity.oopjava.practice.task9.version1.AuthorV1;
import com.univercity.oopjava.practice.task9.version1.BookV1;
import com.univercity.oopjava.practice.task9.version1.LibraryV1;
import com.univercity.oopjava.practice.task9.version1.ReaderV1;
import com.univercity.oopjava.practice.task9.version2.AuthorV2;
import com.univercity.oopjava.practice.task9.version2.BookV2;
import com.univercity.oopjava.practice.task9.version2.LibraryV2;
import com.univercity.oopjava.practice.task9.version2.ReaderV2;
import com.univercity.oopjava.practice.task9.version3.AuthorV3;
import com.univercity.oopjava.practice.task9.version3.BookV3;
import com.univercity.oopjava.practice.task9.version3.LibraryV3;
import com.univercity.oopjava.practice.task9.version3.ReaderV3;

import java.io.*;

public class LibraryDriver {

    private static final String LIBRARY_NAME = "Library name";
    private static String[][] authors = {{"Mark", "Twain"}, {"Conan", "Doyle"}};
    private static String[] bookNames = {"Tom Sawyer", "Sherlock Holmes"};
    private static int[][] bookYearNumbers = {{1875, 15}, {1901, 25}};
    private static String[][] readers = {{"Billy", "Joel"}, {"Mike", "Jordan"}};
    private static int[] regnums = {123, 456};

    public static void main(String[] args) {

//        LibraryV1 libraryV1 = createDemoLibraryV1();
//        System.out.println(libraryV1);
//        save(libraryV1, "libraryV1");
        System.out.println(read("libraryV1"));

//        LibraryV2 libraryV2 = createDemoLibraryV2();
//        System.out.println(libraryV2);
//        save(libraryV2, "libraryV2");
        System.out.println(read("libraryV2"));

//        LibraryV3 libraryV3 = createDemoLibraryV3();
//        System.out.println(libraryV3);
//        save(libraryV3, "libraryV3");
        System.out.println(read("libraryV3"));


    }

    private static LibraryV3 createDemoLibraryV3() {
        AuthorV3[] authorsV3 = new AuthorV3[]{new AuthorV3(authors[0][0], authors[0][1]),
                new AuthorV3(authors[1][0], authors[1][1])};
        BookV3[] booksV3 = {new BookV3(bookNames[0], bookYearNumbers[0][0], bookYearNumbers[0][1],
                new AuthorV3[]{authorsV3[0]}),
                new BookV3(bookNames[1], bookYearNumbers[1][0], bookYearNumbers[1][1], new AuthorV3[]{authorsV3[1]})};
        ReaderV3[] readersV3 = {new ReaderV3(readers[0][0], readers[0][1], regnums[0], new BookV3[]{booksV3[0]}),
                new ReaderV3(readers[1][0], readers[1][1], regnums[1], new BookV3[]{booksV3[1]})};
        return new LibraryV3(LIBRARY_NAME, booksV3, readersV3);
    }

    private static LibraryV2 createDemoLibraryV2() {
        AuthorV2[] authorsV2 = new AuthorV2[]{new AuthorV2(authors[0][0], authors[0][1]),
                new AuthorV2(authors[1][0], authors[1][1])};
        BookV2[] booksV2 = {new BookV2(bookNames[0], bookYearNumbers[0][0], bookYearNumbers[0][1],
                new AuthorV2[]{authorsV2[0]}),
                new BookV2(bookNames[1], bookYearNumbers[1][0], bookYearNumbers[1][1], new AuthorV2[]{authorsV2[1]})};
        ReaderV2[] readersV2 = {new ReaderV2(readers[0][0], readers[0][1], regnums[0], new BookV2[]{booksV2[0]}),
                new ReaderV2(readers[1][0], readers[1][1], regnums[1], new BookV2[]{booksV2[1]})};
        return new LibraryV2(LIBRARY_NAME, booksV2, readersV2);
    }

    private static LibraryV1 createDemoLibraryV1() {
        AuthorV1[] authorsV1 = new AuthorV1[]{new AuthorV1(authors[0][0], authors[0][1]),
                new AuthorV1(authors[1][0], authors[1][1])};
        BookV1[] booksV1 = {new BookV1(bookNames[0], bookYearNumbers[0][0], bookYearNumbers[0][1],
                new AuthorV1[]{authorsV1[0]}),
                new BookV1(bookNames[1], bookYearNumbers[1][0], bookYearNumbers[1][1], new AuthorV1[]{authorsV1[1]})};
        ReaderV1[] readersV1 = {new ReaderV1(readers[0][0], readers[0][1], regnums[0], new BookV1[]{booksV1[0]}),
                new ReaderV1(readers[1][0], readers[1][1], regnums[1], new BookV1[]{booksV1[1]})};
        return new LibraryV1(LIBRARY_NAME, booksV1, readersV1);

    }

    private static void save(Object object, String fileName) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(object);
            objectOutputStream.flush();
            objectOutputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static Object read(String fileName) {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(fileName);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Object object = objectInputStream.readObject();
            objectInputStream.close();
            return object;
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
