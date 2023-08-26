package Exercise_25;

import java.util.ArrayList;

public class BankAccount {
    private double balance;
    private ArrayList<Double> statement;

    public BankAccount() {
        balance = 0;
        statement = new ArrayList<>();
    }

    public void deposit(double amount) {
        balance += amount;
        statement.add(amount);
    }

    public void withdraw(double amount) {
        balance -= amount;
        statement.add(-amount);
    }

    public ArrayList<Double> getStatement() {
        return statement;
    }

    public void clearStatement() {
        statement.clear();
    }
}
