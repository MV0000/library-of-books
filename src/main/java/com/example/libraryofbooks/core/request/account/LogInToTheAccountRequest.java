package com.example.libraryofbooks.core.request.account;

public class LogInToTheAccountRequest {

    private String clientUsername;
    private String clientPassword;


    public LogInToTheAccountRequest(String clientUsername, String clientPassword) {
        this.clientUsername = clientUsername;
        this.clientPassword = clientPassword;
    }

    public String getClientUsername() {
        return clientUsername;
    }

    public void setClientUsername(String clientUsername) {
        this.clientUsername = clientUsername;
    }

    public String getClientPassword() {
        return clientPassword;
    }

    public void setClientPassword(String clientPassword) {
        this.clientPassword = clientPassword;
    }
}
