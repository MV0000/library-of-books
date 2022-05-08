package com.example.libraryofbooks.practise.lesson_10_srp.lessoncode.v1;


import static javaguru.lv.teacher.lesson_10_srp.lessoncode.v1.FraudRule2.AMOUNT_THRESHOLD;

public class FraudRule2Test {

    public static void main(String[] args) {
        FraudRule2Test testRunner = new FraudRule2Test();
        testRunner.isAmountBiggerThan1M();
        testRunner.isAmountLessThan1M();
    }

    public void isAmountBiggerThan1M() {
        Trader trader = new Trader("Someone", "Riga", "");
        Transaction transaction = new Transaction(trader, AMOUNT_THRESHOLD + 1);
        FraudRule2 rule2 = new FraudRule2("Rule2");

        boolean result = rule2.isFraud(transaction);
        check(result, "Amount bigger than 1M");

    }

    public void isAmountLessThan1M() {
        Trader trader = new Trader("Someone else", "Riga", "");
        Transaction transaction = new Transaction(trader, AMOUNT_THRESHOLD - 1);
        FraudRule2 rule2 = new FraudRule2("Rule2");

        boolean result = rule2.isFraud(transaction);
        check(!result, "Is less than 1M");
    }

    void check(boolean result, String testName) {
        if (result) {
            System.out.println("Test with name: " + testName + " - OK");
        } else {
            System.out.println("Test with name: " + testName + " - FAILED");
        }
    }



}
