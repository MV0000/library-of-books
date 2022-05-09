package practise.lesson_10_srp.lessoncode.v2;

import com.example.libraryofbooks.practise.lesson_10_srp.lessoncode.v2.Trader;

public class Transaction {

    private com.example.libraryofbooks.practise.lesson_10_srp.lessoncode.v2.Trader trader;
    private int amount;

    Transaction(com.example.libraryofbooks.practise.lesson_10_srp.lessoncode.v2.Trader trader, int amount) {
        this.trader = trader;
        this.amount = amount;
    }

    Trader getTrader() {
        return trader;
    }

    int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "trader=" + trader +
                ", amount=" + amount +
                '}';
    }
}