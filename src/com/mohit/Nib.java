package com.mohit;

import java.util.UUID;

public class Nib {
    private String nibId;

    public Nib(){
        nibId = UUID.randomUUID().toString();
    }

    public String getNibId() {
        return nibId;
    }

    public void setNibId(String nibId) {
        this.nibId = nibId;
    }
}
