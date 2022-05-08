package com.example.libraryofbooks.practise.lesson_5_arrays_for_loop.lessoncode.banksystem;

public class BankingSystem {

    public static void main(String[] args) {
        BankingSystem system = new BankingSystem();
        Transaction[] transactions = new Transaction[5];

        transactions[0] = new Transaction("Credit", 100);
        transactions[1] = new Transaction("Debit", 1000);
        transactions[2] = new Transaction("Credit", 100);
        transactions[3] = new Transaction("Debit", 500);
        transactions[4] = new Transaction("Debit", 1);

        Transaction myThirdTransactions = transactions[3];
        myThirdTransactions.printInfo();

        BankAccount alexBankAccount = new BankAccount("Alex", 10000);

        System.out.println(alexBankAccount.getAmount());
        system.applyTransactions(transactions, alexBankAccount);
        System.out.println(alexBankAccount.getAmount());

    }

    public void applyTransactions(Transaction[] transactions, BankAccount bankAccount) {
        for (int i = 0; i < transactions.length; i++) {
            Transaction transaction = transactions[i];
            if (transaction.getOperation() == "Credit") {
                bankAccount.credit(transaction.getAmount());
            } else if (transaction.getOperation() == "Debit") {
                bankAccount.debit(transaction.getAmount());
            }
        }
    }
}
