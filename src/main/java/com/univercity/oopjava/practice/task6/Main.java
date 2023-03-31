package com.univercity.oopjava.practice.task6;

public class Main {

    public static void main(String[] args) {

        // дозволяє мати тільки один ітератор
        Vector vector = new Vector(new double[]{2.5d, 5.7d, 9.1d});
        while (vector.hasNext()) {
            System.out.println(vector.next());
        }

        // Наступні три реалізації дозволяються мати кілька ітераторів для одного об'єкта Vector
        VectorInner vectorInner = new VectorInner(new double[]{2.5d, 5.7d, 9.1d});
        Iterator iteratorInner = vectorInner.new VectorInnerIterator();
        while (iteratorInner.hasNext()) {
            System.out.println(iteratorInner.next());
        }

        // Я би вибрав одну із цих двох реалізацій. так як тут можна отримати ітератор простим викликом метода
        VectorInnerAnonymous vectorAnonymous = new VectorInnerAnonymous(new double[]{2.5d, 5.7d, 9.1d});
        Iterator iteratorAnonymous = vectorAnonymous.getVectorInnerAnonymousIterator();
        while (iteratorAnonymous.hasNext()) {
            System.out.println(iteratorAnonymous.next());
        }

        VectorLocalInner vectorLocalInner = new VectorLocalInner(new double[]{2.5d, 5.7d, 9.1d});
        Iterator vectorLocalIterator = vectorLocalInner.getIterator();
        while (vectorLocalIterator.hasNext()) {
            System.out.println(vectorLocalIterator.next());
        }

    }
}
