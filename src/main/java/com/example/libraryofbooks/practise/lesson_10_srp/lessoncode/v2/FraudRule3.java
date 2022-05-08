package com.example.libraryofbooks.practise.lesson_10_srp.lessoncode.v2;

public class FraudRule3 extends FraudRule{

    public FraudRule3(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        return t.getTrader().getCity().equals("Sydney");
    }

}
