package com.example.APICarro.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResorceNotFoundExcepetions extends RuntimeException{
    public ResorceNotFoundExcepetions(String ex){
        super(ex);
    }
}
