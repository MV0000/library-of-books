package practise.lesson_10_srp.lessoncode.v2;

import com.example.libraryofbooks.practise.lesson_10_srp.lessoncode.v2.FraudRule;
import com.example.libraryofbooks.practise.lesson_10_srp.lessoncode.v2.Transaction;

public class FraudRule4 extends com.example.libraryofbooks.practise.lesson_10_srp.lessoncode.v2.FraudRule {

    public FraudRule4(String ruleName) {
        super(ruleName);
    }

    public boolean isFraud(Transaction t) {
        return t.getTrader().getCountry().equals("Jamaica");
    }
}
