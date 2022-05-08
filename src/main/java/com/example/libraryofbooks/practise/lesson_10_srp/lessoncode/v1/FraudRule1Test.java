package com.example.libraryofbooks.practise.lesson_10_srp.lessoncode.v1;

public class FraudRule1Test {

    public static void main(String[] args) {
        FraudRule1Test testRunner = new FraudRule1Test();
        testRunner.isPokemonIsFraud();
        testRunner.isAnyButPokemonIsNotFraud();
    }

    public void isPokemonIsFraud() {
        Trader trader = new Trader("Pokemon", "Riga", "");
        Transaction transaction = new Transaction(trader, 1000);
        FraudRule1 rule1 = new FraudRule1("Rule1");

        boolean result = rule1.isFraud(transaction);
        check(result, "Is Pokemon Tx Rejected");
    }

    public void isAnyButPokemonIsNotFraud() {
        Trader trader = new Trader("Any", "Riga", "");
        Transaction transaction = new Transaction(trader, 1000);
        FraudRule1 rule1 = new FraudRule1("Rule1");

        boolean result = rule1.isFraud(transaction);
        check(!result, "Is Any But Pokemon Tx Rejected");
    }

    void check(boolean result, String testName) {
        if (result) {
            System.out.println("Test with name: " + testName + " - OK");
        } else {
            System.out.println("Test with name: " + testName + " - FAILED");
        }
    }



}
