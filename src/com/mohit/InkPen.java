package com.mohit;

import java.util.UUID;

public class InkPen extends Pen{
    private String Id;
    private Ink ink;
    private Nib nib;

    public InkPen(Ink ink, Nib nib) {
        Id = UUID.randomUUID().toString();
        this.ink = ink;
        this.nib = nib;
    }

    @Override
    public void write(){
        System.out.println("Written by an Ink Pen with the ID " + this.Id + " which uses the ink " + this.ink.getInkId() + " and the nib " + this.nib.getNibId() + "\n");
    }

    @Override
    public void refill(){
        System.out.println("Refilling the Ink Pen with the ID " + this.Id + " which uses the ink " + this.ink.getInkId() + " and the nib " + this.nib.getNibId() + "\n");
    }
}
