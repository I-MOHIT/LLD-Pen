package com.mohit;

import java.util.UUID;

public class BallPen extends Pen{
    private String Id;
    private RefillPipe refillPipe;

    public BallPen(RefillPipe refillPipe) {
        Id = UUID.randomUUID().toString();
        this.refillPipe = refillPipe;
    }

    @Override
    public void write(){
        System.out.println("Written by a Ball Pen with the ID " + this.Id + " which uses the refill " + this.refillPipe.getRefillPipeId() + "\n");
    }

    @Override
    public void refill(){
        System.out.println("Replaced the refill pipe in a Ball Pen with the ID " + this.Id + " where the new refill is " + this.refillPipe.getRefillPipeId() + "\n");
    }
}
