package com.example.libraryofbooks.core.response.account;

import com.example.libraryofbooks.core.domain.Account;
import com.example.libraryofbooks.core.validators.CoreError;
import com.example.libraryofbooks.core.validators.CoreResponse;

import java.util.List;

public class LogInToTheAccountResponse extends CoreResponse {

    private Account account;

    public LogInToTheAccountResponse(Account account) {
        this.account = account;
    }

    public LogInToTheAccountResponse(List<CoreError> errors) {
        super(errors);
    }

    public Account getAccount() {
        return account;
    }
}
