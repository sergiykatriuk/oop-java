package com.univercity.oopjava.practice.task7;

import java.lang.reflect.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<? extends String> class1 = "str".getClass();
        Class<String> class2 = String.class;
        Class<String> class3 = (Class<String>) Class.forName("java.lang.String");

        System.out.println(class1.equals(class2));  // true
        System.out.println(class1.equals(class3));  // true
        System.out.println(class2.equals(class3));  // true

        System.out.println("Class modifiers");
        System.out.println(Modifier.toString(class1.getModifiers()));
        // public final

        System.out.println();
        System.out.println("Public constructors");
        Constructor[] constructors = class1.getConstructors();
        for (int i = 0; i < constructors.length; i++) {
            System.out.println(constructors[i].toGenericString());
        }
//public java.lang.String(byte[],int,int)
//public java.lang.String(byte[],java.nio.charset.Charset)
//public java.lang.String(byte[],java.lang.String) throws java.io.UnsupportedEncodingException
//public java.lang.String(byte[],int,int,java.nio.charset.Charset)
//public java.lang.String(byte[],int,int,java.lang.String) throws java.io.UnsupportedEncodingException
//public java.lang.String(java.lang.StringBuilder)
//public java.lang.String(java.lang.StringBuffer)
//public java.lang.String(byte[])
//public java.lang.String(int[],int,int)
//public java.lang.String()
//public java.lang.String(char[])
//public java.lang.String(java.lang.String)
//public java.lang.String(char[],int,int)
//public java.lang.String(byte[],int)
//public java.lang.String(byte[],int,int,int)

        System.out.println();
        System.out.println("Fields");
        Field[] fields = class1.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            System.out.println(fields[i].toGenericString());
        }
//        private final char[] java.lang.String.value
//        private int java.lang.String.hash
//        private static final long java.lang.String.serialVersionUID
//        private static final java.io.ObjectStreamField[] java.lang.String.serialPersistentFields
//        public static final java.util.Comparator<java.lang.String> java.lang.String.CASE_INSENSITIVE_ORDER
//        public static final java.util.Comparator<java.lang.String> java.lang.String.CASE_INSENSITIVE_ORDER


        System.out.println();
        System.out.println("Public methods");
        Method[] methods = class1.getMethods();
        for (int i = 0; i < methods.length; i++) {
            System.out.println(methods[i].toGenericString());
        }
//        public boolean java.lang.String.equals(java.lang.Object)
//        public java.lang.String java.lang.String.toString()
//        public int java.lang.String.hashCode()
//        public int java.lang.String.compareTo(java.lang.String)
//        ..............
//        ..............
//        ..............
//        public final native void java.lang.Object.notifyAll()
//        public default java.util.stream.IntStream java.lang.CharSequence.chars()
//        public default java.util.stream.IntStream java.lang.CharSequence.codePoints()


        try {
            String str1 = "str1";
            Method method = class1.getMethod("compareTo", String.class);
            Object compareResult = method.invoke(str1, "str2");
            System.out.println(compareResult); // -1
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
