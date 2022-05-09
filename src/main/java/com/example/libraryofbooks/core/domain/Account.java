package com.example.libraryofbooks.core.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter

public class Account {

    private Client client;
    private List<ArrayList> listOfBooks;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account)) return false;

        Account that = (Account) o;

        if (client != null ? !client.equals(that.client) : that.client != null) return false;
        return listOfBooks != null ? listOfBooks.equals(that.listOfBooks) : that.listOfBooks == null;
    }

    @Override
    public int hashCode() {
        int result = client != null ? client.hashCode() : 0;
        result = 31 * result + (listOfBooks != null ? listOfBooks.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ClientAccount{" +
                "listOfBooks=" + listOfBooks +
                '}';
    }
}
