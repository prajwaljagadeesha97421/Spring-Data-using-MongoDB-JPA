package com.upgrad.movie.entity;

import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Setter
@Getter
public class Customer {
    @Id
    private int customerId;

    private String firstName;

    private String lastName;

    private String userName;

    private String password;

    private LocalDateTime dateOfBirth;

    public Customer(int customerId, String firstName, String lastName, String userName, String password, LocalDateTime dateOfBirth) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
