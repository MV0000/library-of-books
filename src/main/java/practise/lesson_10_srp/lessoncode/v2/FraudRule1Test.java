package practise.lesson_10_srp.lessoncode.v2;

import com.example.libraryofbooks.practise.lesson_10_srp.lessoncode.v2.FraudRule1;
import com.example.libraryofbooks.practise.lesson_10_srp.lessoncode.v2.Trader;
import com.example.libraryofbooks.practise.lesson_10_srp.lessoncode.v2.Transaction;

public class FraudRule1Test {

    public static void main(String[] args) {
        FraudRule1Test testRunner = new FraudRule1Test();
        testRunner.isPokemonIsFraud();
        testRunner.isAnyButPokemonIsNotFraud();
    }

    public void isPokemonIsFraud() {
        com.example.libraryofbooks.practise.lesson_10_srp.lessoncode.v2.Trader trader = new com.example.libraryofbooks.practise.lesson_10_srp.lessoncode.v2.Trader("Pokemon", "Riga", "");
        com.example.libraryofbooks.practise.lesson_10_srp.lessoncode.v2.Transaction transaction = new com.example.libraryofbooks.practise.lesson_10_srp.lessoncode.v2.Transaction(trader, 1000);
        com.example.libraryofbooks.practise.lesson_10_srp.lessoncode.v2.FraudRule1 rule1 = new com.example.libraryofbooks.practise.lesson_10_srp.lessoncode.v2.FraudRule1("Rule1");

        boolean result = rule1.isFraud(transaction);
        check(result, "Is Pokemon Tx Rejected");
    }

    public void isAnyButPokemonIsNotFraud() {
        com.example.libraryofbooks.practise.lesson_10_srp.lessoncode.v2.Trader trader = new Trader("Any", "Riga", "");
        com.example.libraryofbooks.practise.lesson_10_srp.lessoncode.v2.Transaction transaction = new Transaction(trader, 1000);
        com.example.libraryofbooks.practise.lesson_10_srp.lessoncode.v2.FraudRule1 rule1 = new FraudRule1("Rule1");

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
