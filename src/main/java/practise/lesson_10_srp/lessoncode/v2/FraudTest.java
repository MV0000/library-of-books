package practise.lesson_10_srp.lessoncode.v2;


import com.example.libraryofbooks.practise.lesson_10_srp.lessoncode.v2.*;
import com.example.libraryofbooks.practise.lesson_10_srp.lessoncode.v2.FraudRule;
import com.example.libraryofbooks.practise.lesson_10_srp.lessoncode.v2.Trader;

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
        List<com.example.libraryofbooks.practise.lesson_10_srp.lessoncode.v2.FraudRule> fraudRules = new ArrayList<>();
        fraudRules.add(new FraudRule1("Rule1"));
        fraudRules.add(new FraudRule2("Rule2"));
        fraudRules.add(new FraudRule3("Rule3"));
        fraudRules.add(new FraudRule4("Rule4"));
        fraudRules.add(new FraudRule5("Rule5"));
        detector = new FraudDetector(fraudRules);
    }

    public void isPokemonIsFraud() {
        com.example.libraryofbooks.practise.lesson_10_srp.lessoncode.v2.Trader trader = new com.example.libraryofbooks.practise.lesson_10_srp.lessoncode.v2.Trader("Pokemon", "Riga", "");
        Transaction transaction = new Transaction(trader, 1000);
        FraudDetectionResult result = detector.isFraud(transaction);
        check(result.isFraud(), "Is Pokemon Tx Rejected");
    }

    public void isAnyButPokemonIsNotFraud() {
        com.example.libraryofbooks.practise.lesson_10_srp.lessoncode.v2.Trader trader = new com.example.libraryofbooks.practise.lesson_10_srp.lessoncode.v2.Trader("Any", "Riga", "");
        Transaction transaction = new Transaction(trader, 1000);
        FraudDetectionResult result = detector.isFraud(transaction);
        check(!result.isFraud(), "Is Any But Pokemon Tx Rejected");
    }

    public void isSydneyIsFraud() {
        com.example.libraryofbooks.practise.lesson_10_srp.lessoncode.v2.Trader trader = new com.example.libraryofbooks.practise.lesson_10_srp.lessoncode.v2.Trader("Someone", "Sydney", "");
        Transaction transaction = new Transaction(trader, 1000);

        FraudDetectionResult result = detector.isFraud(transaction);
        check(result.isFraud(), "Is Sydney Tx Rejected");
    }

    public void isCountryIsFraud() {
        com.example.libraryofbooks.practise.lesson_10_srp.lessoncode.v2.Trader trader = new com.example.libraryofbooks.practise.lesson_10_srp.lessoncode.v2.Trader("Someone", "I dont know the name", "Jamaica");
        Transaction transaction = new Transaction(trader, 1000);

        FraudDetectionResult result = detector.isFraud(transaction);
        check(result.isFraud(), "Is Jamaica Tx Rejected");
    }
    public void isCountryIsNotFraud() {
        com.example.libraryofbooks.practise.lesson_10_srp.lessoncode.v2.Trader trader = new Trader("Someone", "Tokyo", "Japan");
        Transaction transaction = new Transaction(trader, 1000);

        FraudDetectionResult result = detector.isFraud(transaction);
        check(!result.isFraud(), "Is Jamaica Tx Rejected");
    }

    void check(boolean result, String testName) {
        if (result) {
            System.out.println("Test with name: " + testName + " - OK");
        } else {
            System.out.println("Test with name: " + testName + " - FAILED");
        }
    }

}
