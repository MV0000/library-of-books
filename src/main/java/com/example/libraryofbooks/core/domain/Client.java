package com.example.libraryofbooks.core.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "clients")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Client extends Account {

    @Id
    @Column(name = "clienbtId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientID;

    @Column(name = "clientFirstName")
    private String clientFirstName;

    @Column(name = "clientLastName")
    private String clientLastName;

    @Column(name = "bookId")
    private Long bookId;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Client)) return false;

        Client client = (Client) o;

        if (clientID != null ? !clientID.equals(client.clientID) : client.clientID != null) return false;
        if (clientFirstName != null ? !clientFirstName.equals(client.clientFirstName) : client.clientFirstName != null)
            return false;
        if (clientLastName != null ? !clientLastName.equals(client.clientLastName) : client.clientLastName != null)
            return false;
        return bookId != null ? bookId.equals(client.bookId) : client.bookId == null;
    }

    @Override
    public int hashCode() {
        int result = clientID != null ? clientID.hashCode() : 0;
        result = 31 * result + (clientFirstName != null ? clientFirstName.hashCode() : 0);
        result = 31 * result + (clientLastName != null ? clientLastName.hashCode() : 0);
        result = 31 * result + (bookId != null ? bookId.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientID=" + clientID +
                ", clientFirstName='" + clientFirstName + '\'' +
                ", clientLastName='" + clientLastName + '\'' +
                ", bookId=" + bookId +
                '}';
    }
}
