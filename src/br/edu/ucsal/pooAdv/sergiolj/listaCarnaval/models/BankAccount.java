package br.edu.ucsal.pooAdv.sergiolj.listaCarnaval.models;

public class BankAccount {
    private double balance;
    private final int accountNumber;
    private static int accountControl = 0;
    private final Client client;

    public BankAccount(Client client, double balance) {
        this.balance = balance;
        this.client = client;
        this.accountNumber = accountControl++;
    }

    public double getBalance() {
        return this.balance;
    }
    public boolean withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            return true;
        }
        return false;
    }
    public void deposit(double amount) {
        this.balance += amount;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}
