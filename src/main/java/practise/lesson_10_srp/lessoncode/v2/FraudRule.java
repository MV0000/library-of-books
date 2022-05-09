package practise.lesson_10_srp.lessoncode.v2;

import com.example.libraryofbooks.practise.lesson_10_srp.lessoncode.v2.Transaction;

abstract class FraudRule {

    private String ruleName;

    public FraudRule(String ruleName) {
        this.ruleName = ruleName;
    }

    public abstract boolean isFraud(Transaction t);

    public String getRuleName() {
        return ruleName;
    }
}
