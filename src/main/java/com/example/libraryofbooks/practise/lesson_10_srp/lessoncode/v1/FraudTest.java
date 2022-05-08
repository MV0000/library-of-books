package com.example.libraryofbooks.practise.lesson_10_srp.lessoncode.v1;


import java.util.ArrayList;
import java.util.List;

public class FraudTest {

    FraudDetector detector;

    public static void main(String[] args) {
        FraudTest testRunner = new FraudTest();
        testRunner.init();
        testRunner.isPokemonIsFraud();
        testRunner.isAnyButPokemonIsNotFraud();
        testRunner.isSydneyIsFraud();
        testRunner.isCountryIsFraud();
        testRunner.isCountryIsNotFraud();
    }

    public void init() {
        List<FraudRule> fraudRules = new ArrayList<>();
        fraudRules.add(new FraudRule1("Rule1"));
        fraudRules.add(new FraudRule2("Rule2"));
        fraudRules.add(new FraudRule3("Rule3"));
        fraudRules.add(new FraudRule4("Rule4"));
        fraudRules.add(new FraudRule5("Rule5"));
        detector = new FraudDetector(fraudRules);
    }

    public void isPokemonIsFraud() {
        Trader trader = new Trader("Pokemon", "Riga", "");
        Transaction transaction = new Transaction(trader, 1000);
        boolean result = detector.isFraud(transaction);
        check(result, "Is Pokemon Tx Rejected");
    }

    public void isAnyButPokemonIsNotFraud() {
        Trader trader = new Trader("Any", "Riga", "");
        Transaction transaction = new Transaction(trader, 1000);
        boolean result = detector.isFraud(transaction);
        check(!result, "Is Any But Pokemon Tx Rejected");
    }

    public void isSydneyIsFraud() {
        Trader trader = new Trader("Someone", "Sydney", "");
        Transaction transaction = new Transaction(trader, 1000);

        boolean result = detector.isFraud(transaction);
        check(result, "Is Sydney Tx Rejected");
    }

    public void isCountryIsFraud() {
        Trader trader = new Trader("Someone", "I dont know the name", "Jamaica");
        Transaction transaction = new Transaction(trader, 1000);

        boolean result = detector.isFraud(transaction);
        check(result, "Is Jamaica Tx Rejected");
    }
    public void isCountryIsNotFraud() {
        Trader trader = new Trader("Someone", "Tokyo", "Japan");
        Transaction transaction = new Transaction(trader, 1000);

        boolean result = detector.isFraud(transaction);
        check(!result, "Is Jamaica Tx Rejected");
    }

    void check(boolean result, String testName) {
        if (result) {
            System.out.println("Test with name: " + testName + " - OK");
        } else {
            System.out.println("Test with name: " + testName + " - FAILED");
        }
    }

}
