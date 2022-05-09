package practise.lesson_10_srp.lessoncode.v2;

import com.example.libraryofbooks.practise.lesson_10_srp.lessoncode.v2.FraudDetectionResult;
import com.example.libraryofbooks.practise.lesson_10_srp.lessoncode.v2.FraudRule;
import com.example.libraryofbooks.practise.lesson_10_srp.lessoncode.v2.Transaction;

import java.util.List;

public class FraudDetector {

    List<com.example.libraryofbooks.practise.lesson_10_srp.lessoncode.v2.FraudRule> fraudRules;

    public FraudDetector(List<com.example.libraryofbooks.practise.lesson_10_srp.lessoncode.v2.FraudRule> fraudRules) {
        this.fraudRules = fraudRules;
    }

    //true - rejected
    //false - ok
    FraudDetectionResult isFraud(Transaction t) {
        for (com.example.libraryofbooks.practise.lesson_10_srp.lessoncode.v2.FraudRule fraudRule : fraudRules) {
            if (fraudRule.isFraud(t)) {
                System.out.println("Transaction fraud detected!!!");
                System.out.println(t);
                return new FraudDetectionResult(true, fraudRule.getRuleName());
            }
        }
        return new FraudDetectionResult(false, null);
    }
}