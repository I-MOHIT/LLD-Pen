package com.mohit;

import java.util.UUID;

public class RefillPipe {
    private String refillPipeId;
    private Ink ink;
    private Nib nib;

    public RefillPipe(Ink ink, Nib nib){
        refillPipeId = UUID.randomUUID().toString();
        this.ink = ink;
        this.nib = nib;
    }

    public String getRefillPipeId() {
        return refillPipeId;
    }

    public void setRefillPipeId(String refillPipeId) {
        this.refillPipeId = refillPipeId;
    }

    public Ink getInk() {
        return ink;
    }

    public void setInk(Ink ink) {
        this.ink = ink;
    }

    public Nib getNib() {
        return nib;
    }

    public void setNib(Nib nib) {
        this.nib = nib;
    }
}
