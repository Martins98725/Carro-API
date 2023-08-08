package com.example.APICarro.exceptions;

import java.io.Serializable;
import java.util.Date;

public class ExceptionResponse implements Serializable {
    private Date date;
    private String menssage;
    private String detais;

    public ExceptionResponse(Date date, String menssage, String detais) {
        this.date = date;
        this.menssage = menssage;
        this.detais = detais;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMenssage() {
        return menssage;
    }

    public void setMenssage(String menssage) {
        this.menssage = menssage;
    }

    public String getDetais() {
        return detais;
    }

    public void setDetais(String detais) {
        this.detais = detais;
    }
}
