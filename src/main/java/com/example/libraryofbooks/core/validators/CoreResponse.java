package com.example.libraryofbooks.core.validators;

import java.util.List;

public abstract class CoreResponse {

    private List<CoreError> errors;

    public CoreResponse(List<CoreError> errors) {
        this.errors = errors;
    }

    public CoreResponse() {
    }

    public List<CoreError> getErrors() {
        return errors;
    }

    public boolean hasErrors() {
        return errors != null && !errors.isEmpty();
    }
}
