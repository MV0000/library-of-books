package com.example.libraryofbooks.practise.lesson_10_srp.lessoncode.v2;

public class FraudRule1 extends FraudRule{

    public FraudRule1(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        return t.getTrader().getFullName().equals("Pokemon");
    }
}
