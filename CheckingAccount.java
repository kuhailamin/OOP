/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kuhail
 */
public class CheckingAccount extends BankAccount {

    private final double MAXIMUM_WITHDRAWL = 1000;

    public CheckingAccount(String name, double balance) {
        super(name, balance);
    }

    @Override
    public void withdraw(double amount) throws Exception {
        if (amount > MAXIMUM_WITHDRAWL) {
            throw new Exception("You can't withdraw more than " + MAXIMUM_WITHDRAWL);
        }
        if (amount > super.balance) {
            throw new Exception("You can't withdraw more than the balance");
        }
        super.balance -= amount;
    }

}
