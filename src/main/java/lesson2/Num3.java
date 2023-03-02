package lesson2;

import java.util.Scanner;

public class Num3 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("constructor and output on display:");
        int acc1 = scanner.nextInt();
        int id1 = scanner.nextInt();
        double money1 = scanner.nextDouble();
        BankAccount account1 = new BankAccount(acc1, id1, money1);

        System.out.println(account1.printObject());

        System.out.println("merge accounts:");
        System.out.println("1st acc ->");
        int acc2 = scanner.nextInt();
        int id2 = scanner.nextInt();
        double money2 = scanner.nextDouble();
        System.out.println("2nd acc ->");
        int acc3 = scanner.nextInt();
        int id3 = scanner.nextInt();
        double money3 = scanner.nextDouble();
        BankAccount account2 = new BankAccount(acc2, id2, money2);
        BankAccount account3 = new BankAccount(acc3, id3, money3);

        System.out.println(account3.mergeAccounts(account2));

        System.out.println("money transfer:");
        System.out.println("1st acc (from) ->");
        int acc4 = scanner.nextInt();
        int id4 = scanner.nextInt();
        double money4 = scanner.nextDouble();
        System.out.println("2nd acc (to) ->");
        int acc5 = scanner.nextInt();
        int id5 = scanner.nextInt();
        double money5 = scanner.nextDouble();
        System.out.println("transfer amount $ ->");
        double amount45 = scanner.nextDouble();
        BankAccount account4 = new BankAccount(acc4, id4, money4);
        BankAccount account5 = new BankAccount(acc5, id5, money5);

        System.out.println(account5.moneyTransfer(account4, amount45));






//        BankAccount account1 = new BankAccount(-100, 7, 100);
//        BankAccount account2 = new BankAccount(100, -5, 90);
//        BankAccount account3 = new BankAccount(100, 18187, 101029.98);
//        System.out.println(account1.printObject());
//        System.out.println(account2.printObject());
//        System.out.println(account3.printObject());
//
//        System.out.println("+++++++++++++++++++++++++++\n");
//
//        BankAccount account4 = new BankAccount(-123, 15, 9826.96);
//        BankAccount account5 = new BankAccount(2123, 27, 3000.);
//        BankAccount account6 = new BankAccount(123, 27, 2827.8);
//        BankAccount account7 = new BankAccount(5, 28, 10.);
//        System.out.println(account4.mergeAccounts(account5));
//        System.out.println(account6.mergeAccounts(account5));
//        System.out.println(account7.mergeAccounts(account6));
//
//        System.out.println("+++++++++++++++++++++++++++\n");
//
//        BankAccount account8 = new BankAccount(1, -15, 2827.9);
//        BankAccount account9 = new BankAccount(2, 20, 3000.);
//        BankAccount account10 = new BankAccount(2, 19, 3000.);
//        BankAccount account11 = new BankAccount(3, 19, 3000.);
//        System.out.println(account8.moneyTransfer(account9, 1000.));
//        System.out.println(account9.moneyTransfer(account10, -1000.));
//        System.out.println(account10.moneyTransfer(account11, -1000.));
//        System.out.println(account10.moneyTransfer(account11, 4000.));

    }
}
