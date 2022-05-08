package com.example.libraryofbooks.practise.lesson_7_encapsulation.lessoncode;

public class Bank {

    private static String token = "AWKHU@#(&*Y@&(YGDKQWLWQEF_";

    public boolean getAccessToTxHistory(User user, String token) {
        System.out.println("Attempt to get history for user..");
        if (checkToken(token)) {
            ratherUserTransactionInfo(user);
            return true;
        } else {
            return false;
        }
    }

    private void ratherUserTransactionInfo(User user) {
//        UserTransactionInfo transactionInfo = findUserInfo(user);
    }

    private boolean checkToken(String token) {
        return token == Bank.token;
    }
}
