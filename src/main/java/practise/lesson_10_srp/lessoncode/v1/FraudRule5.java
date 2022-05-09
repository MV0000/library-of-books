package practise.lesson_10_srp.lessoncode.v1;

import com.example.libraryofbooks.practise.lesson_10_srp.lessoncode.v1.FraudRule;
import com.example.libraryofbooks.practise.lesson_10_srp.lessoncode.v1.Transaction;

public class FraudRule5 extends com.example.libraryofbooks.practise.lesson_10_srp.lessoncode.v1.FraudRule {

    public FraudRule5(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        return t.getTrader().getCountry().equals("Germany") &&
                t.getAmount() > 1000;
    }
}
