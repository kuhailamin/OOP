/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kuhail
 */
public abstract class BankAccount {

    private String name;
    protected double balance;

    public BankAccount(String owner, double balance) {
        this.name = owner;
        this.balance = balance;
    }

    public void ddeposit(double amount) {
        this.balance += amount;
    }

    public abstract void withdraw(double amount) throws Exception;

}