package practise.lesson_10_srp.lessoncode.v2;

import com.example.libraryofbooks.practise.lesson_10_srp.lessoncode.v2.FraudRule;
import com.example.libraryofbooks.practise.lesson_10_srp.lessoncode.v2.Transaction;

public class FraudRule2 extends com.example.libraryofbooks.practise.lesson_10_srp.lessoncode.v2.FraudRule {

    static final int AMOUNT_THRESHOLD = 1000000;

    public FraudRule2(String ruleName) {
        super(ruleName);

    }

    public boolean isFraud(Transaction t) {
        return t.getAmount() > AMOUNT_THRESHOLD;
    }
}