package com.example.libraryofbooks.practise.lesson_10_srp.lessoncode.v1;

import java.util.List;

public class FraudDetector {

    List<FraudRule> fraudRules;

    public FraudDetector(List<FraudRule> fraudRules) {
        this.fraudRules = fraudRules;
    }

    //true - rejected
    //false - ok
    boolean isFraud(Transaction t) {
        for (FraudRule fraudRule : fraudRules) {
            if (fraudRule.isFraud(t)) {
                return true;
            }
        }
        return false;
    }
}