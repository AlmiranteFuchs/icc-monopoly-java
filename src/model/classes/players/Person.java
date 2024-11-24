package model.classes.players;

import model.interfaces.FinancialEntity;
import model.utils.ValidationHelper;

public class Person implements FinancialEntity {
    private double _balance;
    // Balance get & set are FinancialEntity driven

    private String _name;
    public String get_name() { return _name; }
    public void set_name(String _name) { this._name = _name; }


    public Person(String name, double initialBalance) {
        ValidationHelper.assertNotEmpty(name, null);
        ValidationHelper.assertPositive(initialBalance, null);

        this._name = name;
        this._balance = initialBalance;
    }

    public Person(String name) {
        this(name, 1500);
    }


    @Override
    public void Deposit(double amount) {
        ValidationHelper.assertPositive(amount, null);

        this._balance += amount;
    }

    @Override
    public void Withdraw(double amount) {
        // Not used I guess, we will transfer the money to the bank??
    }

    @Override
    public void Transfer(FinancialEntity target, double amount) {
        ValidationHelper.assertPositive(amount, null);
        ValidationHelper.assertNotNull(amount, null);

        this._balance -= amount;
        target.Deposit(amount);
    }

    @Override
    public double GetBalance() {
        return this._balance;
    }
}
