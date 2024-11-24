package model.interfaces;

public interface FinancialEntity {
    void Deposit(double amount);
    void Withdraw(double amount);
    void Transfer(FinancialEntity target, double amount);

    double GetBalance();

}
