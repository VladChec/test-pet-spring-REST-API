package com.example.petrestapi.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;
//import jakarta.validation.constraints.Min;
//import jakarta.validation.constraints.NotEmpty;
//import jakarta.validation.constraints.Size;

@Entity
@Table(name = "Person2")
//@Data
public class Person {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotEmpty(message = "Имя не должно быть пустым")
    @Size(min = 2, max = 100, message = "Имя должно быть от 2 до 100 символов длиной")
    @Column(name = "name")
    private String username;

    @Min(value = 0, message = "Год рождения должен быть больше, чем 1900")
    @Column(name = "age")
    private int age;

    public Person(){}

    public Person(String username, int age) {
        this.username = username;
        this.age = age;
    }

    @Column(name = "email")
    @NotEmpty(message = "Not!!!!")
    @Email
    private String email;

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }




}
