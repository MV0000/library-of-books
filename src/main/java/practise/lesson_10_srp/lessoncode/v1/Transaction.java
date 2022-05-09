package practise.lesson_10_srp.lessoncode.v1;

import com.example.libraryofbooks.practise.lesson_10_srp.lessoncode.v1.Trader;

public class Transaction {

    private com.example.libraryofbooks.practise.lesson_10_srp.lessoncode.v1.Trader trader;
    private int amount;

    Transaction(com.example.libraryofbooks.practise.lesson_10_srp.lessoncode.v1.Trader trader, int amount) {
        this.trader = trader;
        this.amount = amount;
    }

    Trader getTrader() {
        return trader;
    }

    int getAmount() {
        return amount;
    }
}