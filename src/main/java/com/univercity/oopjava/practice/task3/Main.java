package com.univercity.oopjava.practice.task3;

public class Main {

    public static void main(String[] args) {
        Account[] accounts = {
                new Account("1111111111", 1.2f),
                new Account("2222222222", 2.4f),
                new Account("3333333333", 3.5f)
        };

        printAccounts(accounts);

        System.out.println("Adding 1.2 to 2222222222");
        accounts[1].add(1.2f);

        printAccounts(accounts);

        System.out.println("Substract 3.2 from 3333333333");
        accounts[2].substract(3.2f);

        printAccounts(accounts);

    }

    private static void printAccounts(Account[] accounts) {
        for (Account account : accounts) {
            System.out.println(account.printBalance());
        }
        System.out.println(String.format("Total amount = %s\n", accounts[0].getTotalAmount()));
    }
}
