package practise.lesson_10_srp.lessoncode.v2;

import com.example.libraryofbooks.practise.lesson_10_srp.lessoncode.v2.FraudRule2;
import com.example.libraryofbooks.practise.lesson_10_srp.lessoncode.v2.Trader;
import com.example.libraryofbooks.practise.lesson_10_srp.lessoncode.v2.Transaction;

import static javaguru.lv.teacher.lesson_10_srp.lessoncode.v2.FraudRule2.AMOUNT_THRESHOLD;

public class FraudRule2Test {

    public static void main(String[] args) {
        FraudRule2Test testRunner = new FraudRule2Test();
        testRunner.isAmountBiggerThan1M();
        testRunner.isAmountLessThan1M();
    }

    public void isAmountBiggerThan1M() {
        com.example.libraryofbooks.practise.lesson_10_srp.lessoncode.v2.Trader trader = new com.example.libraryofbooks.practise.lesson_10_srp.lessoncode.v2.Trader("Someone", "Riga", "");
        com.example.libraryofbooks.practise.lesson_10_srp.lessoncode.v2.Transaction transaction = new com.example.libraryofbooks.practise.lesson_10_srp.lessoncode.v2.Transaction(trader, AMOUNT_THRESHOLD + 1);
        com.example.libraryofbooks.practise.lesson_10_srp.lessoncode.v2.FraudRule2 rule2 = new com.example.libraryofbooks.practise.lesson_10_srp.lessoncode.v2.FraudRule2("Rule2");

        boolean result = rule2.isFraud(transaction);
        check(result, "Amount bigger than 1M");

    }

    public void isAmountLessThan1M() {
        com.example.libraryofbooks.practise.lesson_10_srp.lessoncode.v2.Trader trader = new Trader("Someone else", "Riga", "");
        com.example.libraryofbooks.practise.lesson_10_srp.lessoncode.v2.Transaction transaction = new Transaction(trader, AMOUNT_THRESHOLD - 1);
        com.example.libraryofbooks.practise.lesson_10_srp.lessoncode.v2.FraudRule2 rule2 = new FraudRule2("Rule2");

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
