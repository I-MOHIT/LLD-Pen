package com.mohit;

import java.util.UUID;

public class Ink {
    private String inkId;

    public Ink(){
        inkId = UUID.randomUUID().toString();
    }

    public String getInkId() {
        return inkId;
    }

    public void setInkId(String inkId) {
        this.inkId = inkId;
    }
}
