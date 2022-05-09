package practise.lesson_12_exceptions.lessoncode.banksystem;

import com.example.libraryofbooks.practise.lesson_12_exceptions.lessoncode.banksystem.AccessDeniedException;
import com.example.libraryofbooks.practise.lesson_12_exceptions.lessoncode.banksystem.BankSystem;
import com.example.libraryofbooks.practise.lesson_12_exceptions.lessoncode.banksystem.UserInputMismatchException;

import java.io.FileOutputStream;
import java.util.Optional;

public class BankDemo {

    public static void main(String[] args) {

        BankSystem bankSystem = new BankSystem();

//        bankSystem.findClient("3421", 1L);
        try {
            Optional<String> client = bankSystem.findClient("3421", null);
        } catch (AccessDeniedException e) {
            System.out.println("Something went wrong during operation");
            System.out.println(e.getMessage());
            System.out.println("There was an attempt to call API with the token: " + e.getRequestedToken());
        } catch (UserInputMismatchException e) {
            System.out.println("Log: " + e.getMessage());
            throw new IllegalStateException("User Input is wrong", e);
        } finally {
            System.out.println("Finally block");
        }


        System.out.println("I'm still working..");
    }
}
