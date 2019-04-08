/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kuhail
 */
public class SavingsAccount extends BankAccount {

    private float interest_rate;

    public SavingsAccount(float interest_rate, String name, double balance) {
        super(name, balance);
        this.interest_rate = interest_rate;
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount * interest_rate + amount);
    }

    @Override
    public void withdraw(double amount) throws Exception {
        throw new Exception("Not allowed to withdraw from a savings account.");
    }
}
