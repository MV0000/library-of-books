package com.example.libraryofbooks.practise.lesson_10_srp.lessoncode.v1;

public class FraudRule5 extends FraudRule {

    public FraudRule5(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        return t.getTrader().getCountry().equals("Germany") &&
                t.getAmount() > 1000;
    }
}
