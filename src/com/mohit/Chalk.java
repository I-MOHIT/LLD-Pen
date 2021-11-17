package com.mohit;

import java.util.UUID;

public class Chalk implements Writable{
    private String Id;
    private String color;

    public Chalk(String color) {
        String Id = UUID.randomUUID().toString();
        this.color = color;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void write(){
        System.out.println("Written by a chalk with Id " + this.Id + " which has the color " + this.color + "\n");
    }
}
