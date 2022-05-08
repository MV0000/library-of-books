package com.example.libraryofbooks.practise.lesson_10_srp.lessoncode.v1;

public class FraudRule4 extends FraudRule {

    public FraudRule4(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        return t.getTrader().getCountry().equals("Jamaica");
    }
}
