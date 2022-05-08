package com.example.libraryofbooks.practise.lesson_10_srp.lessoncode.v2;

import java.util.List;

public class FraudDetector {

    List<FraudRule> fraudRules;

    public FraudDetector(List<FraudRule> fraudRules) {
        this.fraudRules = fraudRules;
    }

    //true - rejected
    //false - ok
    FraudDetectionResult isFraud(Transaction t) {
        for (FraudRule fraudRule : fraudRules) {
            if (fraudRule.isFraud(t)) {
                System.out.println("Transaction fraud detected!!!");
                System.out.println(t);
                return new FraudDetectionResult(true, fraudRule.getRuleName());
            }
        }
        return new FraudDetectionResult(false, null);
    }
}