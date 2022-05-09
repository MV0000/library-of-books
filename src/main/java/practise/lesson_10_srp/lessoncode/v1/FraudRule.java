package practise.lesson_10_srp.lessoncode.v1;

import com.example.libraryofbooks.practise.lesson_10_srp.lessoncode.v1.Transaction;

abstract class FraudRule {

    private String ruleName;

    public FraudRule(String ruleName) {
        this.ruleName = ruleName;
    }

    public abstract boolean isFraud(Transaction t);

}
