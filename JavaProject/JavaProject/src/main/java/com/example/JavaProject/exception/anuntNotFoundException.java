package com.example.JavaProject.exception;

public class anuntNotFoundException extends RuntimeException{

    public anuntNotFoundException(Long id){
        super("Anuntul cu id-ul " + id + " nu exista");
    }
}
