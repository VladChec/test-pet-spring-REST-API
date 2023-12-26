package com.example.petrestapi.util;

public class PersonNotCreatedException extends RuntimeException{
    public  PersonNotCreatedException(String msg){
        super(msg);
    }
}
