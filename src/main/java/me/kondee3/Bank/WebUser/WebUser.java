package me.kondee3.Bank.WebUser;


import jakarta.persistence.*;
import org.hibernate.annotations.UuidGenerator;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table()
public class WebUser {
    @Id
    @UuidGenerator
    private UUID id;
    private String username;
    private String email;
    private LocalDate dateofbirth;



    private String password;

    public WebUser() {
    }

    public WebUser(String username, String email, LocalDate dateofbirth, String password) {
        this.username = username;
        this.email = email;
        this.dateofbirth = dateofbirth;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(LocalDate dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
