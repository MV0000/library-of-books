package practise.lesson_5_arrays_for_loop.lessoncode.banksystem;

import com.example.libraryofbooks.practise.lesson_5_arrays_for_loop.lessoncode.banksystem.BankAccount;
import com.example.libraryofbooks.practise.lesson_5_arrays_for_loop.lessoncode.banksystem.Transaction;

public class BankingSystem {

    public static void main(String[] args) {
        BankingSystem system = new BankingSystem();
        com.example.libraryofbooks.practise.lesson_5_arrays_for_loop.lessoncode.banksystem.Transaction[] transactions = new com.example.libraryofbooks.practise.lesson_5_arrays_for_loop.lessoncode.banksystem.Transaction[5];

        transactions[0] = new com.example.libraryofbooks.practise.lesson_5_arrays_for_loop.lessoncode.banksystem.Transaction("Credit", 100);
        transactions[1] = new com.example.libraryofbooks.practise.lesson_5_arrays_for_loop.lessoncode.banksystem.Transaction("Debit", 1000);
        transactions[2] = new com.example.libraryofbooks.practise.lesson_5_arrays_for_loop.lessoncode.banksystem.Transaction("Credit", 100);
        transactions[3] = new com.example.libraryofbooks.practise.lesson_5_arrays_for_loop.lessoncode.banksystem.Transaction("Debit", 500);
        transactions[4] = new com.example.libraryofbooks.practise.lesson_5_arrays_for_loop.lessoncode.banksystem.Transaction("Debit", 1);

        com.example.libraryofbooks.practise.lesson_5_arrays_for_loop.lessoncode.banksystem.Transaction myThirdTransactions = transactions[3];
        myThirdTransactions.printInfo();

        com.example.libraryofbooks.practise.lesson_5_arrays_for_loop.lessoncode.banksystem.BankAccount alexBankAccount = new com.example.libraryofbooks.practise.lesson_5_arrays_for_loop.lessoncode.banksystem.BankAccount("Alex", 10000);

        System.out.println(alexBankAccount.getAmount());
        system.applyTransactions(transactions, alexBankAccount);
        System.out.println(alexBankAccount.getAmount());

    }

    public void applyTransactions(com.example.libraryofbooks.practise.lesson_5_arrays_for_loop.lessoncode.banksystem.Transaction[] transactions, BankAccount bankAccount) {
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
