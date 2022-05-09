package practise.lesson_8_inheritance.lessoncode.bankexample;

import com.example.libraryofbooks.practise.lesson_8_inheritance.lessoncode.bankexample.BankSystem;
import javaguru.lv.teacher.lesson_7_encapsulation.lessoncode.Bank;

public class SwedBank implements BankSystem {

    @Override
    public int getBalance() {
        return 0;
    }

    @Override
    public boolean transferMoney(int amount) {
        return false;
    }
}
