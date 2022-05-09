package practise.lesson_10_srp.lessoncode.v1;

import com.example.libraryofbooks.practise.lesson_10_srp.lessoncode.v1.FraudRule;
import com.example.libraryofbooks.practise.lesson_10_srp.lessoncode.v1.Transaction;

import java.util.List;

public class FraudDetector {

    List<com.example.libraryofbooks.practise.lesson_10_srp.lessoncode.v1.FraudRule> fraudRules;

    public FraudDetector(List<com.example.libraryofbooks.practise.lesson_10_srp.lessoncode.v1.FraudRule> fraudRules) {
        this.fraudRules = fraudRules;
    }

    //true - rejected
    //false - ok
    boolean isFraud(Transaction t) {
        for (com.example.libraryofbooks.practise.lesson_10_srp.lessoncode.v1.FraudRule fraudRule : fraudRules) {
            if (fraudRule.isFraud(t)) {
                return true;
            }
        }
        return false;
    }
}