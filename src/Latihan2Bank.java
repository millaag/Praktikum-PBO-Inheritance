/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author L0324020 - Milla Agustin
 */

class Account {
    String accNo;
    double balance;

    Account(String accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }

    void showInfo() {
        System.out.println(accNo + " balance: " + balance);
    }
}

class SavingsAccount extends Account {
    double interestRate;

    SavingsAccount(String accNo, double balance, double interestRate) {
        super(accNo, balance);
        this.interestRate = interestRate;
    }

    void addInterest() {
        balance += balance * interestRate;
    }
}

class CheckingAccount extends Account {
    double overdraftLimit;

    CheckingAccount(String accNo, double balance, double overdraftLimit) {
        super(accNo, balance);
        this.overdraftLimit = overdraftLimit;
    }
}

public class Latihan2Bank {
    public static void main(String[] args) {
        Account[] accounts = {
            new SavingsAccount("A001", 1000, 0.05),
            new CheckingAccount("B002", 1500, 500),
            new SavingsAccount("C003", 2000, 0.03)
        };

        for (Account acc : accounts) {
            if (acc instanceof SavingsAccount) {
                ((SavingsAccount) acc).addInterest();
            }
            acc.showInfo();
        }
    }
}
